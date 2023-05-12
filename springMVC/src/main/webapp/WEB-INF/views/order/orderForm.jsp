<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-12
  Time: 오후 3:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>

    <h1>주문</h1>
    <hr>

    <!-- 컨테이너의 배열 객체를 가져오려면 변수명과 set 변수명을 일치시키고 -->
    <!-- [이거]로 인덱스 처리한다 -->
    <form method="post">
        <h3>상품1</h3>
        ID - <input type="text" name="orderItems[0].itemId"> <br>
        개수 - <input type="number" name="orderItems[0].number"> <br>
        주의 - <input type="text" name="orderItems[0].remark"> <br>

        <h3>상품2</h3>
        ID - <input type="text" name="orderItems[1].itemId"> <br>
        개수 - <input type="number" name="orderItems[1].number"> <br>
        주의 - <input type="text" name="orderItems[1].remark"> <br>

        <h3>상품3</h3>
        ID - <input type="text" name="orderItems[2].itemId"> <br>
        개수 - <input type="number" name="orderItems[2].number"> <br>
        주의 - <input type="text" name="orderItems[2].remark"> <br>

        <h3>배송지 주소</h3>
        우편번호 : <input type="text" name="address.zipcode"> <br>
        주소 1 : <input type="text" name="address.address1"> <br>
        주소 2 : <input type="text" name="address.address2"> <br>

        <br>

        <input type="submit" value="배송시작">
    </form>

    <hr>
    <span>orderItems[0].itemId == orderItems.get(0).setId("input")</span>

</body>
</html>
