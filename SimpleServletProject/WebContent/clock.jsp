<%@ page language="java" contentType="text/html; 
charset=ISO-8859-1" pageEncoding="ISO-8859-1" 
    import="java.util.Date"
    import="java.util.*"%>
<%@ page import="java.util.GregorianCalendar" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clock</title>
</head>
<body>
<!-- jsp poklican znotraj jspja -->
<%@  include file="/Hello.jsp" %>

	<b>The time is: <%=new Date() %> </b>
</body>
</html>