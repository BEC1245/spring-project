<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-11
  Time: 오전 11:57
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>todo Read</title>
</head>
<body>

  <h1>Todo 보기</h1><hr>

  <h3>${todo}</h3>

  <a href="/todo/modify">수정</a> <br>

  <form action="/todo/delete" method = "get">

      삭제한다 : <input type="number" name="tno"> <br>
      <input type="submit" value="제거한다">
  </form>
  <!--a href="/todo/delete">삭제</a--> <br>

  <hr>

  <h3>${error}</h3>

</body>
</html>
