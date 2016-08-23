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
            <label for="createChannel" >新規スレッド名：</label>
            <input type="text" name="name" value="" placeholder="new thread">
            <input type="submit" name="btnSubmit" value="送信">
        </form>
        
        </div>
        <%@ include file="footer.jsp" %>
    </body>
</html>
