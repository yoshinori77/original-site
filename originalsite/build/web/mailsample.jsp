<%-- 
    Document   : mailsample
    Created on : 2016/08/21, 21:55:31
    Author     : yoshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="MailSample" method="POST">
            <label for="address" >メールアドレス：</label>
            <input type="text" name="email" placeholder="Email">
            <label for="address" >件名：</label>
            <input type="text" name="subject" placeholder="Subject">
            <label for="naiyou" >お問い合わせ内容：</label>
            <textarea name="message" id="contentid" rows="4" cols="40" placeholder="Message"></textarea>
            <input type="submit" id="createMessageButton" value="送信">
        </form>
    </body>
</html>
