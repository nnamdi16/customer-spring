<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: nnamdinwabuokei
  Date: 10/10/2019
  Time: 3:02 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
  <title>Edit Customers</title>
</head>
<body>
<div class="container">
  <div class="col-md-10 offset-2">
    <h2>CRM - Customer Relationship Manager </h2>
    <hr/>
    <input type="button" value="Add Customer" onclick="window.location.href='showForm'; return false;"
           class="btn btn-primary"/>
    <br/><br/>
    <div class="panel panel-info">
      <div class="panel-heading">
        <div class="panel-title">Customer List</div>
      </div>
      <div class="panel-body">
        <table class="table table-striped table-bordered">
          <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Action</th>
          </tr>
          
          <%--        Loop over and print our customers --%>
          <c:forEach var="tempCustomer" items="${customer}">
            <%--          Construct an update link with  customer id--%>
            <c:url var="updateLink" value="/customer/updateForm">
              <c:param name="customerId" value="${tempCustomer.id}"/>
            </c:url>
            
            <%--          Construct a delete link with customer id--%>
            <c:url var="deleteLink" value="/customer/delete">
              <c:param name="customerId" value="${tempCustomer.id}"/>
            </c:url>
            
            <tr>
              <td>${tempCustomer.firstName}</td>
              <td>${tempCustomer.lastName}</td>
              <td>${tempCustomer.email}</td>
              
              <td>
                  <%--              Display the update link--%>
                <a href="${updateLink}">Update</a> | <a href="${deleteLink}"
                                                        onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
              </td>
            </tr>
          </c:forEach>
        </table>
      </div>
    </div>
  </div>
</div>
</body>
</html>
