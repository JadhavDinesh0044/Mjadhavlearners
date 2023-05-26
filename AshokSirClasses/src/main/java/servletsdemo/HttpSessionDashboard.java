package servletsdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/dashboard")
public class HttpSessionDashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();

		// getSession(false) means don't create new session if one does not exist
		HttpSession session = request.getSession(false);

		if (session != null) {
			String userId = (String) session.getAttribute("userid");
			if (userId == null) {
				out.println("No UserId was found in session.<br>");
			} else {
				out.println("UserId obtained from session :" + userId + "<br>");
			}

		}


	}

}
