/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Friends;
import View.Mensagens;
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
public class FriendsDAO {
    
    public static ArrayList<Friends> MyList = new ArrayList<Friends>();

    public FriendsDAO() {
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
            String server = "127.0.0.1";
            String database = "tiozao";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "root";

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

    public ArrayList getFriends() {
        
        MyList.clear();

        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM friends");
            while (res.next()) {
                
                int id = res.getInt("id");
                String name = res.getString("name");
                String tel = res.getString("tel");
                String email = res.getString("email");
                
                Friends obj = new Friends(name,tel, email, id);

                MyList.add(obj);
            }

            stmt.close();

        } catch (SQLException ex) {
            new Mensagens( "Ocorreu um erro ao carregar a lista de asmigos.\nContacte o suporte: cod.: DBE-001");
        }

        return MyList;
    }

    public boolean insertFriends(Friends objeto) {
        String sql = "INSERT INTO friends(name, email, tel) VALUES(?,?,?)";

        try {
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setString(3, objeto.getTel());
            stmt.setString(1, objeto.getName());
            stmt.setString(2, objeto.getEmail());
            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }


    public boolean deleteFriend(int id) {
        try {
            Statement stmt = this.getConnection().createStatement();
            stmt.executeUpdate("DELETE FROM friends WHERE id = " + id);
            stmt.close();            
            
        } catch (SQLException erro) {
            new Mensagens("Erro ao deletar amigo.");
        }
        
        return true;
    }
    public boolean editFriend(Friends objeto) {

        String sql = "UPDATE friends set name = ? ,email = ?, tel = ? WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setString(1, objeto.getName());
            stmt.setString(2, objeto.getEmail());
            stmt.setString(3, objeto.getTel());
            stmt.setInt(4, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Friends loadFriend(int id) {
        
        Friends objeto = new Friends();
        objeto.setId(id);
        
        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM friends WHERE id = " + id);
            res.next();

            objeto.setName(res.getString("name"));
            objeto.setTel(res.getString("tel"));
            objeto.setEmail(res.getString("email"));
            objeto.setId(res.getInt("id"));

            stmt.close();            
            
        } catch (SQLException erro) {
        }
        return objeto;
    }
}