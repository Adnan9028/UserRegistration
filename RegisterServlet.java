package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		UserBean ub=new UserBean();
		ub.setUserName(req.getParameter("un"));
		ub.setPassword(req.getParameter("pw"));
		ub.setFname(req.getParameter("fn"));
		ub.setLname(req.getParameter("ln"));
		ub.setAddress(req.getParameter("add"));
		ub.setMailId(req.getParameter("mid"));
		ub.setPhNo(Long.parseLong(req.getParameter("phno")));
		
		int k = new RegisterDAO().register(ub);
		if(k>0)
		{
			req.setAttribute("msg", "Registered successfully...<br>");
			RequestDispatcher rd = req.getRequestDispatcher("Register.jsp");
			rd.forward(req, res);
		}
	}
}
