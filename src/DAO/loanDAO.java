/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.loan;
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
public class loanDAO {
    public static ArrayList<loan> MyList = new ArrayList<loan>();

    public loanDAO() {
    }

    public int maiorID() throws SQLException {

        int maiorID = 0;
        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM loan");
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
            ResultSet res = stmt.executeQuery("SELECT * FROM loan");
            while (res.next()) {

                int tool_id = res.getInt("tool_id");
                int id_friend = res.getInt("id_friend");
                int id = res.getInt("id");
                Boolean status = res.getBoolean("status");
                
                loan objeto = new loan(tool_id,id_friend,status,id);

                MyList.add(objeto);
            }

            stmt.close();

        } catch (SQLException ex) {
        }

        return MyList;
    }

    // Cadastra novo aluno
    public boolean InsertLoan(loan objeto) {
        String sql = "INSERT INTO loan(tool_id,id_friend,status,id) VALUES(?,?<?,?)";

        try {
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setInt(2, objeto.getId_friend());
            stmt.setBoolean(3, objeto.getStatus());
            stmt.setInt(1, objeto.getTool_id());
            stmt.setInt(4, objeto.getId());
            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }


    public boolean DeleteLoan(int id) {
        try {
            Statement stmt = this.getConnection().createStatement();
            stmt.executeUpdate("DELETE FROM loan WHERE id = " + id);
            stmt.close();            
            
        } catch (SQLException erro) {
        }
        
        return true;
    }
    public boolean UpdateLoan(loan objeto) {

        String sql = "UPDATE loan set status = ? , WHERE id = ?";

        try {
            PreparedStatement stmt = this.getConnection().prepareStatement(sql);

            stmt.setInt(4, objeto.getId());
            stmt.setInt(1, objeto.getTool_id());
            stmt.setInt(2, objeto.getId_friend());
            stmt.setBoolean(3, objeto.getStatus());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public loan LoadLoan(int tool_id,int friend_id,Boolean status,int id) {
        
        loan objeto = new loan();
        objeto.setId(id);
        
        try {
            Statement stmt = this.getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM loan WHERE id = " + id);
            res.next();

            objeto.setTool_id(res.getInt("tool_id"));
            objeto.setFriend_id(res.getInt("friend_id"));
            objeto.setStatus(res.getBoolean("status"));
            objeto.setId(res.getInt("id"));

            stmt.close();            
            
        } catch (SQLException erro) {
        }
        return objeto;
    }
}
