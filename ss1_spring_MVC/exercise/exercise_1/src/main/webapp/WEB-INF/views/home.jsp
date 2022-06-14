<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 6/13/2022
  Time: 9:35 PM
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
        <input type="text" placeholder="0" name="usd"value="${oldUsd}">
        <p>${mess}</p>
    </tr>
   <tr>
       <input type="text" placeholder="0"  value="${usd}">
   </tr>
    <tr>
        <button type="submit">Submit</button>
    </tr>
</form>
</body>
</html>
