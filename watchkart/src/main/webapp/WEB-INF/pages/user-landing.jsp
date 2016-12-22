<%@include file="/WEB-INF/pages/header.jsp"%>
<%@include file="/WEB-INF/pages/navbar1.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

</head>
<body>


<div style="padding: 100px">
	
   

   <div class="container text-center">
   <c:if test="${message == true}">
  <div class="alert alert-danger fade in">
    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
     Product is out of stock!! 
  </div>
  </c:if>
   <div class="row">
   <c:forEach var="product" items="${itemList}" varStatus="status">
    <div class="col-md-4"  style="padding-bottom: 10px">
   <div>
   
      <spring:url value="/resources/img/${product.pid}.jpg" var="imgs" /><img height="170vh" width="200" src="${imgs}"/> 
   <div class="text-center caption"> 
      
      <span>${product.pname}</span><br>
      <span>Rs.${product.pprice}</span><br>
	<a class="btn btn-warning" href="shoProduct?pid=${product.pid}">About</a>
	
      </div>
   </div>
   </div>
   </c:forEach> 
   </div></div>
   </div>
                <%-- <tr></tr>
                <tr><td>
                <table>
                    <tr><td> ${product.pid}</td></tr>
                    <tr><td> ${product.pname}</td></tr>
                    <tr><td>Rs.${product.pprice}</td></tr>

                    <img alt="" src="<c:url value="/resources/imgs/${product.pid}.jpg" /> ">
                   <tr><td><a href="usr/cart/add?id=${product.pid}&nam=${pageContext.request.userPrincipal.name}">AddToCart</a></td></tr>
                    <tr><td>----------------------</td></tr>
                  
                  
                  </td>
                </tr> --%>
                
		
	<!-- </table> -->
	</div>
<%-- <div class="container"  ng-app="admintable" ng-controller="admincontroller">
<div class="row">
<div class="col-sm-6 col-md-4 text-center" ng-repeat="show in list"><a href="brief.do?id={{show.pid}}">
<div class="image">
<spring:url value="/resources/img/gold-leaf.jpg"
				var="g" />
<img class="mySlides" src="${g}" class="center-block"
				style="width: 30%">
</div>

<span>Rs.{{show.pprice}}</span><br>
<span>{{show.pname}}</span><br>
<a class="btn btn-warning" href="usr/cart/add?id=${product.pid}&nam=${pageContext.request.userPrincipal.name}">Add to Cart</a>
</div></a></div></div> --%>
</body>
<%-- <%@include file="/WEB-INF/views/includes1.jsp"%>   --%>
  <%@include file="/WEB-INF/pages/footer.jsp"%>
</html>