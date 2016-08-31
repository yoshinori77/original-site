<%@page import="model.ViewHelper"%>
<%-- 
    Document   : jdbc_advance
    Created on : 2016/06/22, 14:03:45
    Author     : yoshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18.1/build/cssreset/cssreset-min.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">
        <link href="http://getbootstrap.com/examples/sticky-footer/sticky-footer.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ログインページ</title>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div class="jumbotron">
            <div style="margin: 60px 0 0 20px">
            <h2>Login</h2>
             <form action="LoginCheck" method="POST">
                <%if (request.getAttribute("error") != null){out.println(request.getAttribute("error"));}%><br><br>
                <h3>名前：</h3><input type="text" name="name" size="60" style="border: 1px solid; padding: 3px;"> <br><br>
                <h3>PASSWORD：</h3><input type="text" name="password" size="60" style="border: 1px solid; padding: 3px;"> <br><br>
                <input type="hidden" name="ac" value=<%= (Integer)session.getAttribute("ac")%>>
                <input type="submit" class="btn btn-info" name="btnSubmit" value="ログイン"  ><br><br>
             </form>
            <button type="button" class="btn btn-primary"><a href="" onclick="document.registration.submit();return false;" style="text-decoration: none; color: white">新規登録</a></button>
            <form name="registration" method="POST" action="Registration">
                <input type="hidden" name="ac" value=<%= (Integer)session.getAttribute("ac")%>>
            </form>
            </div>
        </div>
         <%@ include file="footer.jsp" %>
    </body>
</html>