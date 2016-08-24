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
public class UserData {
    private int userID;
    private String name;
    private String password;
    private String email;
    private int sex;
    private String address;
    private String category;
    private String subject;
    private String message;
    
    public UserData(){
        userID = 0;
        name = "";
        password = "";
        email = "";
        sex = 0;
        address = "";
        category = "";
        subject = "";
        message = "";
    }
    
    public int getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = Integer.parseInt(userID);
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getSex() {
        return sex;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }
    
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    
    // UserDataBeansの各パラメータをDTOにセット
    public void UD2DTOMapping(UserDataDTO udd){
        udd.setUserID(this.userID);
        udd.setName(this.name);
        udd.setPassword(this.password);
        udd.setEmail(this.email);
        udd.setSex(this.sex);
        udd.setAddress(this.address);
    }
    
    // DTOの各パラメータをUserDataBeansにセット
    public void DTO2UDMapping(UserDataDTO udd) {
        this.userID = udd.getUserID();
        this.name = udd.getName();
        this.password = udd.getPassword();
        this.email = udd.getEmail();
        this.sex = udd.getSex();
        this.address = udd.getAddress();
    }
    
}
