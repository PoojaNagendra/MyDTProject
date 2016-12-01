<%@include file="/WEB-INF/pages/header.jsp"%>
<%@include file="/WEB-INF/pages/navbar1.jsp"%>
           
         <a href="Landing" class="btn btn-primary button">Sign out</a>
     </div>
    </nav>
    <%@include file="/WEB-INF/pages/corousel.jsp"%>
<%@include file="/WEB-INF/pages/thumbnail.jsp"%>
<%@include file="/WEB-INF/pages/footer.jsp"%>
</body>
<spring:url value="/resources/js/jquery.js" var="jq" />
<script src="${jq}"></script>
<spring:url value="/resources/js/angular.min.js" var="a" />
<script src="${a}"></script>
<spring:url value="/resources/js/admincontroller.js" var="aa" />
<script src="${aa}"></script>

</html>
    