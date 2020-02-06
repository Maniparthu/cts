<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${liststud }
 <table border="1px">
	   <tr>
	      <th>ID:</th>
	      <th>NAME:</th>
	       
	   </tr>
	   <c:forEach var="student" items="${liststud}">
	   <tr>
	     <td>${student.id}</td>
	     <td>${student.name}</td>
	     
	   </tr>
	   </c:forEach>
	</table>
</body>
</html>
