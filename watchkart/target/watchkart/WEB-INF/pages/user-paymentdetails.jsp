<%@include file="/WEB-INF/pages/header.jsp"%>
<%@include file="/WEB-INF/pages/navbar1.jsp"%>
<%@include file="/WEB-INF/pages/paymentdetails.jsp"%>
     </body>

<spring:url value="/resources/js/jquery.js" var="jq" />
<script src="${jq}"></script>
<spring:url value="/resources/js/angular.min.js" var="a" />
<script src="${a}"></script>
<spring:url value="/resources/js/admincontroller.js" var="aa" />
<script src="${aa}"></script>

</html>