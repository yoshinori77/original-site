<%-- 
    Document   : error
    Created on : 2016/07/17, 21:37:35
    Author     : yoshi
--%>

<%@page import="model.ViewHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet"  type="text/css" href="css/bootstrap.css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="header.jsp"%>
        <h1>Error</h1>
        <%= request.getAttribute("error") %>
        
        <%@ include file="footer.jsp"%>
    </body>
</html>

