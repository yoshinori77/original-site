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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Error</h1>
        <%= request.getAttribute("error") %>
        
        <%= ViewHelper.getInstance().top() %>
    </body>
</html>
