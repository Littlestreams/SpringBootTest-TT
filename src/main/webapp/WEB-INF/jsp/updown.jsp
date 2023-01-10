<%--
  Created by IntelliJ IDEA.
  User: Times
  Date: 2022/10/11
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>上传下载</title>
    <script src="/js/jquery/jquery.min.js"></script>
</head>
<body>
<form method="post" action="/c1/up" enctype="multipart/form-data">
    <input name="myFile" type="file">
    <input type="submit" value="提交">
    <br>
    <input type="text" name="fileName" id="fileName">
    <input type="button" value="下载" id="downLoad">
</form>
</body>
<script type="text/javascript">
    $(function(){
      $("#downLoad").click(function () {
          var fileName =$("#fileName").val();
          $.ajax({
              //几个参数需要注意一下
              type: "POST",//方法类型
              dataType: "json",//预期服务器返回的数据类型
              url: "<%=request.getContextPath() %>/c1/download",
              data: {fileName:fileName},
              success: function (result) {
                  if (result.resultCode == 1) {
                      alert("下载成功");
                  } else{
                      alert("下载失败");
                  }
              },
              error : function() {
                  alert("下载成功异常");
              }
          });

     })
    });
</script>
</html>
