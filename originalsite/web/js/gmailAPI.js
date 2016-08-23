
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var clientid = '162183619368-c30sebmua09ifro40ickfc916b8ftehd.apps.googleusercontent.com'; // 取得したクライアントID
var scopes = ['https://www.googleapis.com/auth/gmail.send'].join(' '); // スコープを配列で指定して分解

function onLoadCallbackFunction() {
  gapi.auth.authorize({'client_id': clientid, 'scope': scopes, 'immediate': true}, handleAuthResult);
}

function handleAuthClick(event) {
  gapi.auth.authorize({'client_id': clientid, 'scope': scopes, 'immediate': false}, handleAuthResult);
  return false;
}

function handleAuthResult(authResult) {
  if (authResult && !authResult.error) {
    // 認証後の処理
  } else {
    // 認証できていない時やエラーの時の処理
  }
}

gapi.client.load('gmail', 'v1', callbackFunction());

var mimeData = ["To: yoshinoriyamashita123@gmail.com",
    "Subject: =?utf-8?B?" + window.btoa(unescape(encodeURIComponent("日本語の件名"))) + "?=",
    "MIME-Version: 1.0",
    "Content-Type: text/plain; charset=UTF-8",
    "Content-Transfer-Encoding: 7bit",
    "",
    "ここから本文"].join("\n").trim();
 
var raw = window.btoa(unescape(encodeURIComponent(mimeData))).replace(/\+/g, '-').replace(/\//g, '_');

gapi.client.gmail.users.messages.send({
  'userId': 'me',
  'resource': {
    'raw': raw
  }
}).execute(function() {
  // 送信後の処理
});