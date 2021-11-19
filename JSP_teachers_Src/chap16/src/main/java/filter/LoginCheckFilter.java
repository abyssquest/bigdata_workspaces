package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginCheckFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, 
						 ServletResponse response, 
						 FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		HttpServletResponse httpResponse = (HttpServletResponse)response;
		HttpSession session = httpRequest.getSession();
		
		boolean login = false;
		
		if(session != null) {
			if(session.getAttribute("MEMBER") != null) {
				login = true;
				System.out.println("로그인 성공");
			}
		}
		
		if(login) {
			chain.doFilter(request, response);
		}else {
			RequestDispatcher dispatch 
				= httpRequest.getRequestDispatcher("/loginForm.jsp");
			
			dispatch.forward(request, response);
		}
	}
}








