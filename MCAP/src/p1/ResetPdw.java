package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ResetPdw
 */
public class ResetPdw extends HttpServlet 
{
	public void service(HttpServletRequest request, HttpServletResponse response)
	{
		HttpSession session=request.getSession();
		String accno=(String) session.getAttribute("accno");
		String oldpwd=request.getParameter("oldpwd");
		String newpwd=request.getParameter("newpwd");
		String cnewpwd=request.getParameter("cnewpwd");
		Model m=new Model();
		m.setAccno(accno);
		m.setPwd(oldpwd);
		m.setNewpwd(newpwd);
		
		boolean status=m.resetPwd();
		if(status==true)
		{
			try {
				response.sendRedirect("/MCAP/successResetPwd.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			try {
				response.sendRedirect("/MCAP/failResetpwd.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
