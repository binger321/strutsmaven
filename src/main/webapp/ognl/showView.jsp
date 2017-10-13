<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yb
  Date: 2017/10/13
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        .even{
            background-color: yellow;
        }
        .odd{
            background-color: red;
        }
    </style>
</head>
<body>
<table border="1">
    <tr><td>index</td>
        <td>count</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>编辑</td>
        <td>查看</td>
    </tr>
    <s:iterator value="users" var="u" status="itStatus">
        <tr class='<s:property value="#itStatus.isEven?'even':'odd'" />'>
            <td><s:property value="#itStatus.index"/> </td>
            <td><s:property value="#itStatus.count"/> </td>
            <td><s:property value="#u.name"/> </td>
            <td><s:property value="#u.age"/> </td>
            <td>
                <s:url action="UserAction_edit.do" namespace="/user" var="editUrl">
                    <s:param name="id" value="#u.id"/>
                </s:url>
                <a href='<s:property value="#editUrl"/>'>编辑</a>
            </td>
            <td><s:property value="#u.age"/> </td>

        </tr>
    </s:iterator>

</table>
<s:url includeParams="all"/>
</body>
</html>
