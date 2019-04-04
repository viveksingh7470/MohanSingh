package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
public class Logout extends HttpServlet 
{
	public void service(HttpServletRequest request, HttpServletResponse response)
	{
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("accno"));
		session.invalidate();
		
		
		try
		{
			response.sendRedirect("/MCAP/login.jsp");
		}
		catch(Exception e)
		{
			
		}
	}
}


