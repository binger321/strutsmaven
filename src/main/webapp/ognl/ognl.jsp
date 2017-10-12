<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yb
  Date: 2017/10/11
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ognl.jsp</title>
</head>
<body>
    <s:form action="ognlAction_set.do" method="POST">
        <s:textfield label="address" name="address"/>
        <s:submit/>
    </s:form>

</body>

</html>
