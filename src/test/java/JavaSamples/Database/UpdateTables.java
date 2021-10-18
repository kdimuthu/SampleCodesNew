package JavaSamples.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTables {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String dbURL = "jdbc:postgresql://172.17.229.90:5432/ott_auth_server";
        String username = "postgres";
        String password = "mit@123";
        System.out.println("Connected to PostgreSQL database!");
        //Load postgres sql JDBC Driver
        Class.forName("org.postgresql.Driver");
        //Creating connection to the database
        Connection con = DriverManager.getConnection(dbURL,username,password);
        System.out.println("Opened database successfully");
        //Creating statement object
        // Statement st = con.createStatement();
        try {
            String columnName="ROLE_OPERATOR2";
            String UpdateQuery = "update role set name='"+columnName+"' where id ='1'";
            PreparedStatement p=con.prepareStatement(UpdateQuery);
            p.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //Closing DB Connection
        con.close();
    }
}
