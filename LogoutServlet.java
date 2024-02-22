package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		Cookie []ck=req.getCookies();
		if(ck==null)
		{
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Fail.jsp").forward(req, res);			
		}
		else
		{
			ck[0].setMaxAge(0);
			req.setAttribute("msg", "Logged out Successfully...<br>");
			req.getRequestDispatcher("Fail.jsp").forward(req, res);
		}
	}
}
	
