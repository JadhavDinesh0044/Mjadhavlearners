package servletsdemo;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		session.invalidate();

		PrintWriter out = response.getWriter();
		out.println("You are Logged out of session.<br>");
		out.println("<a href='Logout#in.html' >Click here to login again </a>");
	}

}
