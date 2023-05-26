package servletsdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HiddenForm2")
public class HiddenForm2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		PrintWriter out = response.getWriter();
  response.setContentType("text/html");
		String userId = request.getParameter("userid");

		if (userId == null) {
			out.println("No UserId was found in hidden form field.<br>");
		} else {
			out.println("UserId found in hidden form field: " + userId + "<br>");

		}
	}

}
