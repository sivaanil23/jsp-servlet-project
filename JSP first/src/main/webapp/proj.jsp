<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>hello this from jsp</h1>
<%! static int a=10;
public static int square(int num){
return num * num;
}
%> <!-- from declartion  -->
<%
int b=9;
String name="COCO";
%>
<%= square(2) %>
<%= name %>
<%= b %>
<%= a %>
</body>
</html>