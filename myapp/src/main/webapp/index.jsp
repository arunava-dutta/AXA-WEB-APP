<%
    //----------------------------------------------------------------------
// <copyright file="index.jsp" company="Accusoft Corporation">
// Copyright© 1996-2015 Accusoft Corporation.  All rights reserved.
// </copyright>
//----------------------------------------------------------------------
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="mydomain.myapp.controller.HelloController" %>
<!DOCTYPE html>
<html>
<body>
<% HelloController hello=new HelloController();
String propValue=hello.sayHello();
%>

<p>Reading config Value : <%=propValue%></p>
 </body>
</html>