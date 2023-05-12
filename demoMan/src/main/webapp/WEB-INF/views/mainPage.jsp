<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-12
  Time: 오전 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1 align="center">${title}</h1>
    <hr>

    <form method="post">
        <table>
            <th>이름</th>
            <th>사는 곳</th>
            <tr>
                <td><input type="text" name="name"></td>
                <td><input type="text" name="place"></td>
            </tr>
        </table>

        <input type="submit" value="전송한다">
    </form>

    <hr>
    <h3>${sand}</h3>

</body>
</html>
