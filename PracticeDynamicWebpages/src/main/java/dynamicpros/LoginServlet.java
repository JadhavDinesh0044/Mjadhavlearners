package dynamicpros;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Hard-coded valid email and password
        String validEmail = "jadhav@gmail.com";
        String validPassword = "password";

        if (email.equals(validEmail) && password.equals(validPassword)) {
            // Valid login, redirect to the dashboard
            response.sendRedirect("dashboard.html");
        } else {
            // Invalid login, show error message
            response.sendRedirect("error.html");
	}
	}

}
