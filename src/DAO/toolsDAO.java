/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import Model.tools;
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
public class toolsDAO {
    public static ArrayList<tools> MyList = new ArrayList<tools>();

    public toolsDAO() {
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

            
            String server = "localhost";
            String database = "db_A3";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "12345";

            connection = DriverManager.getConnection(url, user, password);

            return connection;

        } catch (ClassNotFoundException e) {  
            System.out.println("O driver nao foi encontrado. " + e.getMessage() );
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar");
            return null;
        }
    }

    public ArrayList getMyList() {
        
        MyList.clear();

        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tools");
            while (res.next()) {

                String name = res.getString("name");
                String mark = res.getString("mark");
                int cost = res.getInt("cost");
                int id = res.getInt("id");
                
                tools objeto = new tools(name,cost,mark,id);

                MyList.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MyList;
    }

    // Cadastra novo aluno
    public boolean InsertTool(tools objeto) {
        String sql = "INSERT INTO tools(name,cost,mark,id) VALUES(?,?<?,?)";

        try {
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setString(1, objeto.getName());
            stmt.setInt(2, objeto.getCost());
            stmt.setString(3, objeto.getMark());
            stmt.setInt(4, objeto.getId());
            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }


    public boolean DeleteTool(int id) {
        try {
            Statement stmt = this.getConnection().createStatement();
            stmt.executeUpdate("DELETE FROM tools WHERE id = " + id);
            stmt.close();            
            
        } catch (SQLException erro) {
        }
        
        return true;
    }
    public boolean UpdateTool(tools objeto) {

        String sql = "UPDATE tools set status = ? , WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setString(1, objeto.getName());
            stmt.setString(3, objeto.getMark());
            stmt.setInt(2, objeto.getCost());
            stmt.setInt(4, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public tools Loadtools(String name,int cost,String mark,int id) {
        
        tools objeto = new tools();
        objeto.setId(id);
        
        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tools WHERE id = " + id);
            res.next();

            objeto.setName(res.getString("name"));
            objeto.setCost(res.getInt("cost"));
            objeto.setMark(res.getString("Mark"));
            objeto.setId(res.getInt("id"));

            stmt.close();            
            
        } catch (SQLException erro) {
        }
        return objeto;
    }
}
