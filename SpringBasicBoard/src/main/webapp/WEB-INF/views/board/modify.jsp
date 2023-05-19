<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-19
  Time: 오후 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <style>
        td {
            padding: 10px 20px;
        }
    </style>
</head>

<body>
    <h1>게시글 수정</h1>
    <hr>

    <!-- 새로운 파일을 업로드 할 수 있고
       이전에 업로드한 파일이 있을 수 있다. -->
    <form method="post" enctype="multipart/form-data">
        <input type="hidden" name="bno" value="${board.bno}" readonly>

       <table border="1">
           <tr>
               <td>글 제목</td>
               <td><input type="text" name="title" value="${board.title}"></td>
           </tr>
           <tr>
               <td>내용</td>
               <td>
                   <textarea name="content">
                       ${board.content}
                   </textarea>
               </td>
           </tr>
           <tr>
               <td>작성자</td>
               <td><input type="text" name="writer" value="${board.writer}"></td>
           </tr>
           <tr>
               <td>전에 올렸던 파일</td>
               <td>
                   <!-- oldfile로 데이터를 받을 텐데 null값 인지 아닌지 처리 해야함 -->
                   <c:if test="${board.file != null}" var="none">
                       <input type="hidden" name="oldfile" value="${board.file}">${board.file}
                   </c:if>
                   <c:if test="${none == false}">
                       전에 올렸던 파일이 없습니다.
                   </c:if>
               </td>
           </tr>
           <tr>
               <td>첨부파일</td>
               <td><input type="file" name="file"></td>
           </tr>
           <tr>
               <td></td>
               <td>
                   <input type="reset" value="리셋">
                   <input type="submit" value="제출">
               </td>
           </tr>
       </table>
    </form>

    <a href="/board/list">
        <span style="font-size: 25px">돌아가기</span>
    </a>

</body>

</html>
