/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.friends;
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
public class friendsDAO {
    
    public static ArrayList<friends> MyList = new ArrayList<friends>();

    public friendsDAO() {
    }

    public int maiorID() throws SQLException {

        int maiorID = 0;
        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM friends");
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

        } catch (ClassNotFoundException e) {  //Driver n�o encontrado
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
            ResultSet res = stmt.executeQuery("SELECT * FROM friends");
            while (res.next()) {

                String name = res.getString("name");
                int tel = res.getInt("tel");
                int id = res.getInt("id");
                
                friends objeto = new friends(name,tel,id);

                MyList.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MyList;
    }

    public boolean InsertFriends(friends objeto) {
        String sql = "INSERT INTO friends(id,name) VALUES(?,?)";

        try {
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setInt(2, objeto.getTel());
            stmt.setString(1, objeto.getName());
            stmt.setInt(1, objeto.getId());
            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }


    public boolean DeleteFriend(int id) {
        try {
            Statement stmt = this.getConnection().createStatement();
            stmt.executeUpdate("DELETE FROM friends WHERE id = " + id);
            stmt.close();            
            
        } catch (SQLException erro) {
        }
        
        return true;
    }
    public boolean UpdateFriend(friends objeto) {

        String sql = "UPDATE friends set name = ? ,tel = ?, WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setString(1, objeto.getName());
            stmt.setInt(2, objeto.getTel());
            stmt.setInt(3, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public friends LoadFriend(int id) {
        
        friends objeto = new friends();
        objeto.setId(id);
        
        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM friends WHERE id = " + id);
            res.next();

            objeto.setName(res.getString("name"));
            objeto.setTel(res.getInt("tell"));
            objeto.setId(res.getInt("id"));

            stmt.close();            
            
        } catch (SQLException erro) {
        }
        return objeto;
    }
}
