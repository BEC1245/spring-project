<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-18
  Time: 오후 5:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        td {
            padding: 3px;
        }

    </style>
</head>

<body>

  <h1>게시판</h1>
  <hr>

  <table border="1">
      <tr>
          <th>번호</th>
          <th>제목</th>
          <th>작성자</th>
          <th>작성일</th>
      </tr>
      <c:forEach items="${list}" var="var" varStatus="index">
          <tr>
              <td>${var.bno}</td>
              <td><a href="/board/read?bno=${var.bno}">${var.title}</a></td>
              <td>${var.writer}</td>
              <td>${var.regdate}</td>
          </tr>
      </c:forEach>
  </table>



  <hr>
  <a href="/board/write">글 쓰기</a>


</body>

</html>
