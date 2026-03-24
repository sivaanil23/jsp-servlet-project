<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%List <String> list=new ArrayList<String>();
list.add("hello");
list.add("Hii");
list.add("How r U");
list.add("fyne");
list.add("ok Get Out");
for(int i=0;i<list.size();i++){
	
%>
MOTU Pattulu
<h3><%=list.get(i) %></h3>
<%} %>

</body>
</html>