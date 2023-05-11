<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-11
  Time: 오전 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo Regist</title>
</head>

<body>

  <h1>Todo 등록</h1>
  <hr>

    <h3>${todo}</h3>

  <form method="post">
    todo <input type="text" name="todo"> <br>
    duedate <input type="date" name="duedate"> <br>
    <input type="reset" name="todo"> <input type="submit" value="등록함다">

  </form>
  <a href="/todo/list">todo List</a>

</body>
</html>
