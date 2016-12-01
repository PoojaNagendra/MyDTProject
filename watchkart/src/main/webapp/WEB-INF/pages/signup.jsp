<%@include file="/WEB-INF/pages/header.jsp"%>
<%@include file="/WEB-INF/pages/navbar.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        <h1 class="h">Register</h1>
      <form:form modelAttribute="user" action="insertuser" method="POST">
      <div class="form-group">
		<label for="name" class="col-sm-2 control-label"> Name:</label>
		<div class="col-sm-8">
			<form:input path="name" value="${user.name}" cssClass="form-control"
				title="Enter user name"  />
		</div>
	</div>
	 <div class="form-group">
		<label for="address" class="col-sm-2 control-label"> Address:</label>
		<div class="col-sm-8">
			<form:input path="address" value="${user.address}" cssClass="form-control"
				title="Enter address"  />
		</div>
	</div>
	 <div class="form-group">
		<label for="phoneno" class="col-sm-2 control-label"> Phone No:</label>
		<div class="col-sm-8">
			<form:input path="phoneno" value="${user.phoneno}" cssClass="form-control"
				title="Enter phone number" />
		</div>
	</div>
	 <div class="form-group">
		<label for="uid" class="col-sm-2 control-label"> Email Id:</label>
		<div class="col-sm-8">
			<form:input path="uid" value="${user.uid}" cssClass="form-control"
				title="Enter email id" required="true" />
		</div>
	</div>
	 <div class="form-group">
		<label for="pwd" class="col-sm-2 control-label"> Password:</label>
		<div class="col-sm-8">
			<form:input path="pwd" value="${user.pwd}" cssClass="form-control"
				title="Enter password" required="true" />
		</div>
	</div>
	<div class="form-group">
		<label for="remarks" class="col-sm-2 control-label"> Remarks:</label>
		<div class="col-sm-8">
			<form:input path="remarks" value="${user.remarks}" cssClass="form-control"
				title="Enter remarks"/>
		</div>
	</div>
	<div class="form-group text-center">
		<input type="submit" value="Register"  />
	</div>
      </form:form>