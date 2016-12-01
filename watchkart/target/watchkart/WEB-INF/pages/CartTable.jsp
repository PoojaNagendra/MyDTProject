<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Cart List</h3>
<table border="1">
<tr><th>Cart Id</th><th>Product Id</th><th>Product Price</th><th>Quantity</th><th>Total Amount</th></tr>
<c:forEach var="cart" items="${cart}" varStatus="status">
<tr>
<td>${cart.cid}</td>
<td>${cart.prod_id}</td>
<td>${cart.prod_price}</td>
<td>${cart.quantity}</td>
<td>${cart.total_amount}</td>
<td><a href="#">EDIT</a></td>
<td><a href="delCart?cart=${cart.cid}">DELETE</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>