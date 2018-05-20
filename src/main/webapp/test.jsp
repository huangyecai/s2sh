<%--
  Created by IntelliJ IDEA.
  User: hyc
  Date: 2018/5/19
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- 引入struts2 的标签库--%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>ssh测试</title>
</head>
<body>

<%-- 获取值栈中的user对象的uname的值--%>
用户名： <s:property value="user.uname"></s:property>
</body>
</html>
