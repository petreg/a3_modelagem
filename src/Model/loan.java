package Model;

import java.util.*;
import DAO.LoanDAO;
import java.sql.SQLException;
public class Loan {
    
    private int tool_id;
    private int id_friend;
    private int id;
    private String friend;
    private String tool;
    private boolean status;
    private Date date;
    private final LoanDAO dao;
    
    public Loan(){
        this.dao = new LoanDAO();
    }
    
    public Loan(int id){
        this.dao = new LoanDAO();
        this.id = id;
    }
    
    public Loan(int tool_id, int id_friend){
        this.tool_id = tool_id;
        this.id_friend = id_friend;
        this.dao = new LoanDAO();
    }
    
    public Loan(int tool_id, int id_friend, boolean status, int id, String friend, String tool, Date date) {
        this.tool_id = tool_id;
        this.id_friend = id_friend;
        this.status = status;
        this.id = id;
        this.friend = friend;
        this.tool = tool;
        this.date = date;
        
        this.dao = new LoanDAO();
    }

    public int getToolId() {
        return tool_id;
    }

    public void setToolId(int tool_id) {
        this.tool_id = tool_id;
    }

    public int getFriendId() {
        return id_friend;
    }

    public void setFriendId(int id_friend) {
        this.id_friend = id_friend;
    }
    
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public Date getData() {
        return date;
    }

    public void setData(Date date) {
        this.date = date;
    }

    
    public int getId(){
        return id;
    }
    
     public void setId(int id) {
        this.id = id;
    }
     
    public String getFriend(){
        return friend;
    }
    
     public void setFriend(String friend) {
        this.friend = friend;
    }
     
    public String getTool(){
        return tool;
    }
    
    public void setTool(String tool) {
        this.tool = tool;
    }
     
    public ArrayList getLoans() {
        return dao.getLoans();
    }
    
    public boolean insertLoan(int tool_id, int friend_id) {
        Loan obj = new Loan(tool_id, friend_id);
        dao.insertLoan(obj);
        return true;
    }
    
    public boolean updateLoan(int id) {
        Loan obj = new Loan(id);
        dao.updateLoan(obj);
        return true;
    }
    
    @Override
    public String toString() {
        return friend + " " + tool;
    }
}
