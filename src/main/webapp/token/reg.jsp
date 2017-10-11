<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yb
  Date: 2017/10/10
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>reg</title>
</head>
<body>
    <s:debug/>
    <s:actionerror/>
    <s:form action="tokenAction_reg.do" method="POST">
        <s:token/>
        <s:textfield name="name" label="UserName"/>
        <s:submit/>
    </s:form>
</body>
</html>
