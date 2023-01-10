<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Times
  Date: 2022/9/30
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>欢迎页</title>
</head>
欢迎Teamo,当前时间：
<div id="time">
    <script>
        document.getElementById('time').innerHTML = new Date().toLocaleString()
            + ' 星期' + '日一二三四五六'.charAt(new Date().getDay());
        setInterval(
            "document.getElementById('time').innerHTML=new Date().toLocaleString()+' 星期'+'日一二三四五六'.charAt(new Date().getDay());",
            1000);
    </script>
</div>
<body>
</body>
</html>
