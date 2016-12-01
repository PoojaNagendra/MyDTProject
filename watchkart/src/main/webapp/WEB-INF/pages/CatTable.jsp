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

<h3>Category List</h3>
<table border="1">
<tr><th>Category Id</th><th>Category Name</th></th></tr>
<c:forEach var="cat" items="${category}" varStatus="status">
<tr>
<td>${cat.cid}</td>
<td>${cat.cname}</td>
<td><a href="#">EDIT</a></td>
<td><a href="delCat?cid=${cat.cid}">DELETE</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>