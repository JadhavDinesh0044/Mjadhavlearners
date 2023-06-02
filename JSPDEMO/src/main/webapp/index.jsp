<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello World Jsp</h1>
<%out.println("Today is Sunday :"  + new java.util.Date()); %>




<br><br>
JSP Expressions Demo<br>
<%= java.util.Calendar.getInstance().getTime()%>

<br><br>
JSP Declaration Demo<br>
<%! int data=100; 
	
	public int getSomeNumber(){
		return 1500;
	}


%>

<%= "Value is:"+data %> 
<%= "NUmber  is:"+getSomeNumber() %>

</body>
</html>