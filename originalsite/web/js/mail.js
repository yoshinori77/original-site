/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * メーラーを起動してメールを送信する
 */

window.onload = function() {

    /**
   * メールに記載する情報を格納する変数
   */
    var address, subject, body, hiddenData;
    var sendmail = document.getElementById('mail');

    sendmail.onclick = function() {

        // メールに記載したい情報をhiddenタグから取得
        hiddenData = document.getElementById('hidden_data').value;
        address = 'yoshinoriyamashita123@gmail.com';
        subject = '件名';
        body = '本文' + '%0D%0A' + hiddenData; // 「'%0D%0A'」を入れて改行

        // 「'?cc='」部分でCC追加
        location.href = 'mailto:' + address + '&subject=' + subject + '&body=' + body;
    };

};

