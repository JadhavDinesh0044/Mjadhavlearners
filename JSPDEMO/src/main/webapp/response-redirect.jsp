<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<h3> Inside response-redirect.jsp</h3>

 <%
	String office = request.getParameter("office");
 
	if (office != null)
		out.println("value of Office obtained :" + office + " <br>");
	else
		out.println("No value of Office found <br>");
%>