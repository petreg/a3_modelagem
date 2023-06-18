package Model;

import java.util.*;
import DAO.ToolsDAO;
import java.sql.SQLException;

public class Tools{

    private String name;
    private String brand;
    private float value;
    private boolean status;
    private int id;
    private final ToolsDAO dao;
    
    public Tools(){
        this.dao = new ToolsDAO();
    }
    
    public Tools(String name, String brand, float value) {
        this.name = name;
        this.brand = brand;
        this.value = value;
        this.dao = new ToolsDAO();
    }
    
    public Tools(String name, String brand, float value, boolean status, int id) {
        this.name = name;
        this.brand = brand;
        this.value = value;
        this.status = status;
        this.id = id;
        this.dao = new ToolsDAO();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    public void setId(boolean status) {
        this.status = status;
    }
    
    public boolean insertTool(String name, String brand, float value) throws SQLException {
        Tools objeto = new Tools(name, brand, value);
        dao.insertTool(objeto);
        return true;
    }
    
    public boolean editTool(int id, String name, String brand, float value) {
        Tools objeto = new Tools(name, brand, value, status, id);
        dao.editTool(objeto);
        return true;
    }
    
    public boolean deleteTool(int id) {
        dao.deleteTool(id);
        return true;
    }
    
    public ArrayList getTools() {
        return dao.getTools();
    }
    
    public ArrayList getLoanTools() {
        return dao.getLoanTools();
    }

}
