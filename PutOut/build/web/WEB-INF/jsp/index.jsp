<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18.1/build/cssreset/cssreset-min.css">
        <link rel="stylesheet" type="text/css" href="../css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="../css/index.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body> 
        <p><%@ include file="header.jsp" %></p><br>
        
        <form action="../ChannelList" method="GET">
            <input type="text" name="channelID" value="">
            <input type="submit" class="btn btn-info" name="btnSubmit" value="送信">
        </form>
        
        <button type="button" class="btn btn-info">Info</button>
        <button type="button" class="btn btn-primary btn-lg">Large button</button>
        <%//@ include file="footer.jsp" %>
    </body>
</html>
