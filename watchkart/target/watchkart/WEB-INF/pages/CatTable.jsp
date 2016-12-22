<%@include file="/WEB-INF/pages/header.jsp"%>
<%@include file="/WEB-INF/pages/navbar1.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

     </head>
     <body>
 
     <div class="text-center"><h3>Add Category</h3></div>
    
     <br>
     <br>
     <div class="container">
      <form:form  modelAttribute="order" cssClass="form-horizontal" method="POST" action="addcategory">
    
	<div class="form-group">
		<label for="cid" class="col-sm-2 control-label"> ID:</label>
		<div class="col-sm-8">
			<form:input path="cid" value="${order.cid}" 
			cssClass="form-control" title="Enter the category ID" required="true" />
		</div>
	</div>
	

	<div class="form-group">
		<label for="cname" class="col-sm-2 control-label"> Name:</label>
		<div class="col-sm-8">
			<form:input path="cname" value="${order.cname}"
				cssClass="form-control" title="Enter category name" required="true" />
		</div>
	</div>
	
	
  <br>
   
  <div class="text-center">
 <input  class="btn btn-primary" type="submit" value="SUBMIT"/>
     </div>
     
      <br>
     
     
      <div  class="text-center" >
      <a href="returnback" class="btn btn-primary" role="button">BACK</a>
     </div>
     
     <br>
     <br>
  </form:form>
     </div>
     </body>