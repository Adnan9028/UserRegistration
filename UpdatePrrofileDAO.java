package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePrrofileDAO
{
	public int k=0;
	
	public int update(UserBean ub)
	{
		Connection con=DBConnection.getCon();
		try 
		{
			PreparedStatement ps = con.prepareStatement("update userReg58 set ADDRESS=?,MAILID=?,PHNO=? where USERENAME=? and password=?");
			ps.setString(1, ub.getAddress());
			ps.setString(2, ub.getMailId());
			ps.setLong(3, ub.getPhNo());
			ps.setString(4, ub.getUserName());
			ps.setString(5, ub.getPassword());
			k=ps.executeUpdate();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return k;
	}
}
