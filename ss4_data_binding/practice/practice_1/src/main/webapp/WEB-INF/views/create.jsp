<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 6/15/2022
  Time: 8:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>CREATE EMPLOYEE</h2>
<form:form action="/home" method="post" modelAttribute="employee">
    <table>
        <tr>
            <td>Employee ID: </td>
            <td><form:input path="id" /></td>
        </tr>
        <tr>
            <td>Employee's name: </td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Contact's number: </td>
            <td><form:input path="contactNumber"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>

</form:form>
</body>
</html>
