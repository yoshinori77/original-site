<%-- 
    Document   : header
    Created on : 2016/08/08, 10:24:51
    Author     : yoshi
--%>
<%--<%@page import="jums.UserData"%>--%>
<%@page import="javax.servlet.http.HttpSession"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--<div class="header">
    <div class="linkleft clearfix"><a href="SearchChannel">Search channel</a></div>
    <div class="linkleft clearfix"><a href="CreateChannel">Create channel</a></div>
    <div class="text clearfix">Put<span>Out</span></div>
    <div class="linkright clearfix"><a href="Login">Log in</a></div>
    <div class="linkright clearfix"><a href="SignUp">Sign up</a></div>
</div>
    -->
<nav class="navbar navbar-default navbar-fixed-top" style="margin: 0 auto;">
    <div class="navbar-header">
        <button class="navbar-toggle" data-toggle="collapse" data-target=".target">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" style="font-size: 20px;">Put<span style="color: red;">Out</span></a>
    </div>
    <div class="collapse navbar-collapse target">
        <ul class="nav navbar-nav navbar-right" style="margin: 0 auto;">
            <li><a href="Chat">Search channel</a></li>
            <li><a href="CreateChannel">Create channel</a></li>
            <li><a href="">Log in</a></li>
            <li><a href="">Sign up</a></li>
        </ul>
    </div>
</nav>

