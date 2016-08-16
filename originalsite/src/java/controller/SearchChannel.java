/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.SlackApi;
import model.SlackData;


/**
 *
 * @author yoshi
 */
public class SearchChannel extends HttpServlet {

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
            ArrayList<SlackData> arrayChannel = api.getChannelList();
            session.setAttribute("arrayChannel", arrayChannel);
            
            // ChatHistory ここから
            String channelID = "";
            if(request.getParameter("channelID") == null && session.getAttribute("channelID") == null) {
                channelID = "C1T0G8KDH";
            } else if(request.getParameter("channelID") == null) {
                channelID = (String) session.getAttribute("channelID");
            } else {
                channelID = request.getParameter("channelID");
            }
            
            String channelName = "";
            if(request.getParameter("channelName") == null && session.getAttribute("channelName") == null) {
                channelName = "general";
            } else if(request.getParameter("channelName") == null) {
                channelName = (String)session.getAttribute("channelName");
            } else {
                channelName = request.getParameter("channelName");
            }
            
            session.setAttribute("channelID", channelID);
            session.setAttribute("channelName", channelName);
            ArrayList<SlackData> arrayChat = api.getChannelHistory(channelID);
            session.setAttribute("arrayChat", arrayChat);
            // ChatHistory ここまで
            
            ArrayList<String> arrayUserID = new ArrayList();
            for(int i=0; i < arrayChat.size(); i++) {
                arrayUserID.add(arrayChat.get(i).getUserID());
            }
            
            ArrayList<SlackData> arrayImageUrl = new ArrayList();
            for(int i = 0; i < arrayUserID.size(); i++) {
                arrayImageUrl.add(api.getUserInfo(arrayUserID.get(i)));
            }
            session.setAttribute("arrayImageUrl", arrayImageUrl);
            
            request.getRequestDispatcher("/searchchannel.jsp").forward(request, response);
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
