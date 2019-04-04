package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet 
{
	public void service(HttpServletRequest  request,HttpServletResponse response) 
	{
		String custid= request.getParameter("custid");
		String pw= request.getParameter("pw");
		Model m=new Model();
		m.setCustid(custid);
		m.setPw(pw);
		boolean x=m.login();
		String psd = m.getPw();
		if(psd.equals(pw))
		{
			HttpSession session =request.getSession(true);
			String accno=m.getAccno();
			session.setAttribute("accno", accno);
			if(x==true)
			{
				try
				{
					response.sendRedirect("/MCAP/home.jsp");
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
					response.sendRedirect("/MCAP/faillogin.jsp");
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}

}
