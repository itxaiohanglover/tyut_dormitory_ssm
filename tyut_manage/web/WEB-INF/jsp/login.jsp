<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <title>登录页面</title>
    <link rel="stylesheet" href="css/login.css">
    <link rel="stylesheet" href="lib/layui/css/layui.css">

</head>
<p id="msg" hidden>${msg}</p>
<body>
<div class="box" id="layui-container">
    <h2>登录页面</h2>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <div class="inputBox">
            <input type="text" name="a_username" required="">
            <label>用户名</label>
        </div>
        <div class="inputBox">
            <input type="password" name="a_password" required="">
            <label>密码</label>
        </div>
        <input type="submit" name="" value="登陆">
    </form>
</div>
<script src="lib/layui/layui.js"></script>
<script>
    layui.use('layer', function(){
        var layer = layui.layer;
        var msg = document.getElementById("msg").textContent;
        if(msg != '') {
            layer.msg(msg)
        }
    });
</script>
</body>

</html>