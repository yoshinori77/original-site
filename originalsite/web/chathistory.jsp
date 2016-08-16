<%-- 
    Document   : slack
    Created on : 2016/07/17, 21:46:04
    Author     : yoshi
--%>
<%@page import="model.ViewHelper"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.SlackData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<SlackData> arrayChat = (ArrayList<SlackData>)session.getAttribute("arrayChat");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"  type="text/css" href="css/bootstrap.css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div class="jumbotron" style="margin-top: 50px">
            <div class="container">
                <% for(int i = 0; i < arrayChat.size(); i++){ %>
                <p><%= arrayChat.get(i).getText().replaceAll("\"", "") %></p>
            <% } %>

            <form action="PostComplete" method="GET">
                <input type="text" name="text" value="">
                <input type="submit" name="btnSubmit" value="送信">
            </form>

                <div>
                    <ul class="pagination">
                        <li class="disabled"><a href="">&laquo;</a></li>
                        <li class="active"><a href="">1</a></li>
                        <li><a href="">2</a></li>
                        <li><a href="">3</a></li>
                        <li><a href="">&raquo;</a></li>
                    </ul>
                </div>
                <%= ViewHelper.getInstance().top() %>
            </div>
        </div>
        <%@ include file="footer_home.jsp" %>
    </body>
</html>
