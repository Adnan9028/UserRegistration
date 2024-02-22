package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDAO 
{
	int k = 0;

	public int register(UserBean ub) 
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into userReg58 values(?,?,?,?,?,?,?)");

			ps.setString(1, ub.getUserName());
			ps.setString(2, ub.getPassword());
			ps.setString(3, ub.getFname());
			ps.setString(4, ub.getLname());
			ps.setString(5, ub.getAddress());
			ps.setString(6, ub.getMailId());
			ps.setLong(7, ub.getPhNo());
			k = ps.executeUpdate();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return k;
	}
}
