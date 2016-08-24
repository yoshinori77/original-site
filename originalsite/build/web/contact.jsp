<%-- 
    Document   : contact
    Created on : 2016/08/19, 11:45:04
    Author     : yoshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">
        <link href="http://getbootstrap.com/examples/sticky-footer/sticky-footer.css" rel="stylesheet">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div class="jumbotron" style="margin-top: 50px;">
            <form action="ContactConfirm" method="POST">
                <div class="row" style="margin-left: 20px">
                    <div class="col-sm-2">
                        <label for="namae">お名前：</label>
                    </div>
                    <div class="col-sm-10">
                        <input type="text" name="name" placeholder="name" style="width: 300px; margin-bottom: 10px">
                    </div>
                    <div class="col-sm-2">
                        <label for="address" >メールアドレス：</label>
                    </div>
                    <div class="col-sm-10">
                        <input type="text" name="email" placeholder="Email" style="width: 300px; margin-bottom: 10px">
                    </div>
                    <div class="col-sm-2">
                        <label for="otoiawose" >お問い合わせの種類：</label>
                    </div>
                    <div class="col-sm-10">
                        <select name="category" style="margin-bottom: 10px">
                            <option value="サービスの不具合">サービスの不具合</option>
                            <option value="個人情報">個人情報</option>
                            <option value="企業について">企業について</option>
                        </select>
                    </div>
                    <div class="col-sm-2">
                        <label for="address" >件名：</label>
                    </div>
                    <div class="col-sm-10">
                        <input type="text" name="subject" placeholder="Subject" style="margin-bottom: 10px">
                    </div>
                    <div class="col-sm-2">
                        <label for="naiyou" >お問い合わせ内容：</label>
                    </div>
                    <div class="col-sm-10">
                        <textarea name="message" rows="4" cols="40" placeholder="Content" style="margin-bottom: 10px"></textarea>
                    </div>
                    <div class="col-sm-2">
                        <input type="submit" class="btn btn-primary" value="送信">
                    </div>
                </div>
            </form>
        </div>
        <%@ include file="footer.jsp" %>
    </body>
</html>
