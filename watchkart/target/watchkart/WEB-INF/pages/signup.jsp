<%-- <%@include file="/WEB-INF/pages/header.jsp"%> --%>
<%-- <%@include file="/WEB-INF/pages/navbar.jsp"%> --%>

<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" --%>
<%--     pageEncoding="ISO-8859-1"%> --%>
<%-- <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%> --%>
<%-- <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> --%>
<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<%--  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<!-- <html> -->

<!-- <title>Insert title here</title> -->
<!-- </head> -->
<!-- <body> -->



<!--  <div class="container-fluid image"> -->
  
<!--   <div class="text-center"> -->
<!--   <h3 style="color: blue; class="text-center"><strong>SIGNUP</strong></h3> -->
<%--       <form:form modelAttribute="user" action="insertuser" method="POST"> --%>
<!--       <div class="form-group"> -->
<!-- 		<label for="name" class="col-sm-2 control-label"> Name:</label> -->
<!-- 		<div class="col-sm-8"> -->
<%-- 			<form:input path="name" value="${user.name}" cssClass="form-control" --%>
<%-- 				title="Enter user name"  /> --%>
<!-- 		</div> -->
<!-- 	</div> -->
<!-- 	 <div class="form-group"> -->
<!-- 		<label for="address" class="col-sm-2 control-label"> Address:</label> -->
<!-- 		<div class="col-sm-8"> -->
<%-- 			<form:input path="address" value="${user.address}" cssClass="form-control" --%>
<%-- 				title="Enter address"  /> --%>
<!-- 		</div> -->
<!-- 	</div> -->
<!-- 	 <div class="form-group"> -->
<!-- 		<label for="phoneno" class="col-sm-2 control-label"> Phone No:</label> -->
<!-- 		<div class="col-sm-8"> -->
<%-- 			<form:input path="phoneno" value="${user.phoneno}" cssClass="form-control" --%>
<%-- 				title="Enter phone number" /> --%>
<!-- 		</div> -->
<!-- 	</div> -->
<!-- 	 <div class="form-group"> -->
<!-- 		<label for="uid" class="col-sm-2 control-label"> User Id:</label> -->
<!-- 		<div class="col-sm-8"> -->
<%-- 			<form:input path="uid" value="${user.uid}" cssClass="form-control" --%>
<%-- 				title="Enter user id" required="true" /> --%>
<!-- 		</div> -->
<!-- 	</div> -->
<!-- 	 <div class="form-group"> -->
<!-- 		<label for="pwd" class="col-sm-2 control-label"> Password:</label> -->
<!-- 		<div class="col-sm-8"> -->
<%-- 			<form:input path="pwd" value="${user.pwd}" cssClass="form-control" --%>
<%-- 				title="Enter password" required="true" /> --%>
<!-- 		</div> -->
<!-- 	</div> -->
<!-- 	<div class="form-group"> -->
<!-- 		<label for="remarks" class="col-sm-2 control-label"> Remarks:</label> -->
<!-- 		<div class="col-sm-8"> -->
<%-- 			<form:input path="remarks" value="${user.remarks}" cssClass="form-control" --%>
<%-- 				title="Enter remarks"/> --%>
<!-- 		</div> -->
<!-- 	</div> -->
<!-- 	<div class="form-group text-center"> -->
<!-- 		<input class="btn btn-primary" type="submit" value="Register"  /> -->
<!-- 	</div> -->
<%--       </form:form> --%>
    
<!--       </body> -->
<%@include file="/WEB-INF/pages/header.jsp"%>
<%@include file="/WEB-INF/pages/navbar.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<title>Insert title here</title>
</head>
<body>



 <div class="container-fluid image">
  
  <div class="text-center">
  <h3 style="color: blue; class="text-center"><strong>SIGNUP</strong></h3>
  </div>
<br>
<br>
<form:form modelAttribute="user" cssClass="form-horizontal" action="insertuser"  method="POST">

	<div class="form-group">
		<label for="name" class="col-sm-2 control-label"> Name:</label>
		<div class="col-sm-8">
			<form:input path="name" value="${user.name}"
				cssClass="form-control" title="Enter product name" required="true" />
		</div>
	</div>
	
	
	<div class="form-group">
		<label for="uid" class="col-sm-2 control-label">ID:</label>
		<div class="col-sm-8">
			<form:input path="uid" value="${user.uid}"
				cssClass="form-control" title="Enter product id" required="true" />
		</div>
	</div>
	
	<div class="form-group">
		<label for="pwd" class="col-sm-2 control-label"> Password:</label>
		<div class="col-sm-8">
			<form:input type="numbers" path="pwd" value="${user.pwd}"
				cssClass="form-control" title="Enter price of the product" required="true"/>
		</div>
	</div>
	<div class="form-group">
		<label for="phoneno" class="col-sm-2 control-label"> Number:</label>
		<div class="col-sm-8">
			<form:input path="phoneno" type="numbers" value="${user.phoneno}"
				cssClass="form-control" title="Enter the number" required="true"/>
		</div>
	</div>
	<div class="form-group">
		<label for="remarks" class="col-sm-2 control-label"> Remarks:</label>
		<div class="col-sm-8">
			<form:input path="remarks" type="text" value="${user.remarks}" cssClass="form-control"
				title="Enter remarks" required="true"/>
		</div>
       <div class="form-group"><center>
<br/>
<br/>
<br/>
		<input type="submit" value="SAVE" class="btn btn-success " /></center>
	</div>

</form:form>
<div class="text-center">
<a href="Landing"  class="btn btn-primary" role="button">BACK</a>
</div>


