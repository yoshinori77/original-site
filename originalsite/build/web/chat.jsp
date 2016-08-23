<%-- 
    Document   : channellist
    Created on : 2016/07/19, 12:52:44
    Author     : yoshi
--%>

<%@page import="model.ViewHelper"%>
<%@page import="model.SlackApi"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.SlackData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<SlackData> arrayChannel = (ArrayList<SlackData>)session.getAttribute("arrayChannel");
    SlackApi api = new SlackApi();
    // chathistory.jspのため
    ArrayList<SlackData> arrayChat = (ArrayList<SlackData>)session.getAttribute("arrayChat");
    String channelID = (String)session.getAttribute("channelID");
    String channelName = (String)session.getAttribute("channelName");
    ArrayList<SlackData> arrayImageUrl = (ArrayList<SlackData>)session.getAttribute("arrayImageUrl");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet"  type="text/css" href="css/bootstrap.css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">
        <style>
            .btn {
                margin: 1% 0 0 2%;
            }
            
            .selected {
                color: red !important;
                background: red !important;
            }
        </style>
    </head>
    <body>
    <script>
        $(function(){
            $("input").click(function(){
                $(".btn-lg").addClass("selected");
            })
        }());
    </script>
        <%@ include file="header.jsp" %>
        <div class="jumbotron" style="margin-top: 50px">
            <div class="container">
                <div class="row">
                    <h2><%= channelName %></h2>
                    <div class="col-sm-2 hidden-xs bg-primary" style="text-align: center">
                        <div style="margin-top: 10px">
                            <% for(int i = 0; i < arrayChannel.size(); i++){ %>
                                <form action="Chat" method="GET">
                                    <input type="hidden" name="channelID" value=<%= arrayChannel.get(i).getChannel()%>>
                                    <p><input type="submit" name="channelName" class="btn btn-primary btn-lg" style="outline: 0; border: 0" value=<%= arrayChannel.get(i).getText() %>></p>
                                </form>
                            <% } %><br>
                        </div>
                    </div>
                
                    <div class="col-sm-7 col-xs-10" style="margin-left: 20px">
                        <% for(int i = arrayChat.size() -1; i >= 0; i--){ %>
                            <p><img src=<%=arrayImageUrl.get(i).getImageUrl()%>></p>
                            <p><%= arrayChat.get(i).getText().replaceAll("\"", "") %></p>
                        <% } %>

                        <form action="PostComplete" method="POST">
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
                    </div>
                </div>
            </div>
        </div>
        <%@ include file="footer.jsp" %>  
    </body>
</html>
