/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import Model.Tools;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Matheus Soares
 */
public class ToolsDAO {
    public static ArrayList<Tools> MyList = new ArrayList<Tools>();

    public ToolsDAO() {
    }

    public int maiorID() throws SQLException {

        int maiorID = 0;
        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tools");
            res.next();
            maiorID = res.getInt("id");

            stmt.close();

        } catch (SQLException ex) {
        }

        return maiorID;
    }

    public Connection getConnection() {

        Connection connection = null;
        try {

            
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            String server = "127.0.0.1";
            String database = "tiozao";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "root";

            connection = DriverManager.getConnection(url, user, password);

            return connection;

        } catch (ClassNotFoundException e) {  
            System.out.println("O driver nao foi encontrado. " + e.getMessage() );
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar" + e.getMessage());
            return null;
        }
    }

    public ArrayList getTools() {
        
        MyList.clear();

        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tools");
            while (res.next()) {

                String name = res.getString("name");
                String brand = res.getString("brand");
                float value = res.getFloat("value");
                boolean status = res.getBoolean("status");
                int id = res.getInt("id");
                
                Tools objeto = new Tools(name, brand, value, status, id);

                MyList.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MyList;
    }
    
    public ArrayList getLoanTools() {
        
        MyList.clear();

        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT *, (SELECT COUNT(*) from loans as l where l.status = 0 and l.tool_id = t.id limit 1) as emprestimo FROM tools as t HAVING emprestimo = 0");
            while (res.next()) {

                String name = res.getString("name");
                String brand = res.getString("brand");
                float value = res.getFloat("value");
                boolean status = res.getBoolean("status");
                int id = res.getInt("id");
                
                Tools objeto = new Tools(name, brand, value, status, id);

                MyList.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MyList;
    }

    // Cadastra novo aluno
    public boolean insertTool(Tools objeto) {
        String sql = "INSERT INTO tools(name,brand, value) VALUES(?,?,?)";

        try {
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setString(1, objeto.getName());
            stmt.setFloat(3, objeto.getValue());
            stmt.setString(2, objeto.getBrand());
            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }


    public boolean deleteTool(int id) {
        try {
            Statement stmt = this.getConnection().createStatement();
            stmt.executeUpdate("DELETE FROM tools WHERE id = " + id);
            stmt.close();            
            
        } catch (SQLException erro) {
        }
        
        return true;
    }
    public boolean editTool(Tools objeto) {

        String sql = "UPDATE tools set name = ?, brand = ?, value = ?, status = ? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setString(1, objeto.getName());
            stmt.setString(2, objeto.getBrand());
            stmt.setFloat(3, objeto.getValue());
            stmt.setBoolean(4, objeto.getStatus());
            stmt.setInt(5, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Tools getTool(int id) {
        
        Tools objeto = new Tools();
        objeto.setId(id);
        
        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tools WHERE id = " + id);
            res.next();

            objeto.setName(res.getString("name"));
            objeto.setValue(res.getFloat("value"));
            objeto.setBrand(res.getString("brand"));
            objeto.setId(res.getInt("id"));

            stmt.close();            
            
        } catch (SQLException erro) {
        }
        return objeto;
    }
    
    public Tools loadFriend(int id) {
        
        Tools objeto = new Tools();
        objeto.setId(id);
        
        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tools WHERE id = " + id);
            res.next();

            objeto.setName(res.getString("name"));
            objeto.setBrand(res.getString("brand"));
            objeto.setValue(res.getFloat("value"));
            objeto.setId(res.getInt("id"));

            stmt.close();            
            
        } catch (SQLException erro) {
        }
        return objeto;
    }
}
