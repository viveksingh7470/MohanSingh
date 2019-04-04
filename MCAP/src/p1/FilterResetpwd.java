package p1;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class FilterResetpwd
 */
public class FilterResetpwd implements Filter 
{

    /**
     * Default constructor. 
     */
    public FilterResetpwd() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String newpwd = request.getParameter("newpwd");
		String cnewpwd = request.getParameter("cnewpwd");
		
		if(newpwd.equals(cnewpwd))
		{
			chain.doFilter(request,response);
		}
		else
		{
			((HttpServletResponse) response).sendRedirect("/MCAP/errorResetPwd.jsp");
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
