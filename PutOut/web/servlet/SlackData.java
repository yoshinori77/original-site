package jums;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yoshi
 */
public class SlackData {
    private String channelID;
    private String userID;
    private String text;
    private String timeStamp; 
    
    public SlackData(){
        channelID = "";
        userID = "";
        text = "";
        timeStamp = "";
    }
    
    public String getChannel(){
        return channelID;
    }
    public void setChannel(String channelID){
        this.channelID = channelID;
    }
    
    public String getUserID(){
        return userID;
    }
    public void setUserID(String userID){
        this.userID = userID;
    }
    
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
    
    public String getTimeStamp(){
        return timeStamp;
    }
    public void setTimeStamp(String timeStamp){
        this.timeStamp = timeStamp;
    }
}
