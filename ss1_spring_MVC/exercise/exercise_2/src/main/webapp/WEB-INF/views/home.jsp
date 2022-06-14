<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 6/14/2022
  Time: 10:50 AM
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
        <input type="text" placeholder="Enter Word" name="word" value="${word}">
        <input type="text" value="${dictionary}">
        <button type="submit">Submit</button>
    </tr>
</form>
</body>
</html>
