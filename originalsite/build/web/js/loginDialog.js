/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

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


