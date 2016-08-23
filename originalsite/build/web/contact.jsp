<%-- 
    Document   : contact
    Created on : 2016/08/19, 11:45:04
    Author     : yoshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">
        <link href="http://getbootstrap.com/examples/sticky-footer/sticky-footer.css" rel="stylesheet">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div class="jumbotron" style="margin-top: 50px;">
            <form action="ContactConfirm" id="buttonsArea" method="POST">
                <div>
                    <label for="namae">名前：</label>
                    <input type="text" name="name" placeholder="name">
                </div>
                <div>
                    <label for="address" >メールアドレス：</label>
                    <input type="text" name="email" placeholder="Email">
                </div>
                <div>
                <label for="otoiawose" >お問い合わせの種類：</label>
                    <select name="category">
                        <option value="service">サービスの不具合</option>
                        <option value="individual">個人情報</option>
                        <option value="company">企業について</option>
                    </select>
                </div>
                <div>
                    <label for="naiyou" >お問い合わせ内容：</label>
                    <textarea name="content" id="contentid" rows="4" cols="40" placeholder="Content"></textarea>
                    
                    <input type="submit" id="createMessageButton" value="送信"><input type="reset" value="リセット">
                    <div class="row" id="authorizeArea" style="display: none;">
                        <div class="col-lg-12">
                            <button id="authorize-button" class="btn btn-default">認可</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
        <%@ include file="footer.jsp" %>
        
        <!-- endbuild -->
        <script src="http://code.jquery.com/jquery.js"></script>
        <script src="scripts/main.js"></script>
        <script type="text/javascript" charset="utf-8" >
        var clientId = "162183619368-c30sebmua09ifro40ickfc916b8ftehd.apps.googleusercontent.com";
        var scopes = ["https://mail.google.com/"].join(",");
        //https://mail.google.com/スコープはすべての権限を持ったスコープだけど、Threadやメッセージの削除を行いたい場合のみに利用するべき
        //それ以外にいかが有る。
        //https://www.googleapis.com/auth/gmail.modify
        //https://www.googleapis.com/auth/gmail.readonly
        //https://www.googleapis.com/auth/gmail.compose 
        function handleClientLoad() {
            window.setTimeout(checkAuth,1);
        }

        function checkAuth() {
            gapi.auth.authorize({client_id: clientId, scope: scopes, immediate: true}, handleAuthResult);
        }

        function handleAuthResult(authResult) {
            var $authorizeArea = $("#authorizeArea"),
            $buttonsArea = $("#buttonsArea");
            if (authResult && !authResult.error) {
                //エラーがなければ認可ボタン消して操作ボタン群オープンする
                $authorizeArea.hide();

                gapi.client.load("gmail","v1", function(){

                $buttonsArea
                    .find("#createMessageButton")
                        .on("click", createMessage)
                    .end()
                    .show();
                });

            } else {
                $buttonsArea.hide();
                $authorizeArea
                    .find("#authorize-button")
                        .on("click", handleAuthClick)
                    .end()
                    .show();
            }
        }

        function handleAuthClick(event) {
            // Step 3: get authorization to use private data
            gapi.auth.authorize({client_id: clientId, scope: scopes, immediate: false}, handleAuthResult);
            return false;
        }

        function createMessage() {


            var $result = $("#result");
            var from = $("email");
            var to = "yoshinoriyamashita123@gmail.com";
            var content = getElementByID("contentid").value;

            var mimeData = "From: " + from+ "\n" + "To: " + to + "\n" + "Subject: test\n" + "MIME-Version: 1.0\n" +  "Content-Type: text/plain; charset=UTF-8\n" + "\n\n Test" + content;

            var b = window.btoa( unescape(encodeURIComponent( mimeData )) );

            //users.message.insertだけはpostでrawデータを送る必要がある。

            $.ajax("https://content.googleapis.com/gmail/v1/users/me/messages", {
                dataType : "json",
                type : "POST",
                contentType : "application/json",
                data  : JSON.stringify({ raw : b}),
                headers : {
                    "Authorization" : "Bearer " + gapi.auth.getToken().access_token
                }
            }).done(function(result){
                console.log(result);
                $result.text(JSON.stringify(result, "", "\t"));
                if (result && !result.error) {
                    window.alert("メールを保存しました。 Gmailにて「すべてのメールを見る」から確認して下さい。")
                }
            });
        }


        </script>
        <script src="https://apis.google.com/js/client.js?onload=handleClientLoad"></script> <!-- ① -->
    </body>
</html>
