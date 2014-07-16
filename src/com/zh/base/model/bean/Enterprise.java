package com.zh.base.model.bean;

import com.zh.core.model.IDataObject;


public class Enterprise extends IDataObject{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_ENTERPRISE.ID
     *
     * @mbggenerated Thu Jul 10 14:07:43 CST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_ENTERPRISE.NAME
     *
     * @mbggenerated Thu Jul 10 14:07:43 CST 2014
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_ENTERPRISE.ADDRESS
     *
     * @mbggenerated Thu Jul 10 14:07:43 CST 2014
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_ENTERPRISE.PHONECALL
     *
     * @mbggenerated Thu Jul 10 14:07:43 CST 2014
     */
    private String phonecall;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_ENTERPRISE.ENABLED
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonecall() {
		return phonecall;
	}

	public void setPhonecall(String phonecall) {
		this.phonecall = phonecall;
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
		if(obj instanceof Enterprise)
		{
			Enterprise enterprise = (Enterprise)obj;
			if(this.id.toString().equals(enterprise.getId()))
			{
				bool = true;
			}
		}
		return bool;
	}

	@Override
	public int hashCode() {
		int result = 2;
		String str = "enterprise";
		
	       result = str.hashCode()*result;
	       if(null != id )
	       {
	    	   result = result + (int)id;
	       }

	       return result;
	}

}