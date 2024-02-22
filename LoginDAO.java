package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO
{
	UserBean ub=null;
	public UserBean login(String userNamer,String password)
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("Select * from UserReg58 where userename=? and password=?");
			ps.setString(1, userNamer);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				ub=new UserBean();
				ub.setUserName(rs.getString(1));
				ub.setPassword(rs.getString(2));
				ub.setFname(rs.getString(3));
				ub.setLname(rs.getString(4));
				ub.setAddress(rs.getString(5));
				ub.setMailId(rs.getString(6));
				ub.setPhNo(Long.parseLong(rs.getString(7)));
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return ub;
		
	}
}
