<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
   Page1<br>
   <%
      String name = (String)request.getAttribute("empname");
      int age = (Integer)request.getAttribute("empage");
      out.write(name+", "+age);      
   %>
</body>
</html>