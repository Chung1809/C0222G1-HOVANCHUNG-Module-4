<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 6/16/2022
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 style="text-align: center">TỜ KHAI Y TẾ</h2>
<h3 style="text-align: center">ĐÂY LÀ TÀI LIỆU QUAN TRỌNG,THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN
    THIẾT ĐỂ PHÒNG CHỐNG DỊCH
    BỆNH TRUYỀN NHIỄM</h3>
<h4 style="text-align: center ; color: red">Khuyến cáo : Khai báo thông tin sai là vi phạm pháp luật Việt Nam và
    có thể xử lí hình sự</h4>
<form:form action="/create" method="post" modelAttribute="medical">
    <div>
        <p>Họ tên(ghi chữ IN HOA)</p>
        <form:input path="name" cssStyle="width: 100%"/>
    </div>
    <table style="width: 100%">
        <tr>
            <th style="width: 33%">Năm sinh</th>
            <th style="width: 33%">Giới tính</th>
            <th style="width: 33%">Quốc tịch</th>
        </tr>
        <tr>
            <td>
                <form:select path="birthDay" cssStyle="width: 100%;">
                    <form:options items="${birthday}"/>
                </form:select>
            </td>
            <td>
                <form:select path="gender" cssStyle="width: 100%;">
                    <form:options items="${gender}"></form:options>
                </form:select>
            </td>
            <td>
                <form:select path="nationality" cssStyle="width: 100%;">
                    <form:options items="${nationality}"/>
                </form:select>
            </td>
        </tr>
    </table>
    <div>
        <p>Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác</p>
        <form:input path="card" cssStyle="width: 100%"/>
    </div>
    <div>
        <p>Thông tin đi lại</p>
        <form:radiobuttons path="informationTravel" items="${informationTravel}"></form:radiobuttons>
    </div>
    <table style="width: 100%">
        <tr>
            <th style="width: 50%">Số hiệu phương tiện</th>
            <th style="width: 50%">Số ghế</th>
        </tr>
        <tr>
            <td>
                <form:input path="vehicleNumber" cssStyle="width: 100%"/>
            </td>
            <td>
                <form:input path="seats" cssStyle="width: 100%"/>
            </td>
        </tr>
    </table>
    <table style="width: 100%">
        <tr>
            <th style="width: 50%">Ngày khởi hành</th>
            <th style="width: 50%;">Ngày kết thúc</th>
        </tr>
        <tr>
            <td>
                <span>
                    <form:select path="departureDay" cssStyle="width: 30%;">
                        <form:options items="${departureDay}"/>
                    </form:select>

                    <form:select path="departureMonth" cssStyle="width: 30%;">
                    <form:options items="${departureMonth}"/>
                    </form:select>

                    <form:select path="departureYear" cssStyle="width: 30%;">
                    <form:options items="${departureYear}"/>
                    </form:select>
                </span>
            </td>
            <td>
                <span>
                    <form:select path="endDay" cssStyle="width: 30%;">
                        <form:options items="${endDay}"/>
                    </form:select>

                    <form:select path="endMonth" cssStyle="width: 30%;">
                        <form:options items="${endMonth}"/>
                    </form:select>

                    <form:select path="endYear" cssStyle="width: 30%;">
                        <form:options items="${endYear}"/>
                    </form:select>
                </span>
            </td>
        </tr>
    </table>
    <div>
        <p>Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh/thành phố nào?</p>
        <form:textarea path="destinationInformation" cssStyle="width: 100% ;height: 10%"/>
    </div >
    <button  type="submit">Gửi tờ khai</button>
</form:form>
</body>
</html>
