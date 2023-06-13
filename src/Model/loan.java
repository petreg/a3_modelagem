package Model;

import java.util.*;
import DAO.loanDAO;
import java.sql.SQLException;
public class loan {
    
    private int tool_id;
    private int id_friend;
    private int id;
    private boolean status;
    private final loanDAO dao;
    
    public loan(){
        this.dao = new loanDAO();
    }
    
    public loan(int tool_id, int id_friend, boolean status, int id) {
        this.tool_id = tool_id;
        this.id_friend = id_friend;
        this.status = status;
        this.id = id;
        this.dao = new loanDAO();
    }

    public int getTool_id() {
        return tool_id;
    }

    public void setTool_id(int tool_id) {
        this.tool_id = tool_id;
    }

    public int getId_friend() {
        return id_friend;
    }

    public void setTel(int id_friend) {
        this.id_friend = id_friend;
    }
    
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    public int getId(){
        return id;
    }
    
     public void setId(int id) {
        this.id = id;
    }

    public void setFriend_id(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
