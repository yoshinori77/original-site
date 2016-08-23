<%-- 
    Document   : mail
    Created on : 2016/08/19, 10:20:54
    Author     : yoshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>gmail api</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width">
        <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
        <!-- build:css(.tmp) styles/main.css -->
        <link rel="stylesheet" href="styles/main.css">
        <!-- endbuild -->
    </head>
    <body>
        <!--[if lt IE 10]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->


        <div class="container">
            <div class="row" id="authorizeArea" style="display: none;">
                <div class="col-lg-12">
                    <button id="authorize-button" class="btn btn-default">認可</button>
                </div>
            </div>
            <div class="row" id="buttonsArea" style="display: none;">
                <div class="col-lg-12">
                    <div class="btn-group">
                        <button id="getLabelButton" type="button" class="btn btn-default">Labelの取得</button>
                        <button id="searchButton" type="button" class="btn btn-default">検索</button>
                        <button id="createMessageButton" type="button" class="btn btn-default">空メッセージの作成</button>
                    </div>
                </div>
            </div>
            <div class="row">
                <pre id="result"></pre>

            </div>

            <div class="footer">
                <p>♥ from the Yeoman team</p>
            </div>

        </div>


        <!-- build:js scripts/vendor.js -->
        <!-- bower:js -->
        <script src="http://code.jquery.com/jquery.js"></script>
        <!-- endbower -->
        <!-- endbuild -->

        <!-- build:js({app,.tmp}) scripts/main.js -->
        <script src="scripts/main.js"></script>
        <!-- endbuild -->
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
                    .find("#getLabelButton")
                        .on("click", getLabel)
                    .end()
                    .find("#searchButton")
                        .on("click", search)
                    .end()
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

        function getLabel() {

            var $result = $("#result");

            gapi.client.gmail.users.labels.list({userId : "me"}).execute(function(result , rowData) {
                console.log(result,rowData);
                $result.text(rowData);
            });

        }

        function search() {
            var $result = $("#result");
            var searchText = window.prompt("検索文字列を入力して下さい", "label:inbox");

            if (!searchText) {
                $result.text("検索文字は何かしら入力して下さい");
            }

            gapi.client.gmail.users.threads.list({
                userId:"me",
                q: searchText
            }).execute(function(result , rowData) {
                console.log(result,rowData);
                $result.text(rowData);
            });
        }

        function createMessage() {


            var $result = $("#result");
            var from = window.prompt("fromメールアドレスを入力して下さい。", "hoge@example.com");
            var to = "yoshinoriyamashita123@gmail.com";


            var mimeData = "From: " + from+ "\n" +
"To: " + to + "\n" +
"Subject: test\n" +
"MIME-Version: 1.0\n" + 
"Content-Type: text/plain; charset=UTF-8\n" + 
"\n\n Test";

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