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

<h3>UserDetails List</h3>
<table border="1">
<tr><th>Users Id</th><th>Password</th><th>Name</th><th>Address</th><th>Phone Number</th></tr>
<c:forEach var="userdetails" items="${userdetails}" varStatus="status">
<tr>
<td>${userdetails.uid}</td>
<td>${userdetails.pwd}</td>
<td>${userdetails.name}</td>
<td>${userdetails.address}</td>
<td>${userdetails.phoneno}</td>
<td>${userdetails.remarks}</td>
<td>${userdetails.houseno}</td>
<td>${userdetails.street}</td>
<td>${userdetails.city}</td>
<td>${userdetails.pincode}</td>
<td>${userdetails.state}</td>
<td>${userdetails.country}</td>
<td><a href="#">EDIT</a></td>
<td><a href="delUserDetails?uid=${userdetails.uid}">DELETE</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>