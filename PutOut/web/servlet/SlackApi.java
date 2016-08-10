package jums;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yoshi
 */
public class SlackApi {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
    public static ArrayList<SlackData> getChannelHistory(String channelID){
        ArrayList<SlackData> al = new ArrayList(); 
        String result = "";
        JsonNode head = null;
        final String baseUrl = "https://slack.com/api/channels.history";
        final String token = "xoxp-61076517457-61016290051-61101841751-07e6c85dc5";
        try{
            String channel = URLEncoder.encode(channelID, "utf-8");
            URL url = new URL(baseUrl + "?token=" + token + "&channel=" + channelID + "&oldest");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.connect();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String tmp = "";
            while ((tmp = in.readLine()) != null) {
                result += tmp;
            }
            
            JsonFactory jfactory = new JsonFactory();
            JsonParser parser = jfactory.createParser(result);
            ObjectMapper mapper = new ObjectMapper();
            
            head = mapper.readTree(parser);
            
            for (int i = 0; i < 20; i++) {
                SlackData sd = new SlackData();
                sd.setUserID(head.get("messages").get(i).get("user").toString());
                sd.setText(head.get("messages").get(i).get("text").toString());
                sd.setTimeStamp(head.get("messages").get(i).get("ts").toString());
                al.add(sd);
            }
            in.close();
            con.disconnect();
            }catch(Exception e){
                e.printStackTrace();
            }
        return al;
    }
    
    public static ArrayList<SlackData> getChannelList(){
        ArrayList<SlackData> al = new ArrayList(); 
        String result = "";
        JsonNode head = null;
        final String baseUrl = "https://slack.com/api/channels.list";
        final String token = "xoxp-61076517457-61016290051-61101841751-07e6c85dc5";
        try{
            URL url = new URL(baseUrl + "?token=" + token);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.connect();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String tmp = "";
            while ((tmp = in.readLine()) != null) {
                result += tmp;
            }
            
            JsonFactory jfactory = new JsonFactory();
            JsonParser parser = jfactory.createParser(result);
            ObjectMapper mapper = new ObjectMapper();
            
            head = mapper.readTree(parser);
            
            for (int i = 0; i < 20; i++) {
                SlackData sd = new SlackData();
                sd.setChannel(head.get("channels").get(i).get("id").toString());
                sd.setText(head.get("channels").get(i).get("name").toString());
                al.add(sd);
            }
            in.close();
            con.disconnect();
            }catch(Exception e){
                e.printStackTrace();
            }
        return al;
    }
    
    public static void postMessage(String text){
        ArrayList<SlackData> al = new ArrayList(); 
        String result = "";
        JsonNode head = null;
        final String baseUrl = "https://slack.com/api/chat.meMessage";
        final String token = "xoxp-61076517457-61016290051-61101841751-07e6c85dc5";
        try{
            URL url = new URL(baseUrl + "?token=" + token + "&channel=" + "C1T0G8KDH" + "&text=" + text);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.connect();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String tmp = "";
            while ((tmp = in.readLine()) != null) {
                result += tmp;
            }
            
            JsonFactory jfactory = new JsonFactory();
            JsonParser parser = jfactory.createParser(result);
            ObjectMapper mapper = new ObjectMapper();
            
            head = mapper.readTree(parser);
            
            in.close();
            con.disconnect();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void channelCreate(String name){
        final String baseUrl = "https://slack.com/api/channels.create";
        final String token = "xoxp-61076517457-61016290051-61101841751-07e6c85dc5";
        try{
            URL url = new URL(baseUrl + "?token=" + token + "&name=" + name);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.connect();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            
            in.close();
            con.disconnect();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
