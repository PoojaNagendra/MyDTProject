<!-- Corousel starts -->
	<div id="carousel-example-generic" class="carousel slide topbg"
		data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#carousel-example-generic" data-slide-to="0"
				class="active"></li>
			<li data-target="#carousel-example-generic" data-slide-to="1"></li>
			<li data-target="#carousel-example-generic" data-slide-to="2"></li>
			<li data-target="#carousel-example-generic" data-slide-to="3"></li>
			<li data-target="#carousel-example-generic" data-slide-to="4"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<spring:url value="/resources/img/cor1.jpg" var="imgs" />
				<img src="${imgs}" class="images"/>
				<div class="carousel-caption"></div>
			</div>

			<div class="item">
				<spring:url value="/resources/img/cor2.jpg" var="imgs" />
				<img src="${imgs}" class="images"/>
				<div class="carousel-caption"></div>
			</div>

			<div class="item">
				<spring:url value="/resources/img/cor3.jpg" var="imgs" />
				<img src="${imgs}" class="images"/>
				<div class="carousel-caption"></div>
			</div>

			<div class="item">
				<spring:url value="/resources/img/cor4.jpg" var="imgs" />
				<img src="${imgs}" class="images"/>
				<div class="carousel-caption"></div>
			</div>

			<div class="item">
				<spring:url value="/resources/img/cor5.jpg" var="imgs" />
				<img src="${imgs}" class="images"/>
				<div class="carousel-caption"></div>
			</div>
		</div>

		<!-- Controls -->
		<a class="left carousel-control" href="#carousel-example-generic"
			role="button" data-slide="prev"> <span
			class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#carousel-example-generic"
			role="button" data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>
	<!-- Corousel-ends -->