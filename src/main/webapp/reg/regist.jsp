<%--
  Created by IntelliJ IDEA.
  User: yb
  Date: 2017/9/28
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    如果在strut,xml配置假如了设置namesapce，而且此jsp是在某个目录下面的，
    那么需要使action为"./namespace/action.do"，这样才能访问到，在form中不能配置namespace--%>
    <%--<form method="post" action="../regns/RegAction_regist.do" >--%>
        <%--<table>--%>
            <%--<tr><td>用户名</td><td><input name="user" type="text" size="15"></td></tr>--%>
            <%--<tr><td>密码</td><td><input name="password" type="password" size="15"></td></tr>--%>

        <%--</table>--%>
        <%--<input type="submit" value="注册">--%>
    <%--</form>--%>

<s:form action="../regns/RegAction_regist.do" namespace="/regns" method="POST" enctype="multipart/form-data">
    <s:textfield name="name" lable="UserName"/>
    <s:textfield name="age" lable="UserAge"/>
    <s:file name="photo" label="UserPhoto"/>
    <s:submit/>
</s:form>
</body>
</html>
