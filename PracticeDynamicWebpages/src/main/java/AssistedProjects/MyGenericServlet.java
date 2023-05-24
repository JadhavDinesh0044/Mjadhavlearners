package AssistedProjects;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyGenericServlet
 */
@WebServlet("/MyGenericServlet")
public class MyGenericServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");
	        
	        // Write the response message
	        response.getWriter().println("<html><body>");
	        response.getWriter().println("<h2>Hello, from MyGenericServlet!</h2>");
	        response.getWriter().println("</body></html>");
	}

}
