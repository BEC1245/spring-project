<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-11
  Time: 오후 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>Todo 수정</h1>
    <h4>${strData}</h4>
    <hr>

    <form method="post">
        tno <input type="text" name="tno" value="1" readonly>
        todo <input type="text" name="todo" value="놀기"> <br>
        duedate <input type="date" name="duedate" value="2023-12-25"> <br>
        complete <input type="checkbox" name="finished" checked> <br>

        <input type="reset" name="todo"> <input type="submit" value="수정함다">

    </form>
    <a href="/todo/list">todo List</a>

</body>
</html>
