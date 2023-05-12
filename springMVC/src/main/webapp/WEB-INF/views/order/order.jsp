<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-12
  Time: 오후 4:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Order</title>
</head>

<body>

    <h1>주문내역</h1>

    ${order}
    <c:forEach items="${order.orderItems}" var="item">
        <h3>상품</h3>
        id - ${item.itemId} <br>
        개수 - ${item.number} <br>
        주의 사항 - ${item.remark} <br>
    </c:forEach>

    <h3>배송지</h3>
      우편번호 - ${order.address.zipcode} <br>
      주소 1 - ${order.address.address1} <br>
      주소 2 - ${order.address.address2} <br>

</body>
</html>
