/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author yoshi
 */
public class ViewHelper {
    
    public static ViewHelper getInstance(){
        return new ViewHelper();
    }
    final String topURL = "/originalsite";
    
    //トップへのリンクを返却
    public String top(){
        return "<a href=\""+ topURL + "\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-home\"></span> トップへ戻る</a>";
    }
    
  
}
