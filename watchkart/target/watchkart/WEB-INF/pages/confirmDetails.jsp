<%-- <%@include file="/WEB-INF/pages/header.jsp"%> --%>
<%-- <%@include file="/WEB-INF/pages/navbar1.jsp"%> --%>
<%-- <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> --%>

<!-- </head> -->
<!-- <body> -->
<!-- 	<div class="content"> -->
<!-- 		<fieldset> -->
<!-- 			<legend>Confirm Details</legend> -->
<!-- 			<!-- for triggering webflow events using links, -->
<!-- 					 the eventId to be triggered is given in "href" attribute as: -->
<!-- 				 --> -->
<%-- 			<a href="${flowExecutionUrl}&_eventId_home">Home</a><br /> <br /> --%>
			
<!-- 			<div class="form-group"> -->
<%-- 			<form:form modelAttribute="shipping"> --%>
<%-- 				<form:label path="name"> Name:</form:label>${shipping.name} --%>
<!-- 					<br /> -->
<!-- 				<br /> -->
<%-- 				<form:label path="phoneno">Contact No:</form:label>${shipping.phoneno} --%>
<!-- 					<br /> -->


<%-- 				<form:label path="country">Country:</form:label>${shipping.country} --%>
<!-- 					<br /> -->
<!-- 				<br /> -->
<%-- 				<form:label name="state" path="state">State:</form:label>${shipping.state} --%>
<!-- 					<br /> -->
<!-- 				<br /> -->
<%-- 				<form:label path="address">Address :</form:label>${shipping.address} --%>
<!-- 					<br /> -->
<!-- 				<br /> -->
<!-- 				<input name="_eventId_edit" type="submit" value="Edit" /> -->
<!-- 				<input name="_eventId_submit" type="submit" value="Confirm Details" /> -->
<!-- 				<br /> -->
<%-- 			</form:form> --%>
<!-- 			</div> -->
<!-- 		</fieldset> -->
<!-- 	</div> -->
<!-- </body> -->

<%@include file="/WEB-INF/pages/header.jsp"%>
<%@include file="/WEB-INF/pages/navbar1.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

</head>
<body>
	<div class="content">
		<fieldset>
			<legend>Confirm Details</legend>
			<!-- for triggering webflow events using links,
					 the eventId to be triggered is given in "href" attribute as:
				 -->
			<a href="${flowExecutionUrl}&_eventId_home">Home</a><br /> <br />
			
			<div class="form-group">
			<form:form modelAttribute="shipping">
			<h2>	<form:label path="name"> Name:</form:label>${shipping.name} </h2>
					
			<h2>	    <form:label path="phoneno">Number:</form:label>${shipping.phoneno}  </h2>
			
			<h2>       <form:label path="country">Country:</form:label>${shipping.country}  </h2>
				
			<h2>	<form:label name="state" path="state">State:</form:label>${shipping.state} </h2>
				
			<h2>	<form:label path="address">Address :</form:label>${shipping.address}  </h2>
					<br />
		
				<input name="_eventId_edit" type="submit" value="Edit" />
				<input name="_eventId_submit" type="submit" value="Confirm Details" />
				<br />
			</form:form>
			</div>
		</fieldset>
	</div>


