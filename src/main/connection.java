package main;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class connection {
    String dbUrl = "jdbc:mysql://localhost/projek basdat";
    String dbUsername = "root";
    String dbPassword = "";
    
    public Connection connection;
    public Statement statement;
    public ResultSet resultSet;
    
    public Statement Connect_db(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            
            statement = (Statement) connection.createStatement();
            
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "You got an error", "error", JOptionPane.ERROR_MESSAGE);
            }
        return statement;
        }

    public void Close(){
        try{
            statement.close();
            connection.close();
        }catch(SQLException ex){
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
