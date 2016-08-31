<%-- 
    Document   : logoutDialog
    Created on : 2016/08/30, 16:24:38
    Author     : yoshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="logoutMsg">
    ログアウトしました！
</div>

<script type="text/javascript">
    $(function() {
        if(logoutDialogFlg) {
            $('#logoutMsg').dialog({
                autoOpen: true,
                buttons: {
                    'OK': function() {
                        $(this).dialog('close');
                    }
                },
                title: "Logout",
                modal: true
            });
            logoutDialogFlg = false;
        };
    });
</script>