<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test jsp</title>
</head>
<body>
<h3> Testing JSP</h3>
<%!  //deklaracija metode moreš vedno uporabit <%! z klicajem
	public int add(int a, int b){
	return a+b;
}
%>

<% 
	int i = 1;
	int j = 2;
	int k;
	
	k=i+j;
%>

Vrednost K-ja je: <%=k %>

<%
	k=add(748, 827);
%>

<br>
Vrednost K-ja je: <%=k %> !!!

<%	
	for(i = 0;i<5;i++){
%>
	<br>vrednost i = <%=i %>
<% 		
	}
%>



</body>
</html>