<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>



<h3>Implicit Objects Demo</h3>

<%
	String responseCheck = request.getParameter("office");

	// if office parameter was set, tthen redirect the user to response-redirect.jsp
	if (responseCheck != null) {
		response.setStatus(response.SC_MOVED_TEMPORARILY); // HTTP status code 302
		response.setHeader("Location", "response-redirect.jsp?office=" + responseCheck);
	}

	// Error handling
	String errorCheck = request.getParameter("error");
	//simulate throw error
	if (errorCheck != null) {
		int x = 0;
		if (x == 0)
			throw new RuntimeException("Exception has been raised");
	}
%>
<%
	int serverPort = request.getServerPort();
	out.println("The Server is running on port " + String.valueOf(serverPort) + "<br>");

	out.println("Servlet Name is " + config.getServletName() + "<br>");

	out.println("Server Info:" + application.getServerInfo() + "<br>");

	String pageName = page.toString();
	out.println("The name of the page is " + pageName + "<br>");

	pageContext.setAttribute("userid", "John Doe");
	out.println("userId attribute from pageContext: " + pageContext.getAttribute("userid") + "<br>");
%>