/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Loan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Matheus Soares
 */
public class LoanDAO {
    public static ArrayList<Loan> MyList = new ArrayList<Loan>();

    public LoanDAO() {
    }

    public int maiorID() throws SQLException {

        int maiorID = 0;
        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM Loan");
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
            System.out.println("Nao foi possivel conectar");
            return null;
        }
    }

    public ArrayList getLoans() {
        
        MyList.clear();

        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT l.*, t.name as tool_name, f.name as friend_name FROM loans as l INNER JOIN tools as t ON t.id = l.tool_id INNER JOIN friends as f ON f.id = l.friend_id ORDER BY l.id DESC");
            while (res.next()) {

                int tool_id = res.getInt("tool_id");
                int id_friend = res.getInt("friend_id");
                int id = res.getInt("id");
                Boolean status = res.getBoolean("status");
                String friend = res.getString("friend_name");
                String tool = res.getString("tool_name");
                Date date = res.getDate("date");

                Loan objeto = new Loan(tool_id, id_friend, status, id, friend, tool, date);
                               

                MyList.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MyList;
    }

    public boolean insertLoan(Loan objeto) {
        String sql = "INSERT INTO loans (tool_id,friend_id) VALUES(?,?)";

        try {
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setInt(2, objeto.getFriendId());
            stmt.setInt(1, objeto.getToolId());
            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }


    public boolean deleteLoan(int id) {
        try {
            Statement stmt = this.getConnection().createStatement();
            stmt.executeUpdate("DELETE FROM Loan WHERE id = " + id);
            stmt.close();            
            
        } catch (SQLException erro) {
        }
        
        return true;
    }
    public boolean updateLoan(Loan objeto) {

        String sql = "UPDATE loans set status = 1 WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Loan loadLoan(int id) {
        
        Loan objeto = new Loan();
        objeto.setId(id);
        
        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM Loan WHERE id = " + id);
            res.next();

            objeto.setToolId(res.getInt("tool_id"));
            objeto.setFriendId(res.getInt("friend_id"));
            objeto.setStatus(res.getBoolean("status"));
            objeto.setFriend(res.getString("friend_name"));
            objeto.setTool(res.getString("tool_name"));
            objeto.setData(res.getDate("data"));
            objeto.setId(res.getInt("id"));

            stmt.close();            
            
        } catch (SQLException erro) {
        }
        return objeto;
    }
}
