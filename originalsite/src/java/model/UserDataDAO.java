/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import base.DBManager;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class UserDataDAO implements Serializable {
    
    //インスタンス化
    public static UserDataDAO getInstance(){
        return new UserDataDAO();
    }
    
    public UserDataDTO LoginCheck(UserDataDTO udd) throws SQLException {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet data = null;
        con = DBManager.getConnection();
        try {
            st = con.prepareStatement("select * from user_t where name = ? and password = ?;");

            st.setString(1, udd.getName());
            st.setString(2, udd.getPassword());
            data = st.executeQuery();
            if (data.next()) {
                udd.setUserID(data.getInt("userID"));
                udd.setName(data.getString("name"));
                udd.setPassword(data.getString("password"));
                udd.setEmail(data.getString("email"));
                udd.setAddress(data.getString("address"));
                udd.setNewDate(data.getTimestamp("newDate"));
            }
            return udd;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new SQLException(e);
        } finally {
            data.close();
            st.close();
            con.close();
        }
        
    }
    
    /**
     * データの挿入処理を行う。現在時刻は挿入直前に生成
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     */
    public void signUp(UserDataDTO udd) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            st =  con.prepareStatement("INSERT INTO user_t(name,password,email,sex,address,birthday,newDate) VALUES(?,?,?,?,?,?,?)");
            st.setString(1, udd.getName());
            st.setString(2, udd.getPassword());
            st.setString(3, udd.getEmail());
            st.setInt(4, udd.getSex());
            st.setString(5, udd.getAddress());
            st.setTimestamp(6, Timestamp.valueOf(udd.getBirthday()));
            st.setTimestamp(7, new Timestamp(System.currentTimeMillis()));
            st.executeUpdate();
            System.out.println("insert completed");
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

    }
    
    /**
     * データの検索処理を行う。
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     * @return 検索結果
     */
    public UserDataDTO searchMyData(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        UserDataDTO resultUd = new UserDataDTO();
        con = DBManager.getConnection();
        
//        ArrayList<UserDataDTO> searchList = new ArrayList<UserDataDTO>();
        
        try{
            String sql = "SELECT * FROM user_t where userID=?";
            st =  con.prepareStatement(sql);
            st.setInt(1, ud.getUserID());
            // DBからユーザー情報を検索
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                resultUd.setName(rs.getString("name"));
                resultUd.setPassword(rs.getString("password"));
                resultUd.setEmail(rs.getString("email"));
                resultUd.setAddress(rs.getString("address"));
                resultUd.setNewDate(rs.getTimestamp("newDate"));
            }
            con.close();
            st.close();
            rs.close();
            
            return resultUd;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

    }
    
    /**
     * ユーザーIDによる1件のデータの検索処理を行う。
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     * @return 検索結果
     */
//    public UserDataDTO searchByID(UserDataDTO ud) throws SQLException{
//        Connection con = null;
//        PreparedStatement st = null;
//        try{
//            con = DBManager.getConnection();
//            
//            String sql = "SELECT * FROM user_t WHERE userID = ?";
//            
//            st =  con.prepareStatement(sql);
//            st.setInt(1, ud.getUserID());
//            
//            ResultSet rs = st.executeQuery();
//            rs.next();
//            UserDataDTO resultUd = new UserDataDTO();
//            resultUd.setUserID(rs.getInt(1));
//            resultUd.setName(rs.getString(2));
//            resultUd.setBirthday(rs.getDate(3));
//            resultUd.setTell(rs.getString(4));
//            resultUd.setType(rs.getInt(5));
//            resultUd.setComment(rs.getString(6));
//            resultUd.setNewDate(rs.getTimestamp(7));
//            
//            System.out.println("searchByID completed");
//
//            return resultUd;
//        }catch(SQLException e){
//            System.out.println(e.getMessage());
//            throw new SQLException(e);
//        }finally{
//            if(con != null){
//                con.close();
//            }
//        }
//    }
    
//    public void update(UserDataDTO ud) throws SQLException{
//        Connection con = null;
//        PreparedStatement st = null;
//        try{
//            con = DBManager.getConnection();
//            
//            String sql = "UPDATE user_t SET name=?, birthday=?, tell=?, type=?, comment=?, newDate=? WHERE userID=?";
//            
//            st =  con.prepareStatement(sql);
//            st.setString(1, ud.getName());
//            st.setDate(2, new java.sql.Date(ud.getBirthday().getTime()));
//            st.setString(3, ud.getTell());
//            st.setInt(4, ud.getType());
//            st.setString(5, ud.getComment());
//            st.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
//            st.setInt(7, ud.getUserID());
//
//            st.executeUpdate();
//           
//            System.out.println("update completed");
//        }catch(SQLException e){
//            System.out.println(e.getMessage());
//            throw new SQLException(e);
//        }finally{
//            if(con != null){
//                con.close();
//            }
//        }
//
//    }
    
    
    public void delete(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            
            String sql = "DELETE FROM user_t WHERE userID=?";
            
            st =  con.prepareStatement(sql);
            st.setInt(1, ud.getUserID());

            st.executeUpdate();
           
            System.out.println("delete completed");
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

    }
    
}
