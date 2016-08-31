<%-- 
    Document   : footer_home
    Created on : 2016/08/14, 14:16:09
    Author     : yoshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav class="navbar navbar-default nav navbar-fixed-bottom" style="margin: 0 auto;">
    <div class="navbar-header">
        <a class="navbar-brand" href="" onclick="document.contact.submit();return false;">Contact</a>
            <form name="contact" method="POST" action="Contact">
                <input type="hidden" name="ac" value=<%= (Integer)session.getAttribute("ac")%>>
            </form>
    </div>
    <div class="row">
        <div class="col-sm-3 navbar-right">
            <ul class="nav navbar-nav navbar-right">
                <li class="hidden-xs col-sm-1"><a href=""><img src="asset/twitter-logo.png" style="width: 20px;"></a></li>
                <li class="hidden-xs col-sm-1"><a href=""><img src="asset/facebook-logo.jpg" style="width: 20px;"></a></li>
                <li class="hidden-xs col-sm-1"><a href=""><img src="asset/GooglePlus-Logo.png" style="width: 20px;"></a></li>
            </ul>
        </div>
    </div>
</nav>