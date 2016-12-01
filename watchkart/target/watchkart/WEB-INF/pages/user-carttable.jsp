<%@include file="/WEB-INF/pages/header.jsp"%>
<%@include file="/WEB-INF/pages/navbar1.jsp"%>
    //after adding to cart this will be visible//
    <%@include file="/WEB-INF/pages/table.jsp"%>
    
     <a href="user-shippingdetails" class="btn btn-primary button">Continue to checkout</a>
      <a href="user-landing" class="btn btn-primary button">Back</a>
       <%@include file="/WEB-INF/pages/footer.jsp"%>
    </body>
<%-- <%@include file="/WEB-INF/views/includes1.jsp"%>   --%>
<spring:url value="/resources/js/jquery.js" var="jq" />
<script src="${jq}"></script>
<spring:url value="/resources/js/angular.min.js" var="a" />
<script src="${a}"></script>
<spring:url value="/resources/js/admincontroller.js" var="aa" />
<script src="${aa}"></script>

</html>
    