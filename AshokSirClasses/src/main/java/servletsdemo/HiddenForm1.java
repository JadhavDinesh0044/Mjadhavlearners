package servletsdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HiddenForm1")
public class HiddenForm1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  PrintWriter out=response.getWriter();
		String userId = request.getParameter("userid");
      response.setContentType("text/html");
		out.println("<form action='HiddenForm2' method='POST'>");
		out.println("<input type='hidden' name='userid' id='userid' value='" + userId + "'>");
		out.println("<input type='submit' value='submit' >");
		out.println("</form>");
		out.println("<script>document.forms[0].submit();</script>");


	}
}
