<%-- 
    Document   : footer_home
    Created on : 2016/08/14, 14:16:09
    Author     : yoshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container">
<nav class="navbar navbar-default nav navbar-fixed-bottom" style="margin: 0 auto;">
    <div class="navbar-header">
        <a class="navbar-brand" href="" onclick="document.contact.submit();return false;">Contact</a>
            <form name="contact" method="POST" action="Contact">
                <input type="hidden" name="ac" value=<%= (Integer)session.getAttribute("ac")%>>
            </form>
    </div>
    <div class="row" style="margin-right: 50px">
        <div class="col-xs-1 navbar-right"  style="margin: 0 auto;">
            <ul class="nav navbar-nav navbar-right">
                <li class="col-xs-1"><a href=""><img src="asset/twitter-logo.png" style="width: 20px;"></a></li>
                <li class="col-xs-1"><a href=""><img src="asset/facebook-logo.jpg" style="width: 20px;"></a></li>
                <li class="col-xs-1"><a href=""><img src="asset/GooglePlus-Logo.png" style="width: 20px;"></a></li>
            </ul>
        </div>
    </div>
</nav>
</div>