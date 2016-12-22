<%@include file="/WEB-INF/pages/header.jsp"%>
<spring:url value="/resources/css/style2.css" var="style" />
<link rel="stylesheet" href="${style}">
<%@include file="/WEB-INF/pages/navbar1.jsp"%>
     <%@include file="/WEB-INF/pages/imginfo.jsp"%>
   <!-- Footer starts-->
          <div class="footer2"><b>Copyright &copy; 2016</b></div>
          <!-- Footer ends -->
    </body>

<spring:url value="/resources/js/jquery.js" var="jq" />
<script src="${jq}"></script>
<spring:url value="/resources/js/angular.min.js" var="a" />
<script src="${a}"></script>
<spring:url value="/resources/js/proController.js" var="aa" />
<script src="${aa}"></script>

</html>
    