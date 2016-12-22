<%@include file="/WEB-INF/pages/header.jsp"%>
<%@include file="/WEB-INF/pages/navbar1.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
      <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%-- <spring:url value="/resources/js/ proController.js " var="aa"/><script src="${aa}"></script> --%>
<spring:url value="/resources/js/angular.min.js" var="aa"/><script src="${aa}"></script>


<spring:url value="/resources/js/jquery.js" var="jq" />
<script src="${jq}"></script>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" text="text/css" href="css/style.css">


<spring:url value="/resources/css/bootstrap.css" var="boot" />
<link rel="stylesheet" href="${boot}">
<spring:url value="/resources/css/style.css" var="style" />
<link rel="stylesheet" href="${style}">
<link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">

<title>Insert title here</title>

<script>
 // app.js
   // var apps = angular.module('sortApps', []);
var control = angular.module('protab', []);

control.controller('mController', function($scope, $http){

	      
               $http.get('GsonCon1').success(function(data, status, headers, config) {
            	   console.log(data);
            	 
                        $scope.list = data;
                });
                        
                

                
      });


    </script>


</head>
<body>
 <h3 align="center" >User Details Table</h3>


<div class="container" ng-app="protab" ng-controller="mController">
<form class="form-group">
<input class="form-control"  placeholder="Search the List" type="search" ng-model="searchPName" />
</form>
<div ng-init="getDataFromServer()">
	<table class="table table-bordered table-striped">
	<tr>
		<th>Id</th>
		<th>Pwd</th>
		<th>Name</th>
		<th>Number</th>
		<th>Remarks</th>
	
		
	</tr>
	
	<tr ng-repeat="p in list | orderBy:sortType:sortReverse | filter:searchPName ">
	<td>{{p.uid}}</td>
	<td>{{p.pwd}}</td>
	<td>{{p.name}}</td>
	<td>{{p.phoneno}}</td>
	<td>{{p.remarks}}</td>
	
<th> <a class="btn btn-primary" href="sdelU?val={{p.uid}}">Delete</a></th>	</tr>
</table>
</br>
</br>
 <div  class="text-center" >
      <a href="returnback" class="btn btn-primary" role="button">BACK</a>
     </div>	
<br/>
</div>