<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-12
  Time: 오전 8:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>testing</title>
</head>

<body>
<h1 align="center">Data Binding in Spring MVC with Example</h1>

<hr />

<form action="process-homepage" method="get">

    <div align="center">


        <p>
            <label for="name1">Enter First Name : </label> <input type="text"
                                                                  id="name1" name="firstName" />
        </p>




        <p>
            <label for="name2">Enter Last Name : </label> <input type="text"
                                                                 id="name2" name="lastName" />
        </p>



        <input type="submit" value="Bind Data" />

    </div>

</form>
</body>
</html>