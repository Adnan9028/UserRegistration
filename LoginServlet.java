package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/log")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		String userName = req.getParameter("un");
		String password = req.getParameter("pw");

		UserBean ub = new LoginDAO().login(userName, password);

		if (ub == null) 
		{
			req.setAttribute("msg", "Invalid login process...<br>");
			RequestDispatcher rd = req.getRequestDispatcher("Fail.jsp");
			rd.forward(req, res);
		} 
		else 
		{
			ServletContext sc = req.getServletContext();
			sc.setAttribute("uBean", ub);

			Cookie ck = new Cookie("fName", ub.getFname());
			res.addCookie(ck);

			req.getRequestDispatcher("LogSuccess.jsp").forward(req, res);
		}

	}
}
