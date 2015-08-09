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

<p>getMessage from products Controller</p>
<p> ${getMessage}</p>

<table border="1">
<c:forEach var="product" items="${proProduct}" >
<th>ProductId</th>
<th>ProductName</th>
<th>ProductPrice</th>
<th>ProductGuid</th>
<th>ProductQuntity</th>
<th>subCategoryId</th>
<th>ProductOfferPrice</th>
<th>procuctDesc</th>

<tr>
<td>${product.productId}</td>
<td>${product.productname}</td>
<td>${product.productPrice}</td>
<td>${product.productGuid}</td>
<td>${product.productQuntity}</td>
<td>${product.subCategoryId}</td>
<td>${product.productOfferPrice}</td>
<td>${product.procuctDesc}</td>
</tr>
</c:forEach>
</table>
</body>
</html>