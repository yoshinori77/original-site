/*
このcontrollerにchat画面の機能を詰め込んだ
1つの画面でchannelの選択とチャット機能を実現したかったため

実装した機能
1. Slackのチャンネル一覧を取得する
2. チャットの履歴を取得する
3. ユーザー情報を取得する(名前、プロフィール画像)
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ChatUtil;
import model.SlackApi;
import model.SlackData;


/**
 *
 * @author yoshi
 */
public class Chat extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        SlackApi api = new SlackApi();
        try {
//            1. Slackのチャンネル一覧を取得する
            ArrayList<SlackData> arrayChannel = api.getChannelList();
            session.setAttribute("arrayChannel", arrayChannel);
            
//            2. チャットの履歴を取得する
            ChatUtil chat = new ChatUtil();
            ArrayList<String> channelPrm = chat.findChannelPrm(request, response);
            String channelID = channelPrm.get(0);
            String channelName = channelPrm.get(1);
            ArrayList<SlackData> arrayChat = api.getChannelHistory(channelID);
            session.setAttribute("channelID", channelID);
            session.setAttribute("channelName", channelName);
            session.setAttribute("arrayChat", arrayChat);
            
//            3. ユーザー情報を取得する(プロフィール画像)
            ArrayList<String> arrayUserID = new ArrayList();
            for(int i=0; i < arrayChat.size(); i++) {
                arrayUserID.add(arrayChat.get(i).getUserID());
            }
            ArrayList<SlackData> arrayImageUrl = new ArrayList();
            for(int i = 0; i < arrayUserID.size(); i++) {
                arrayImageUrl.add(api.getUserInfo(arrayUserID.get(i)));
            }
            session.setAttribute("arrayImageUrl", arrayImageUrl);
            
            request.getRequestDispatcher("/chat.jsp").forward(request, response);
        } catch(Exception e){
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
