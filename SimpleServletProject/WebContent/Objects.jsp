<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Objects</title>
</head>
<body>

	<% 
	String userName=request.getParameter("name");
	
	if(userName != null){
		session.setAttribute("sessionUserName", userName);
		//application.setAttribute("applicationUserName", userName);
		pageContext.setAttribute("pageContextUserName", userName);
		pageContext.setAttribute("applicationUserName", userName, PageContext.APPLICATION_SCOPE);
		pageContext.findAttribute("name");
	}
	%>
	<br>
	Username v request objektu je: <%=userName %>
	<br>
	username v session objektu je: <%=session.getAttribute("sessionUserName") %>
	<br>
	Username v application context objektu je: <%=application.getAttribute("applicationUserName") %>
	<br>
	Username v pageContext objektu je:<%=pageContext.getAttribute("pageContextUserName") %>
</body>
</html>