package Model;

import DAO.friendsDAO;
import java.sql.SQLException;

public class Friends {

    private String name;
    private int tel;
    private int id;
    private final friendsDAO dao;
    
    public Friends(){
        this.dao = new friendsDAO();
    }

    public Friends(String name, int tel, int id){
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

     public int maiorID() throws SQLException{
        return dao.maiorID();
    }  
        
     public boolean InsertFriend(String name, int tel) throws SQLException {
        int id = this.maiorID() + 1;
        Friends objeto = new Friends(name, tel, id);
        dao.InsertFriends(objeto);
        return true;

    }
}
