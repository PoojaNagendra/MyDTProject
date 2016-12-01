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

<h3>Supplier List</h3>
<table border="1">
<tr><th>Supplier Id</th><th>Supplier Name</th><th>Supplier Address</th></tr>
<c:forEach var="sup" items="${supplier}" varStatus="status">
<tr>
<td>${sup.sid}</td>
<td>${sup.sname}</td>
<td>${sup.saddress}</td>
<td><a href="#">EDIT</a></td>
<td><a href="delSup?sid=${sup.sid}">DELETE</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>