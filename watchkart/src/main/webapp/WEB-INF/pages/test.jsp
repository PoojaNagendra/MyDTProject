<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/style.css">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<spring:url value="/resources/css/bootstrap.css" var="boot" />
<link rel"stylesheet" href="${boot}">
<spring:url value="/resources/css/style.css" var="style" />
<link rel="stylesheet" href="${style}">
<link rel="stylesheet"
	href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">

</head>
<body>

   <form:form commandName="userd"  cssClass="form-horizontal" action="addinguser" method="POST">     
  <div class="form-group form-regis">
 
       <h1 align="center" >REGISTER</h1>
    <label class="control-label col-sm-2" for="First Name">User Name</label>
    <div class="col-sm-10">
      <input type="User Name" class="form-control" id="User Name" placeholder="user name"><br>
    </div>
  
    <label class="control-label col-sm-2" for="Last Name">Password</label>
    <div class="col-sm-10"> 
      <input type="Password" class="form-control" id="Password" placeholder="password"><br>
    </div>
 
  
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-success" >REGISTER</button>
    </div>
  </div>
</form:form>

