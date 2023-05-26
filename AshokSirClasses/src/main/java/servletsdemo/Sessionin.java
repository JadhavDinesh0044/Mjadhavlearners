package servletsdemo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Sessionin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId = request.getParameter("userid");

		// retrive the session obj, if one exist. If does not exist, create a new empty
		// session.
		HttpSession session = request.getSession();

		session.setAttribute("userid", userId);

		response.sendRedirect("dashboard");

	}

}