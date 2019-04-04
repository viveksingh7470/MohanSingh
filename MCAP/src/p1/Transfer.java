package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Transfer
 */
public class Transfer extends HttpServlet 
{
	public void service(HttpServletRequest request, HttpServletResponse response)
	{
		String saccno =request.getParameter("saccno");
		String amt =request.getParameter("amt");
		HttpSession session = request.getSession();
		String accno =(String) session.getAttribute("accno");
		
		Model m = new Model();
		m.setSaccno(saccno);
		m.setAmt(amt);
		m.setAccno(accno);
		
		boolean status = m.transfer();
		if(status==true)
		{
			try
			{
				response.sendRedirect("/MCAP//successTransfer.jsp");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			try
			{
				response.sendRedirect("/MCAP/failTransfer.jsp");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
