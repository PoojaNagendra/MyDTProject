<%@include file="/WEB-INF/pages/header.jsp"%>

</head>
<body>
	<%@include file="/WEB-INF/pages/navbar.jsp"%>
	<form name='loginForm'
			action="<c:url value='/j_spring_security_check' />" method='POST'>>
		<div class="form-group form-regis">
			<h1 align="center">Sign In</h1>
			<label class="control-label col-sm-2" >Email
				Id:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control"  id="username" name="username"
					placeholder="Email Id"><br>
			</div>

			<label class="control-label col-sm-2" >Password:</label>
			<div class="col-sm-10">
				<input type="Password" class="form-control" id="password"  name="password"
					placeholder="Password"><br>
			</div>

			<div class="col-sm-offset-2 col-sm-10">
				<input type="submit" class="btn btn-success button1" value="Login">
				<div class="col-sm-offset-2 col-sm-10">
					
				</div>
			</div>
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
	</form>

</body>


