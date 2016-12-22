<%@include file="/WEB-INF/pages/header.jsp"%>
<%@include file="/WEB-INF/pages/navbar1.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

</head>
<body>

<div class = "text-center">
<h3>CART LIST</h3>

	<table class="table table-bordered table-striped">
<tr><th>ID</th><th>NAME</th><th>PRICE</th></tr>
<c:forEach  var="cart" items="${items}" varStatus="status">
<tr>
<td>${cart.prod_id}</td>
<td>${cart.prod_name}</td>
<td>${cart.prod_price}</td>

<div><td><a href="shipping?nam=${pageContext.request.userPrincipal.name}&cid=${cart.cid}" class="btn btn-success"> Check out</a></td></div>

<div><td><a href="abc?cid=${cart.cid}&nam=${pageContext.request.userPrincipal.name}"class="btn btn-primary" >Delete</a></td></div>
</tr>
</c:forEach>
</table>
</div>
<div class="text-center">
   <a href="userview" class="btn btn-primary" role="button">BACK</a>
</div>
</div>