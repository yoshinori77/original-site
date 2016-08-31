
<%@page import="model.ViewHelper"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.UserData"%>
<%
    UserData ud = (UserData)session.getAttribute("ud");
//    ArrayList<String> chkList = ud.chkproperties();
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet"  type="text/css" href="css/bootstrap.css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
    </head>
    <body>
    <%@ include file="header.jsp"%>
    <%// if(chkList.size()==0){ %>
    <div class="jumbotron">
        <div class="container">
            <h2>登録確認</h2>
            <div class="row" style="margin-top: 20px">
            <label class="col-md-2">ユーザー名:</label>
            <div class="col-md-10" style="margin-bottom: 10px"><%= ud.getName()%></div>
            <label class="col-md-2">パスワード:</label>
            <div class="col-md-10" style="margin-bottom: 10px"><%= ud.getPassword()%></div>
            <label class="col-md-2">メールアドレス:</label>
            <div class="col-md-10" style="margin-bottom: 10px"><%= ud.getEmail()%></div>
            <label class="col-md-2">住所:</label>
            <div class="col-md-10" style="margin-bottom: 10px"><%= ud.getAddress()%></div>
            <label class="col-md-2">生年月日:</label>
            <div class="col-md-10" style="margin-bottom: 10px"><%= ud.getSBirthday()%></div>
            </div>
            <label class="col-md-2">性別:</label>
            <div class="col-md-10" style="margin-bottom: 10px"><%= ud.getSSex()%></div>
            <h4>上記の内容で登録します。よろしいですか？</h4>
            <div class="row" style="margin-top: 20px">
                <div class="col-md-1">
                <form action="RegistrationComplete" method="POST">
                    <% request.setAttribute("userdata", ud); %>
                    <input type="hidden" name="ac"  value="<%= session.getAttribute("ac")%>">
                    <input type="submit" class="btn btn-success" name="yes" value="はい">
                </form>
                </div>
                <div class="col-md-1">
                <form action="Registration" method="POST">
                    <input type="hidden" name="ac"  value="<%= session.getAttribute("ac")%>">
                    <input type="hidden" name="mode"  value="REINPUT">
                    <input type="submit" class="btn btn-danger" name="no" value="いいえ">
                </form>
                </div>
            </div>
        <%// }else{ %>
            <h1>入力が不完全です</h1>
            <%//=ViewHelper.chkUserInfo(chkList) %><br>
            <form action="registration" method="POST">
                <input type="hidden" name="ac"  value="<%= session.getAttribute("ac")%>">
                <input type="submit" name="back" value="新規登録画面に戻る">
            </form>
        <%// } %>
            <form action="insert" method="POST">
                <input type="submit" name="no" value="登録画面に戻る">
                <input type="hidden" name="mode" value="REINPUT">
            </form><br>
            <%@ include file="footer.jsp"%>
         
        </div>
    </div>
    </body>
</html>