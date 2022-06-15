<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 6/14/2022
  Time: 9:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Sandwich Condiment</h2>
<form action="/result" method="get">
   <tr>
       <input type="checkbox" name="condiment" value="lettuce">Lettuce
       <input type="checkbox" name="condiment" value="tomato">Tomato
       <input type="checkbox" name="condiment" value="mustard">Mustard
       <input type="checkbox" name="condiment" value="sprouts">Sprouts
   </tr>
    <hr>
     <tr>
         <button type="submit">Submit</button>
     </tr>
</form>
</body>
</html>
