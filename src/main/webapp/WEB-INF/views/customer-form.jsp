<%--
  Created by IntelliJ IDEA.
  User: nnamdinwabuokei
  Date: 11/10/2019
  Time: 1:35 am
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<meta charset="ISO-8859-1">
<head>
  <title>Spring MVC 5 form Handling | Java Guides</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
        integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
          integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
          crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
          integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
          crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"
          integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1"
          crossorigin="anonymous"></script>
  <%--    <link href= "<c:url value="/resources/css/bootstrap.min.css" />" rel = "stylesheet">--%>
  <%--    <script src="<c:url value="/resources/js/bootstrap.min.js"/>" ></script>--%>
  <%--    <script src="<c:url value="/resources/js/jquery-3.4.1.min.js"/> "></script>--%>

</head>
<body>
<div class="container">
  <div class="col-md-offset-2 col-md-7">
    <h2 class="text-center">Spring MVC + Hibernate 5 + JSP + MySQL</h2>
    <div class="panel panel-info">
      <div class="panel-heading">
        <div class="panel-title"> Add Customer</div>
      </div>
      <div class="panel-body">
        <form:form action="saveCustomer" cssClass="form-horizontal" method="post" modelAttribute="customer">
          <%--                        need to associate this data with customer id--%>
          <form:hidden path="id"/>
          <div class="form-group">
              <%--@declare id="firstname"--%>
            <label for="firstName" class="col-md-3 custom-control-label">
              First Name
            </label>
            <div class="col-md-9">
              <form:input path="firstName" cssClass="form-control"/>
            </div>
          </div>
          
          <div class="form-group">
              <%--@declare id="lastName"--%>
            <label for="lastName" class="col-md-3 custom-control-label">
              Last Name
            </label>
            <div class="col-md-9">
              <form:input path="lastName" cssClass="form-control"/>
            </div>
          </div>
          
          <div class="form-group">
              <%--@declare id="email"--%>
            <label for="email" class="col-md-3 custom-control-label">
              Email
            </label>
            <div class="col-md-9">
              <form:input path="email" cssClass="form-control"/>
            </div>
          </div>
          <div class="form-group">
              <%--                            Button--%>
            <div class="col-md-offset-3 col-md-9">
              <form:button cssClass="btn btn-primary">Submit</form:button>
            </div>
          </div>
        </form:form>
      </div>
    </div>
  </div>
</div>
</body>
</html>
