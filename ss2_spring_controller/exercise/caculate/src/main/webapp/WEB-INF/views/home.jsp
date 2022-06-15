<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 6/15/2022
  Time: 11:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Calculate</h2>
<form action="/home" method="post">
    <tr>
        <input type="text" name="number1" placeholder="0">
        <input type="text" name="number2" placeholder="0">
    </tr>
    <tr>
        <button type="submit" name="operator" value="Addition(+)">Addition(+)</button>
        <button type="submit" name="operator" value="Subtraction(-)">Subtraction(-)</button>
        <button type="submit" name="operator" value="Multiplication(*)">Multiplication(X)</button>
        <button type="submit" name="operator" value="Division(/)">Division(/)</button>
    </tr>
    <hr>
    <p>Result : ${result}</p>
</form>


</body>
</html>
