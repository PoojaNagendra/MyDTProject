<%@include file="/WEB-INF/pages/header.jsp"%>
<%@include file="/WEB-INF/pages/navbar1.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        <h1 class="h">Shipping Details</h1>
      <form:form modelAttribute="ship" action="insertdetails" method="POST">
      <div class="form-group">
		<label for="name" class="col-sm-2 control-label"> Name:</label>
		<div class="col-sm-8">
			<form:input path="name" value="${ship.name}" cssClass="form-control"
				title="Enter user name"  />
		</div>
	</div>
	 <div class="form-group">
		<label for="address" class="col-sm-2 control-label"> Address:</label>
		<div class="col-sm-8">
			<form:input path="address" value="${ship.address}" cssClass="form-control"
				title="Enter address"  />
		</div>
	</div>
	 <div class="form-group">
		<label for="phoneno" class="col-sm-2 control-label"> Phone No:</label>
		<div class="col-sm-8">
			<form:input path="phoneno" value="${ship.phoneno}" cssClass="form-control"
				title="Enter phone number" />
		</div>
	</div>
	 <div class="form-group">
		<label for="uid" class="col-sm-2 control-label"> Email Id:</label>
		<div class="col-sm-8">
			<form:input path="uid" value="${ship.uid}" cssClass="form-control"
				title="Enter email id" required="true" />
		</div>
	</div>
	 <div class="form-group">
		<label for="pwd" class="col-sm-2 control-label"> Password:</label>
		<div class="col-sm-8">
			<form:input path="pwd" value="${ship.pwd}" cssClass="form-control"
				title="Enter password" required="true" />
		</div>
	</div>
	<div class="form-group">
		<label for="houseno" class="col-sm-2 control-label"> House No:</label>
		<div class="col-sm-8">
			<form:input path="houseno" value="${ship.houseno}" cssClass="form-control"
				title="Enter houseno"/>
		</div>
	</div>
	<div class="form-group">
		<label for="street" class="col-sm-2 control-label"> Street:</label>
		<div class="col-sm-8">
			<form:input path="street" value="${ship.street}" cssClass="form-control"
				title="Enter street"/>
		</div>
	</div>
		<div class="form-group">
		<label for="city" class="col-sm-2 control-label"> City:</label>
		<div class="col-sm-8">
			<form:input path="city" value="${ship.city}" cssClass="form-control"
				title="Enter city"/>
		</div>
	</div>
		<div class="form-group">
		<label for="pincode" class="col-sm-2 control-label"> Pincode:</label>
		<div class="col-sm-8">
			<form:input path="pincode" value="${ship.pincode}" cssClass="form-control"
				title="Enter pincode"/>
		</div>
	</div>
			<div class="form-group">
		<label for="state" class="col-sm-2 control-label"> State:</label>
		<div class="col-sm-8">
			<form:input path="state" value="${ship.state}" cssClass="form-control"
				title="Enter state"/>
		</div>
	</div>
		<div class="form-group">
		<label for="country" class="col-sm-2 control-label"> Country:</label>
		<div class="col-sm-8">
			<form:input path="country" value="${ship.country}" cssClass="form-control"
				title="Enter country"/>
		</div>
	</div>
	<div class="form-group text-center">
		<input type="submit" value="Continue"  />
	</div>
      </form:form>