<%-- 
    Document   : channellist
    Created on : 2016/07/19, 12:52:44
    Author     : yoshi
--%>

<%@page import="jums.SlackApi"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jums.SlackData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<SlackData> arrayChannel = (ArrayList<SlackData>)session.getAttribute("arrayChannel");
    SlackApi api = new SlackApi();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% for(int i = 0; i < arrayChannel.size(); i++){ %>
            <form action="ChatHistory" method="GET">
                <input type="hidden" name="channelID" value=<%= arrayChannel.get(i).getChannel()%>>
                <input type="submit" name="btnSubmit" value=<%= arrayChannel.get(i).getText() %>>
            </form><br>
            <%= arrayChannel.get(i).getChannel() %>  
            
        <% } %><br>
        
        
        <form action="ChatHistory" method="GET">
            <input type="text" name="channelID" value="">
            <input type="submit" name="btnSubmit" value="送信">
        </form>
    </body>
</html>
