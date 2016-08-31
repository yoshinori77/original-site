<%-- 
    Document   : loginDialog
    Created on : 2016/08/30, 16:21:22
    Author     : yoshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="loginMsg">
    ログインしました！
</div>

<script type="text/javascript">
    $(function() {
        if(loginDialogFlg) {
            $('#loginMsg').dialog({
                autoOpen: true,
                buttons: {
                    'OK': function() {
                        $(this).dialog('close');
                    }
                },
                title: "Login",
                modal: true
            });
            loginDialogFlg = false;
        };
    });
</script>