package com.zh.base.action;

import java.util.Date;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.zh.base.model.bean.User;
import com.zh.base.service.UserInfoService;
import com.zh.base.util.MailUtil;
import com.zh.base.util.Tools;
import com.zh.core.base.action.BaseAction;
import com.zh.core.model.VariableUtil;
import com.zh.core.util.BCrypt;


public class LoginAction extends BaseAction {


	private static final long serialVersionUID = 1L;
	
	private static Logger LOGGER = LoggerFactory.getLogger(LoginAction.class); 

	// 前台传入的验证码
	private String validecode;
	
	//新密码
	private String newPassWord;

	/**
	 * 系统用户接口
	 */
	@Autowired
	private UserInfoService userInfoService;
	
	private User userInfo = new User();;


	public String excute() {
		Object user = this.getSession().getAttribute(VariableUtil.SESSION_KEY);
		if( null != user )
		{
			this.getSession().removeAttribute(VariableUtil.SESSION_KEY);
			this.getSession().removeAttribute(VariableUtil.MENULIST);
		}
		return "creater";
	}

	public String loginUser() {
		String code = (String) this.getRequest().getSession().getAttribute("code");
		if (null == validecode || null == code || !validecode.toUpperCase().equals(code)) {
			this.setErrorMessage(getText("COM.SSI.ERROR.CODE"));
			return "creater";
		}
		String password = null;
		if(null != userInfo.getUserPassword()){
			password = userInfo.getUserPassword();
		}else{
			this.setErrorMessage(getText("COM.SSI.ERROR.USERNAME"));
			return "creater";
		}
		userInfo.setUserPassword(null);
		User user = userInfoService.query(userInfo);
		
		//密码验证
		if (null != password && null != user && BCrypt.checkpw(password , user.getUserPassword())) {
			//保存当前用户信息到session中
			this.getSession().setAttribute(VariableUtil.SESSION_KEY, user);
			return "success";
		} else {
			this.setErrorMessage(getText("COM.SSI.ERROR.USERNAME"));
			return "creater";
		}
	}
	
	/***
	 * 跳转到获取密码页面
	 * @return
	 */
	public String resetPassword(){
		LOGGER.debug("resetPassword()");
		return "sendEmail";
	}
	
	/***
	 * 重置密码
	 * @return
	 */
	public String doResetPassword(){
		LOGGER.debug("doResetPassword()");
		//验证码不对，返回
		String code = (String) this.getRequest().getSession().getAttribute("code");
		if (null == validecode || null == code || !validecode.toUpperCase().equals(code)) {
			this.setErrorMessage(getText("COM.SSI.ERROR.CODE"));
			return "reset";
		}
		User user = userInfoService.query(userInfo);
		if(user != null){
			String email = user.getEmail();
			if(email != null && !email.isEmpty()){
				//发送邮件
				userInfo.setEmail(Tools.mailCover(email));
				try {
					StringBuffer text = new StringBuffer();
					text.append("http://127.0.0.1:8080/outsourcing/login/emailVerification.jspa?")
						.append("userInfo.loginName=")
						.append(userInfo.getLoginName());
					MailUtil.sendMail(email, "", "重置密码", text.toString());
				} catch (MessagingException e) {
					e.printStackTrace();
					return "error";
				}
			}else{
				return "error";
			}
		}else{
			return "error";
		}
		return "sendSuccess";
	}
	
	/***
	 * 校验邮件中的URL
	 * @return
	 */
	public String verify(){
		LOGGER.debug("verify()");
		//TODO URL校验
		return "verifySuccess";
	}
	
	/***
	 * 重置密码提交
	 * @return
	 */
	public String resetPwdSubmit(){
		LOGGER.debug("resetPwdSubmit()");
		User user = userInfoService.query(userInfo);
		//重置密码
		if(null != user && null != newPassWord  && !"".equals(newPassWord)) {
			String bcryptPassword = BCrypt.hashpw(newPassWord, BCrypt.gensalt(12));
			user.setUserPassword(bcryptPassword);
			user.setUpdateTime(new Date());
			userInfoService.update(user);
		}else{
			return "error";
		}
		
		return "success";
	}


	public String getValidecode() {
		return validecode;
	}

	public void setValidecode(String validecode) {
		this.validecode = validecode;
	}

	public Object getModel() {
		return userInfo;
	}

	public UserInfoService getUserInfoService() {
		return userInfoService;
	}

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	public User getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(User userInfo) {
		this.userInfo = userInfo;
	}

	public String getNewPassWord() {
		return newPassWord;
	}

	public void setNewPassWord(String newPassWord) {
		this.newPassWord = newPassWord;
	}
	
}
