/*
Chatのロジックをまとめる。ただしWebAPIの実行は除く(その部分はSlackApi)
SlackAPIを利用する前に、セッションにchannelIDが格納されているかどうかの条件分岐など
 */
package model;


import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author yoshi
 */
public class ChatUtil extends HttpServlet {
    
    public ArrayList<String> findChannelPrm (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
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
        
        ArrayList<String> channelPrm = new ArrayList();
        channelPrm.add(channelID);
        channelPrm.add(channelName);
        return channelPrm; 
    }
    
}
