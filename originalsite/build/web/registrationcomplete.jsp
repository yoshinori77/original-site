<%@page import="java.time.LocalDate"%>
<%@page import="java.time.temporal.ChronoUnit"%>
<%@page import="model.UserData"%>
<%@page import="model.ViewHelper"%>

<%
    UserData ud = (UserData)request.getAttribute("ud");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet"  type="text/css" href="css/bootstrap.css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録結果画面</title>
    </head>
    <body>
        <%@ include file="header.jsp"%>
        <div class="jumbotron">
            <div class="container">
            <h2>登録結果</h2><br>
            名前: <%= ud.getName()%><br>
            パスワード: <%= ud.getPassword()%><br>
            メールアドレス: <%= ud.getEmail()%><br>
            住所: <%= ud.getAddress()%><br>
            生年月日: <%= ud.getSBirthday() %><br>
            性別: <%= ud.getSSex() %><br>
            以上の内容で登録しました。<br>
            </div>
        </div>
        <%@ include file="footer.jsp"%>
    </body>
</html>