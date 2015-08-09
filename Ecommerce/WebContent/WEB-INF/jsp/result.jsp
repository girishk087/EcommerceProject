<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>success</p>
<p>id:${empBean.id}</p>
<p>name:${empBean.name}</p>
<p>salary:${empBean.salary}</p>


<p>updated int:${getUpdateInt}</p>
<c:forEach var="customuser" items="${listEmp}" varStatus="status">
<table border="1">
<th>id</th>
<th>name</th>
<th>salary</th>
<tr>
<td>${customuser.id}</td>
<td>${customuser.name}</td>
<td>${customuser.salary}</td>
</tr>
</table>
</c:forEach>
</body>
</html>