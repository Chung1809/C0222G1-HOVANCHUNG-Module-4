<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 6/14/2022
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/home" method="post">
    <tr>
        <input type="text" placeholder="Enter email" name="validate" value="${validate}">
        <p>${mess}</p>
    </tr>
    <button type="submit">Submit</button>
</form>
</body>
</html>
