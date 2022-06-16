<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 6/15/2022
  Time: 9:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    table {
        border: 1px solid;
    }

    table tr td {
        border: 1px solid;
    }

    table tr th {
        border: 1px solid;
    }
</style>
<body>
<h2>List</h2>
<p style="color: blue">${mess}</p>
<table>
    <tr>
        <th>Language</th>
        <th>PageSize</th>
        <th>SpamsFilter</th>
        <th>Signature</th>
    </tr>
    <tr>
        <c:forEach items="${list}" var="list">
    <tr>
        <td>${list.languages}</td>
        <td>${list.pageSize}</td>
        <td>${list.spamsFilter}</td>
        <td>${list.signature}</td>
    </tr>
    </c:forEach>
    </tr>
</table>
</body>
</html>
