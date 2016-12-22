<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<spring:url value="/resources/js/ proController.js " var="aa"/><script src="${aa}"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Watchkart</title>
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css">

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%-- <spring:url value="/resources/css/bootstrap.min.css" var="boot" /> --%>
<%-- <link rel="stylesheet" href="${boot}"> --%>
<spring:url value="/resources/css/style.css" var="style" />
<link rel="stylesheet" href="${style}">

<link rel="stylesheet" href="${boot}">
<spring:url value="/resources/css/font-awesome.min.css" var="style" />
<link rel="stylesheet" href="${style}">

<!-- <link rel="stylesheet"  -->
<!-- 	href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">  -->

<%--     <spring:url value="/resources/css/bootstrap.css" var="boot"/><link rel="stylesheet" href="${boot}"> --%>
<%--         <spring:url value="/resources/css/style1.css" var="style"/><link rel="stylesheet" href="${style}"> --%>

</head>
<body>
	
