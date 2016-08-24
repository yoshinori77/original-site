<%-- 
    Document   : header
    Created on : 2016/08/08, 10:24:51
    Author     : yoshi
--%>
<%--<%@page import="jums.UserData"%>--%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav class="navbar navbar-default navbar-fixed-top" style="margin: 0 auto;">
    <div class="navbar-header">
        <button class="navbar-toggle" data-toggle="collapse" data-target=".target">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a href="/originalsite" class="navbar-brand" style="font-size: 20px;">Put<span style="color: red;">Out</span></a>
    </div>
    <div class="collapse navbar-collapse target">
        <ul class="nav navbar-nav navbar-right" style="margin: 0 auto;">
            <li>
                <a href="" onclick="document.searchchannel.submit();return false;">Search channel</a>
                <form name="searchchannel" method="POST" action="Chat">
                    <input type="hidden" name="ac" value=<%= (Integer)session.getAttribute("ac")%>>
                </form>
            </li>
            <li>
                <a href="" onclick="document.createchannel.submit();return false;">Create channel</a>
                <form name="createchannel" method="POST" action="CreateChannel">
                    <input type="hidden" name="ac" value=<%= (Integer)session.getAttribute("ac")%>>
                </form>
            </li>
            <li><a href="" onclick="document.login.submit();return false;">Log in</a>
                <form name="login" method="POST" action="Login">
                    <input type="hidden" name="ac" value=<%= (Integer)session.getAttribute("ac")%>>
                </form>
            </li>
            <li><a href="" onclick="document.signup.submit();return false;">Sign up</a>
                <form name="signup" method="POST" action="Registration">
                    <input type="hidden" name="ac" value=<%= (Integer)session.getAttribute("ac")%>>
                </form>
            </li>
        </ul>
    </div>
</nav>

