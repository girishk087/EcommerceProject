<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="home.jsp">Home</a>
<form action="hello.htm">
id:<input type="text" name="id"><br>
userName:<input type="text" name="name"><br>
salary:<input type="text" name="salary"><br>
<input type="submit" value="Register">
</form>

<form action="getproducts.htm">
id:<input type="text" name="id">
<input type="submit" value="getProducts">
</form>
</body>
</html>