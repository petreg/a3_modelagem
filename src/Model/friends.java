package Model;

import DAO.FriendsDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class Friends {

    private String name;
    private String tel;
    private String email;
    private int id;
    private final FriendsDAO dao;
    
    public Friends(){
        this.dao = new FriendsDAO();
    }

    public Friends(String name, String tel, String email){
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.dao = new FriendsDAO();
    }
    
    public Friends(String name, String tel, String email, int id){
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.id = id;
        this.dao = new FriendsDAO();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public int getId(){
        return id;
    }
    
     public void setId(int id) {
        this.id = id;
    }
     
    public String getEmail(){
        return email;
    }
    
     public void setEmail(String email) {
        this.email = email;
    }

     public int maiorID() throws SQLException{
        return dao.maiorID();
    }  
        
     public boolean insertFriend(String name, String tel, String email) throws SQLException {
        Friends objeto = new Friends(name, tel, email);
        dao.insertFriends(objeto);
        return true;
    }
    
    public boolean editFriend(int id, String name, String tel, String email) {
        Friends objeto = new Friends(name, tel, email, id);
        dao.editFriend(objeto);
        return true;
    }
    
    public boolean deleteFriend(int id) {
        dao.deleteFriend(id);
        return true;
    }
    
      public ArrayList getFriends() {
        return dao.getFriends();
    }

}
