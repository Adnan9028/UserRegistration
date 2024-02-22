package test;

import java.io.*;
@SuppressWarnings("serial")
public class UserBean implements Serializable
{
	private String userName,password,fname,lname,address,mailId;
	private Long phNo;
	
	public UserBean()
	{
		super();
	}

	public String getUserName() 
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname()
	{
		return fname;
	}

	public void setFname(String fname)
	{
		this.fname = fname;
	}

	public String getLname() 
	{
		return lname;
	}

	public void setLname(String lname) 
	{
		this.lname = lname;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getMailId()
	{
		return mailId;
	}

	public void setMailId(String mailId)
	{
		this.mailId = mailId;
	}

	public Long getPhNo()
	{
		return phNo;
	}

	public void setPhNo(Long phNo)
	{
		this.phNo = phNo;
	}	
}
