package JavaSamples.Database;

import java.sql.*;

public class RetrieveDatabase {
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
        Statement st = con.createStatement();
        String selectquery = "select * from role";
        //   String selectquery = "select * from role where id ='2'";
        //Executing the SQL Query and store the results in ResultSet
        ResultSet rs = st.executeQuery(selectquery);

        while (rs.next()) {
            //Access column name of the result set
            System.out.println("Result is "+rs.getString("name"));
            //get the column id
            System.out.println("Result index is "+rs.getInt(1));
            //Get the name of column in result set
            System.out.println("Meta Data is "+rs.getMetaData().getColumnName(2));
            //Get the column count in a result set
            System.out.println("Column count in table "+rs.getMetaData().getColumnCount());
        }
        //Closing DB Connection
        con.close();
    }

}
