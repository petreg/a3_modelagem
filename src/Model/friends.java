package Model;

import java.util.*;
import DAO.friendsDAO;
import java.sql.SQLException;

public class friends {

    private String name;
    private int tel;
    private int id;
    private final friendsDAO dao;
    
    public friends(){
        this.dao = new friendsDAO();
    }

    public friends(String name, int tel, int id){
        this.name = name;
        this.tel = tel;
        this.id = id;
        this.dao = new friendsDAO();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    
    public int getId(){
        return id;
    }
    
     public void setId(int id) {
        this.id = id;
    }

}
