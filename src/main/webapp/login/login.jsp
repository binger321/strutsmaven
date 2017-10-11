<%--
  Created by IntelliJ IDEA.
  User: yb
  Date: 2017/10/10
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <s:form action="loginAction_login.do">
        <s:textfield name="name"/>
        <s:submit/>
    </s:form>
</body>
</html>
