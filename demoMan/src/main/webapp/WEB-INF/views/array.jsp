<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-12
  Time: 오후 3:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="get">
        <table>
            <tr>
                <td>이름 1 : <input type="text" name="list[0].name">1</td>
                <td>도시 1 : <input type="text" name="list[0].city">2</td>
            </tr>
            <tr>
                <td>이름 2 : <input type="text" name="list[1].name">3</td>
                <td>도시 2 : <input type="text" name="list[1].city">4</td>
            </tr>
            <tr>
                <td>이름 3 : <input type="text" name="list[2].name">5</td>
                <td>도시 3 : <input type="text" name="list[2].city">6</td>
            </tr>
            <tr>
                <td>이름 4 : <input type="text" name="list[3].name">7</td>
                <td>도시 4 : <input type="text" name="list[3].city">8</td>
            </tr>
        </table>

        <input type="submit" value="제출하쇼">
    </form>
</body>
</html>
