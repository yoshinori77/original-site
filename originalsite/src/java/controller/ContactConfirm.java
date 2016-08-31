/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Access;
import model.UserData;

/**
 *
 * @author yoshi
 */
public class ContactConfirm extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        Access.accessRootCheck(request, response);
        final String address = "yoshinoriyamashita123@gmail.com";
        final String password = "Yy19910612";
        final String host = "smtp.gmail.com";
        final String port = "587";
        final String starttls = "true";
        final String encoding = "base64";
        // final String charset = "iso-2022-jp";
        final String charset = "utf-8";
        final String userName = request.getParameter("name");
        final String userMail = request.getParameter("email");
        final String category = request.getParameter("category");
        final String subject = request.getParameter("subject");
        final String message = request.getParameter("message");
        Properties props = new Properties();
        props.put("mail.smtp.user", address);
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.starttls.enable", starttls);
        props.put("mail.transport.protocol", "smtps");
        // props.put("mail.smtp.debug", "true");
        // props.put("mail.debug", "true");
        // props.put("mail.smtp.connectiontimeout", "5000");
        // props.put("mail.smtp.timeout", "5000");
        // props.put("mail.user", "******");
        // props.put("mail.host", "smtp.gmail.com");
        // 宛先の作成
        String[] to = new String[1];
        to[0] = "yoshinoriyamashita123@gmail.com";
        InternetAddress[] toAddress = new InternetAddress[to.length];
        try {
            for (int i = 0; i < to.length; i++) {
                    toAddress[i] = new InternetAddress(to[i]);
            }
        } catch (AddressException e) {
            e.printStackTrace();
            return;
        }
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(address, password);
            }
        });
        try {
            MimeMessage mimeMessage = new MimeMessage(session);

            // 宛先の設定
            mimeMessage.setRecipients(MimeMessage.RecipientType.TO, toAddress);
            // mimeMessage.setRecipients(MimeMessage.RecipientType.CC,
            // toAddress);
            // mimeMessage.setRecipients(MimeMessage.RecipientType.BCC,
            // toAddress);
            // エンコード設定
            mimeMessage.setHeader("Content-Transfer-Encoding", encoding);
            // 送信元の設定
            mimeMessage.setFrom(new InternetAddress(address));
            // サブジェクトの設定
            mimeMessage.setSubject(userName + "-" + subject, charset);
            // 本文の設定
            mimeMessage.setText(category + "\n" + message + "\n" + userMail, charset);
            // // テキスト以外のデータの設定
            // String html = "<html><body><h1>hello,メール!</h1></body></html>";
            // mimeMessage.setContent(html, "text/html;iso-2022-jp;");
            //
            // // 画像の設定
            // DataSource dataSource = new FileDataSource("sample.jpeg"); //
            // 送る画像ファイルを指定
            // DataHandler dataHandler = new DataHandler(dataSource); //
            // DataHandlerの作成
            // mimeMessage.setDataHandler(dataHandler); // メールに設定
            // // マルチパートの設定
            // MimeMultipart multipart = new MimeMultipart();
            // // パート1に本文を設定
            // MimeBodyPart bodyPart1 = new MimeBodyPart();
            // bodyPart1.setText("このメールには画像ファイルが添付されています。", "iso-2022-jp");
            // multipart.addBodyPart(bodyPart1); // マルチパートにパート１を追加
            // // パート2に画像ファイルを設定
            // MimeBodyPart bodyPart2 = new MimeBodyPart();
            // DataSource dataSource = new FileDataSource("sample.jpeg");
            // DataHandler dataHandler = new DataHandler(dataSource);
            // bodyPart2.setDataHandler(dataHandler);
            // multipart.addBodyPart(bodyPart2); // マルチパートにパート2を追加
            // // メールにマルチパートを設定
            // mimeMessage.setContent(multipart);
            // 設定の保存
            mimeMessage.saveChanges();
            // メールの送信
            Transport.send(mimeMessage);
            
            UserData ud = new UserData();
            ud.setName(userName);
            ud.setEmail(address);
            ud.setCategory(category);
            ud.setSubject(subject);
            ud.setMessage(message);
            HttpSession hs = request.getSession();
            hs.setAttribute("ud", ud);
            
            request.getRequestDispatcher("/contactconfirm.jsp").forward(request, response);
        } catch (MessagingException e) {
            e.printStackTrace();
            return;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ContactConfirm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ContactConfirm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
