package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		Cookie [] ck=req.getCookies();
		if(ck==null)
		{
			req.setAttribute("msg", "Session Expire...<br>");
			req.getRequestDispatcher("Fail.jsp").forward(req, res);			
		}
		else
		{
			String fName=ck[0].getValue();
			req.setAttribute("fName", fName);
			UserBean ub=(UserBean) req.getServletContext().getAttribute("uBean");
			ub.setAddress(req.getParameter("add"));
			ub.setMailId(req.getParameter("mid"));
			ub.setPhNo(Long.parseLong(req.getParameter("phno")));
			int k=new UpdatePrrofileDAO().update(ub);
			if(k>0)
			{
				req.setAttribute("msg", "Profile Updated Successfully...<br>");
				req.getRequestDispatcher("UpdateProfile.jsp").forward(req, res);
			}
		}
	}
}
