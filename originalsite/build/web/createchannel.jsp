<%-- 
    Document   : createchannel
    Created on : 2016/07/19, 23:25:52
    Author     : yoshi
--%>

<%@page import="model.ViewHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"  type="text/css" href="css/bootstrap.css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div class="jumbotron" style="margin-top: 50px">
        <form action="CreateChannelComplete" method="GET">
            <input type="text" name="name" value="">
            <input type="submit" name="btnSubmit" value="送信">
        </form>
        
        <%= ViewHelper.getInstance().top() %>
        </div>
        <%@ include file="footer_home.jsp" %>
    </body>
</html>
