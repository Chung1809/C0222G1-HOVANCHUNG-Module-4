<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 6/16/2022
  Time: 8:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>TỜ KHAI Y TẾ ĐÃ KHAI BÁO</h2>

    <c:forEach items="${declaration}" var="declaration" >
        <p>Họ tên: ${declaration.name}</p>
        <p>Năm sinh: ${declaration.birthDay}</p>
        <p>Giới tính: ${declaration.gender}</p>
        <p>Quốc tịch: ${declaration.nationality}</p>
        <p>Số CMND hoặc hộ chiếu: ${declaration.card}</p>
        <p>Thông tin đi lại: ${declaration.informationTravel}</p>
        <p>Số hiệu phương tiện: ${declaration.vehicleNumber}</p>
        <p>Số ghế: ${declaration.seats}</p>
        <p>Ngày bắt đầu: ${declaration.departureDay}/${declaration.departureMonth}/${declaration.departureYear}</p>
        <p>Ngày kết thúc: ${declaration.endDay}/${declaration.endMonth}/${declaration.endYear}</p>
        <p>Các nơi đã đi đến trong vòng 14 ngày qua: ${declaration.destinationInformation}</p>


    </c:forEach>

</body>
</html>
