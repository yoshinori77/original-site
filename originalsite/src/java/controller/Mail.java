package controller;

import java.io.*;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;
import java.util.Date;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;

public class Mail extends HttpServlet {

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    String msg = "メール送信しました。";
    String text = "";

    // フォームデータ取得
    Enumeration names = request.getParameterNames();
    while (names.hasMoreElements()) {
      String name = (String)names.nextElement();
      text += "■" + name + ":\n" + request.getParameter(name) + "\n";
    }

    // メール送信
    try {
        
      Properties properties=new Properties();
      properties.setProperty("mail.smtp.host", "smtp.gmail.com");
      properties.put("mail.smtp.starttls.enable", "true"); 
properties.put("mail.smtp.host", "smtp.gmail.com");
properties.put("mail.smtp.user", "yoshinoriyamashita123@gmail.com"); // User name
properties.put("mail.smtp.password", "password"); // password
properties.put("mail.smtp.port", "587");
properties.put("mail.smtp.auth", "true");

      Session session=Session.getDefaultInstance(properties);
      
      
//      Properties pt = System.getProperties();

      // SMTP サーバーアドレス
//      pt.put("mail.smtp.host", "localhost");

      // メール準備
//      Session session = Session.getDefaultInstance(pt, null);
      MimeMessage ml = new MimeMessage(session);

      // 送信元
      ml.setFrom(new InternetAddress("yoshinoriyamashita123@gmail.com"));

      // 送信先
      ml.setRecipients(Message.RecipientType.TO, "yoshinoriyamashita123@gmail.com");

      // 形式
      ml.setHeader("Content-Type", "text/plain");

      // タイトル
      ml.setSubject("タイトル", "iso-2022-jp");

      // 本文
      text = text.replace('①', '1');
      text = text.replace('②', '2');
      text = text.replace('③', '3');
      text = text.replace('④', '4');
      text = text.replace('⑤', '5');
      text = text.replace('⑥', '6');
      text = text.replace('⑦', '7');
      text = text.replace('⑧', '8');
      text = text.replace('⑨', '9');
      text = text.replace('～', '-');
      text = text.replace('－', '-');
      ml.setText(text, "iso-2022-jp");

      // 送信日
      ml.setSentDate(new Date());

      // 送信
      Transport transport = session.getTransport("smtp");
transport.connect(null, "yoshinoriyamashita123@gmail.com", "Yy19910612");//ユーザとパスワードを指定する

      transport.send(ml);
transport.close();
    } catch (Exception e) {
      msg = "メール送信エラー<BR>" + e.toString();
    }

    // 送信結果表示
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE HTML>");
    out.println("<HTML>");
    out.println("<HEAD>");
    out.println("<META http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
    out.println("<TITLE>メール送信</TITLE>");
    out.println("</HEAD>");
    out.println("<BODY>");
    out.println("<P>" + msg + "</P>");
    out.println("</BODY>");
    out.println("</HTML>");
  }
  
  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

}