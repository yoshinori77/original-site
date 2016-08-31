<%-- 
    Document   : project
    Created on : 2016/08/30, 14:21:50
    Author     : yoshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Project</title>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/index.css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">
        <link href="http://getbootstrap.com/examples/sticky-footer/sticky-footer.css" rel="stylesheet">
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div class="jumbotron" style="margin-top: 50px;">
            <div class="row" style="margin-left: 20px">
                <h2 style="text-align: center; margin: 20px auto 30px auto">動画SNSプロジェクト 「STAR」</h2>
                <div class="col-sm-8">
                    <img src="asset/image.jpg" style="display: block; margin: 20px auto 20px auto">
                    <h4 style="text-align: center; margin: 30px 10% 20px 10%">説明： 動画SNSをつくりたい！ しかもJavaScriptで<br>TypeScriptとReact.jsでコーディングして、CordovaでiOS・Androidプロジェクトをビルドする </h4>
                    <form action="ProjectSchedule" method="POST" style="margin-top: 20px">
                        <input type="hidden" name="ac" value=<%= (Integer)session.getAttribute("ac")%>>
                        <input type="submit" name="btnSubmit" class="btn btn-success" value="スケジュール画面">
                    </form>
                </div>
                <div class="col-sm-3">
                    <h3>現在の達成度：</h3>
                    <h2>50%</h2>
                    <div class="progress">
                        <div class="progress-bar progress-bar-success" style="width: 50%; "></div>
                    </div>
                </div>
            </div>
        </div>
        
        <%@ include file="footer.jsp" %>
    </body>
</html>
