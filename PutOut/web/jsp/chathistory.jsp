<%-- 
    Document   : slack
    Created on : 2016/07/17, 21:46:04
    Author     : yoshi
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="jums.SlackData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<SlackData> arrayChat = (ArrayList<SlackData>)session.getAttribute("arrayChat");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% for(int i = 0; i < arrayChat.size(); i++){ %>
            <p><%= arrayChat.get(i).getText() %></p>
        <% } %>
        
        <form action="PostComplete" method="GET">
            <input type="text" name="text" value="">
            <input type="submit" name="btnSubmit" value="送信">
        </form>
    </body>
</html>
