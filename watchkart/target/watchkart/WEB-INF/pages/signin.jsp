<%@include file="/WEB-INF/pages/header.jsp"%>
</head>
<body>
	<nav class="navbar navbar-default">
     <div class="container-fluid">
       <!-- Brand and toggle get grouped for better mobile display -->
         <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
               <span class="sr-only">Toggle navigation</span>
               <span class="icon-bar"></span>
               <span class="icon-bar"></span>
               <span class="icon-bar"></span>
              </button>
            <a class="navbar-brand" href="#">WatchKart.com</a>
         </div>

         <a href="signin" class="btn btn-primary button1">Sign in</a>
         <a href="signup" class="btn btn-primary button">Sign up</a>
     </div>
    </nav>
    
	<form name='loginForm'
			action="<c:url value='/j_spring_security_check' />" method='POST'>
		<div class="form-group form-regis">
			<h1 align="center">Sign In</h1>
			<label class="control-label col-sm-2" >User 
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
				<input type="submit" class="btn btn-success" value="Login">

				</div>	
			
				</div>						
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />					
	</form>

</body>



