package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CheckBalance
 */
public class CheckBalance extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response)
	{
		HttpSession session = request.getSession();
		String accno = (String) session.getAttribute("accno");
		Model m = new Model();
		m.setAccno(accno);
		m.checkBalance();
		String balance = m.getBalance();
		session.setAttribute("balance", balance);
		try
		{response.sendRedirect("/MCAP/checkBalanceDisp.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			}
	}
}
