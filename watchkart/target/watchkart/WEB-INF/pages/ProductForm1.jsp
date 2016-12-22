<%@include file="/WEB-INF/pages/header.jsp"%>
<%@include file="/WEB-INF/pages/navbar1.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<title>Supplier Product</title>

</head>
<body>
   




<h1 class="text-center">Add Products</h1>
<br />
<br />
<form:form modelAttribute="product" cssClass="form-horizontal"
	action="insertprod?${_csrf.parameterName}=${_csrf.token}" enctype="multipart/form-data" method="POST">

	<div class="form-group">
		<label for="pid" class="col-sm-2 control-label"> Product Id:</label>
		<div class="col-sm-8">
			<form:input path="pid" value="${product.pid}" cssClass="form-control"
				title="Enter product id" required="true" />
		</div>
	</div>

	<div class="form-group">
		<label for="pname" class="col-sm-2 control-label"> Name:</label>
		<div class="col-sm-8">
			<form:input path="pname" value="${product.pname}"
				cssClass="form-control" title="Enter product name" required="true" />
		</div>
	</div>
	<div class="form-group">
		<label for="pcategoryid" class="col-sm-2 control-label">
			Category:</label>
		<div class="col-sm-8">
			<form:select path="pcategoryid" value="${product.pcategoryid}" cssClass="form-control"
				title="Enter product category id"  >
				 <c:forEach var="cat" items="${list}" varStatus="status">
				<form:option value="${cat.categoryid}">${cat.name}</form:option>
				</c:forEach>
				</form:select>
		</div>
	</div>
	<div class="form-group">
		<label for="pprice" class="col-sm-2 control-label"> Price:</label>
		<div class="col-sm-8">
			<form:input type="numbers" path="pprice" value="${product.pprice}"
				cssClass="form-control" title="Enter price of the product" required="true"/>
		</div>
	</div>
	<div class="form-group">
		<label for="pstatus" class="col-sm-2 control-label"> Status:</label>
		<div class="col-sm-8">
			<form:input path="pstatus" type="numbers" value="${product.pstatus}"
				cssClass="form-control" title="Enter stock of the product" required="true"/>
		</div>
	</div>
	<div class="form-group">
		<label for="poffer" class="col-sm-2 control-label"> Offer:</label>
		<div class="col-sm-8">
			<form:input path="poffer" type="text" value="${product.poffer}" cssClass="form-control"
				title="Enter offer to the product" required="true"/>
		</div>
	</div>
	<div class="form-group">
		<label for="psupplierid" class="col-sm-2 control-label"> Supplier Id:</label>
		<div class="col-sm-8">
			<form:input path="psupplierid" type="text" value="${product.psupplierid}" cssClass="form-control"
				title="Enter psupplierid of the product" required="true"/>
		</div>
	</div>
	< <div class="form-group">
		<label for="img" class="col-sm-2 control-label">Upload Image:</label>
		<div class="col-sm-8">
			<form:input path="img" value="${product.img}" type="file" cssClass="form-control"/>
		</div>
	</div>
	<div class="form-group text-center">
		<input type="submit" value="SAVE" class="btn btn-primary " />
	</div>

</form:form>
<spring:url value="/resources/js/jquery.js" var="jq" />
<script src="${jq}"></script>
<spring:url value="/resources/js/angular.min.js" var="a" />
<script src="${a}"></script>
<spring:url value="/resources/js/admincontroller.js" var="aa" />
<script src="${aa}"></script>
<%@include file="/WEB-INF/pages/footer.jsp"%>
</body>

