<%@page import="model.UserData"%>
<%@page import="model.ViewHelper"%>
<%
    HttpSession hs = request.getSession();
    UserData ud = null;
    boolean reinput = false;
    // 戻るボタンからフォームされた場合
    if(request.getParameter("mode") != null && request.getParameter("mode").equals("REINPUT")){
        reinput = true;
        ud = (UserData)hs.getAttribute("ud"); 
   }
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet"  type="text/css" href="css/bootstrap.css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録画面</title>
    </head>
    <body>
    <%@ include file="header.jsp"%>
    <div class="jumbotron" style="margin-top: 50px;">
        <form action="RegistrationConfirm" method="POST">
            <div class="row" style="margin-left: 20px">
                <div class="col-sm-2">
                    <label for="">ユーザー名：</label>
                </div>
                <div class="col-sm-10">
                    <input type="text" name="name" placeholder="name" style="width: 300px; margin-bottom: 10px" value="<% if(reinput){out.print(ud.getName());}%>">
                </div>
                <div class="col-sm-2">
                    <label for="">パスワード：</label>
                </div>
                <div class="col-sm-10">
                    <input type="password" name="password" placeholder="password" style="width: 300px; margin-bottom: 10px" value="<% if(reinput){out.print(ud.getPassword());}%>">
                </div>
                <div class="col-sm-2">
                    <label for="">メールアドレス：</label>
                </div>
                <div class="col-sm-10">
                    <input type="text" name="email" placeholder="email" style="width: 300px; margin-bottom: 10px" value="<% if(reinput){out.print(ud.getEmail());}%>">
                </div>
                <div class="col-sm-2">
                    <label for="">住所：</label>
                </div>
                <div class="col-sm-10">
                    <input type="text" name="address" placeholder="address" style="width: 300px; margin-bottom: 10px" value="<% if(reinput){out.print(ud.getAddress());}%>">
                </div>
                <div class="col-sm-2">
                    <label for="">生年月日：</label>
                </div>
                <div class="col-md-10" style="margin-bottom: 10px">
                <%@ include file="birthday.jsp" %>
                </div>
                <div class="col-sm-2">
                    <label for="">性別：</label>
                </div>
                <div class="col-sm-10">
                    <input type="radio" name="sex" value="1" checked="<% if(reinput){if(ud.getSex() == 1){out.print("checked");}}%>">男性
                    <input type="radio" name="sex" value="2" checked="<% if(reinput){if(ud.getSex() == 2){out.print("checked");}}%>">女性
                </div>
                <div class="col-sm-2">
                    <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
                    <input type="submit" class="btn btn-primary" name="btnSubmit" value="確認画面へ" style="margin-top: 20px">
                </div>
            </div>
        </form>
    </div>
        <br>
        <%@ include file="footer.jsp"%>
    </body>
</html>
