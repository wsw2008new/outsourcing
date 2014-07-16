package com.zh.base.model.bean;

import java.util.Date;

import com.zh.core.model.IDataObject;

public class Resourceinfo extends IDataObject{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_RESOURCEINFO.ID
     *
     * @mbggenerated Thu Jul 10 14:07:43 CST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_RESOURCEINFO.NAME
     *
     * @mbggenerated Thu Jul 10 14:07:43 CST 2014
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_RESOURCEINFO.VALUE
     *
     * @mbggenerated Thu Jul 10 14:07:43 CST 2014
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_RESOURCEINFO.TYPE
     *
     * @mbggenerated Thu Jul 10 14:07:43 CST 2014
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_RESOURCEINFO.CREATETIME
     *
     * @mbggenerated Thu Jul 10 14:07:43 CST 2014
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_RESOURCEINFO.UPDATETIME
     *
     * @mbggenerated Thu Jul 10 14:07:43 CST 2014
     */
    private Date updatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_RESOURCEINFO.ENABLED
     *
     * @mbggenerated Thu Jul 10 14:07:43 CST 2014
     */
    private String enabled;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	@Override
	public boolean equals(Object obj) {
		boolean bool = false;
		if(obj instanceof Resourceinfo)
		{
			Resourceinfo resourceinfo = (Resourceinfo)obj;
			if(id != null &&  null != resourceinfo.getId())
			{
				if(id.equals(resourceinfo.getId()))
				{
					bool = true;
				}
			}else 
			{
				if(null != type && null != resourceinfo.getType())
				{
					if(type.equals(resourceinfo.getType()))
					{
						bool = true;
					}
				}
			}
		}
		return bool;
	}

	@Override
	public int hashCode() {
		int result = 2;
		String str = "Resourceinfo";
		
	       result = str.hashCode()*result;
	       if(null != id )
	       {
	    	   result = result + (int)id;
	       }
	       if(null != type )
	       {
	    	   result = result + type.hashCode();
	       }

	       return result;
	}
   
}