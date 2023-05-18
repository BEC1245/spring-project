<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-18
  Time: 오후 5:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>

    <h1>게시글 쓰기</h1>
    <hr>
    <form method="post">
        <table>
            <tr>
                <td>작성자</td>
                <td><input type="text" name="writer"></td>
            </tr>
            <tr>
                <td>제목</td>
                <td><input type="text" name="title"></td>
            </tr>
            <tr>
                <td>내용</td>
                <td>
                    <textarea name="content" id="" cols="30" rows="10"></textarea>
                </td>
            </tr>
            <tr>
                <td><input type="reset" value="다 지워버려~"></td>
                <td><input type="submit" value="작성 끝"></td>
            </tr>
        </table>
    </form>

</body>

</html>
