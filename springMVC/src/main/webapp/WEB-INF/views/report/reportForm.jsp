<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-15
  Time: 오전 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FileUpload</title>
</head>
<body>

    <h1>과재 재출 1</h1>

    <form action="/report/submit1" method="post" enctype="multipart/form-data">

        학번 : <input type="text" name="snum"> <br>
        이름 : <input type="text" name="sname"> <br>
        파일 : <input type="file" name="report"> <br>
        <input type="submit" value="과재 제출">
    </form>

    <hr>

    <h1>과재 재출 2</h1>

    <!-- method는 post / enctype은 multipart/form-data | 이 둘은 고정이다 -->
    <form action="/report/submit2" method="post" enctype="multipart/form-data">

        학번 : <input type="text" name="snum"> <br>
        이름 : <input type="text" name="sname"> <br>
        파일 : <input type="file" name="report"> <br>
        <input type="submit" value="과재 제출">
    </form>

    <hr>

    <h1>과재 재출 3</h1>

    <!-- method는 post / enctype은 multipart/form-data | 이 둘은 고정이다 -->
    <form action="/report/submit3" method="post" enctype="multipart/form-data">

        학번 : <input type="text" name="snum"> <br>
        이름 : <input type="text" name="sname"> <br>
        파일 : <input type="file" name="report"> <br>
        <input type="submit" value="과재 제출">
    </form>

</body>
</html>
