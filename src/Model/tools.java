package Model;

import java.util.*;
import DAO.toolsDAO;
import java.sql.SQLException;

public class tools{

    private String name;
    private String mark;
    private int cost;
    private int id;
    private final toolsDAO dao;
    
    public tools(){
        this.dao = new toolsDAO();
    }
    
    public tools(String name, int cost,String mark,int id) {
        this.name = name;
        this.mark = mark;
        this.cost = cost;
        this.id = id;
        this.dao = new toolsDAO();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    public String getMark(){
        return mark;
    }
    
    public void setMark(String mark){
        this.mark = mark;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
       
}
