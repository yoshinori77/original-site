/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Access;
import model.UserData;
import model.UserDataDAO;
import model.UserDataDTO;

/**
 *
 * @author yoshi
 */
public class LoginCheck extends HttpServlet {

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
        UserDataDTO udd = new UserDataDTO();
        UserData ud = new UserData();
        HttpSession session = request.getSession();
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        ud.setName(name);
        ud.setPassword(password);
        ud.UD2DTOMapping(udd);
        try {
            /*非ログイン状態でのみアクセス可能
            入力フォームの確認と、ログイン判定に使用するuserIDをsessionに入れて他のページで使いまわす*/
            Access.accessRootCheck(request, response);
            
            UserDataDTO userdata = UserDataDAO.getInstance().LoginCheck(udd);
            ud.DTO2UDMapping(userdata);
            
            if (ud.getUserID() > 0) {
                session.setAttribute("userdata", ud);
                session.setAttribute("loginFlg", true);
                request.setAttribute("loginDialogFlg", true);
                String preUrl = session.getAttribute("referer").toString().substring(34);
                request.getRequestDispatcher(preUrl).forward(request, response);
            } else {
                request.setAttribute("error", "名前かパスワードが違います");
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }
        } catch (Exception e) {
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

//        try {
//            request.setCharacterEncoding("UTF-8");
//            
//            String name = request.getParameter("name");
//            String password = request.getParameter("password");
//            
//            ud.setName(name);
//            ud.setPassword(password);
//            
//            ud.UD2DTOMapping(udd);
//            
//            System.out.print("---------------------");
//            System.out.print(udd.getName());
//            System.out.print(udd.getPassword());
//            System.out.print(UserDataDAO.getInstance().LoginCheck(udd));
//            
//            udd = UserDataDAO.getInstance().LoginCheck(udd);
//            ud.DTO2UDMapping(udd);
//            
//            if (ud.getUserID() > 0) {
//                session.setAttribute("ud", ud);
//                request.getRequestDispatcher(session.getAttribute("referer").toString().substring(35)).forward(request, response);
//            } else {    
//                request.setAttribute("error", "名前かパスワードが違います");
//                request.getRequestDispatcher("/login.jsp").forward(request, response);
//            }
//        }catch (Exception e) {
//            request.setAttribute("error", e.getMessage());
//            request.getRequestDispatcher("/error.jsp").forward(request, response);
//        }
//    }

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