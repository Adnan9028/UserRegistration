package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		Cookie[] ck = req.getCookies();
		if (ck == null)
		{
			req.setAttribute("msg", "Session expire...<br>");
			req.getRequestDispatcher("Fail.jsp").forward(req, res);
		}
		else 
		{
			String fname = ck[0].getValue();
			req.setAttribute("fName", fname);
			req.getRequestDispatcher("ViewProfile.jsp").forward(req, res);
		}
	}
}
