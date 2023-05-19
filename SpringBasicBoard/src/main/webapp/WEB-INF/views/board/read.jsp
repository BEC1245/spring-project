<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-19
  Time: 오전 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            margin: auto;
            width: 600px;
            border: 3px solid black;
            padding: 10px;
            background-color: dimgray;
        }
        td {
            padding: 5px 10px;
            width: auto;
            height: 20px;
            background-color: #E9E9E9;
        }
        a {
            font-size: 25px;
        }
        .A{
            padding: 10px;
            border-bottom: 10px;
            text-align: center;
        }
        .div{
            margin: auto;
            width: 900px;
            background-color: gainsboro;
        }
        .title{
            text-align: center;
        }
        .bottom{
            margin: auto;
            width: 600px;
            height: max-content;
            background-color: khaki;
        }
        .chat{
            margin: auto;
            width: 700px;
            height: 1000px;
            background-color: aquamarine;
        }
    </style>
</head>

<body>

  <h1 class="title">게시글 보기</h1>
  <hr>

  <div class="div">
      <table border="1">
          <tr>
              <td>게시글 번호</td>
              <td>${article.bno}</td>
          </tr>
          <tr>
              <td>제목</td>
              <td>${article.title}</td>
          </tr>
          <tr>
              <td>작성자</td>
              <td>${article.writer}</td>
          </tr>
          <tr>
              <td>내용</td>
              <td>${article.content}</td>
          </tr>
          <c:if test="${article.file != null}">
              <tr>
                  <td>파일</td>
                  <td><img src="/uploadFile/board/${article.file}"></td>
              </tr>
          </c:if>
          <tr>
              <td>업데이트 날자 : ${article.updatedate}</td>
              <td>작성날자 : ${article.regdate}</td>
          </tr>
      </table>

      <div class="A">
          <a href="/board/modify?bno=${article.bno}">수정</a>
          <a href="/board/delete?bno=${article.bno}">삭제</a>
          <a href="/board/list">돌아가기</a>
      </div>
  </div>

  <hr>
  <div class="bottom">
     <span>${article.content}</span>

  </div>

  <hr>

  <!-- 여기가 댓글 목록 -->
  <div class="chat">


  </div>



</body>

</html>
