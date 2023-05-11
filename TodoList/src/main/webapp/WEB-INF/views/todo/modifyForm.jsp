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
    <hr>

    <form method="post">
        tno <input type="text" name="tno" readonly>
        todo <input type="text" name="todo"> <br>
        duedate <input type="date" name="duedate"> <br>
        complete <input type="checkbox" name="complete"> <br>
        <input type="reset" name="todo"> <input type="submit" value="수정함다">

    </form>
    <a href="/todo/list">todo List</a>

</body>
</html>
