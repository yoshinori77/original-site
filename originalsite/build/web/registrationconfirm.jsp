
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
        <h1>登録確認</h1>
        ユーザー名:<%= ud.getName()%><br>
        パスワード:<%= ud.getPassword()%><br>
        メールアドレス:<%= ud.getEmail()%><br>
        住所:<%= ud.getAddress()%><br>
        上記の内容で登録します。よろしいですか？
        <form action="<%= response.encodeURL("RegistrationComplete")%>" method="POST">
            <% request.setAttribute("userdata", ud); %>
            <input type="hidden" name="ac"  value="<%= session.getAttribute("ac")%>">
            <input type="submit" name="yes" value="はい">
        </form>
        <form action="registration" method="POST">
            <input type="hidden" name="ac"  value="<%= session.getAttribute("ac")%>">
            <input type="submit" name="no" value="いいえ">
        </form><br>
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
    </body>
</html>