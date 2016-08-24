<%-- 
    Document   : contactconfirm
    Created on : 2016/08/19, 14:26:01
    Author     : yoshi
--%>

<%@page import="model.UserData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    UserData ud = (UserData)session.getAttribute("ud");
%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">
        <link href="http://getbootstrap.com/examples/sticky-footer/sticky-footer.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>お問い合わせ確認</title>
        
        <style>
            .col-sm-10 {
                margin-bottom: 10px;
            }
        </style>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div class="row" style="margin: 60px 0 0 20px">
            <h2 style="margin-bottom: 20px">ご入力内容</h2>
            <div class="col-sm-2">
                <label for="namae">お名前：</label>
            </div>
            <div class="col-sm-10">
                <%= ud.getName()%>
            </div>
            <div class="col-sm-2">
                <label for="namae">メールアドレス：</label>
            </div>
            <div class="col-sm-10">
                <%= ud.getEmail()%>
            </div>
            <div class="col-sm-2">
                <label for="namae">お問い合わせの種類：</label>
            </div>
            <div class="col-sm-10">
                <%= ud.getCategory()%>
            </div>
            <div class="col-sm-2">
                <label for="namae">件名：</label>
            </div>
            <div class="col-sm-10">
                <%= ud.getSubject()%>
            </div>
            <div class="col-sm-2">
                <label for="namae">お問い合わせ内容：</label>
            </div>
            <div class="col-sm-10">
                <%= ud.getMessage()%>
            </div>
        </div>
            <%@ include file="footer.jsp" %>
    </body>
</html>
