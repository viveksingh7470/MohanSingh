package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ApplyLoan
 */
public class ApplyLoan extends HttpServlet 
{
	public void service(HttpServletRequest request, HttpServletResponse response)
	{
		HttpSession session =request.getSession();
		String accno = (String) session.getAttribute("accno");
		
		Model m = new Model();
		m.setAccno(accno);
		
		m.applyLoan();
		String name = m.getName();
		String email = m.getEmail();
		session.setAttribute("name",name);
		session.setAttribute("email", email);
		
		try
		{
			response.sendRedirect("/MCAP/loanDisp.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}



