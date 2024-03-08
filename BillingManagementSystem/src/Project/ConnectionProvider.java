package Project;

import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "");
            if (con != null && !con.isClosed()) {
                System.out.println("Database connection established.");
            } else {
                System.out.println("Database connection is null or closed.");
            }
            return con;
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to MySQL database.");
            e.printStackTrace();
        }
        return null;
    }
}
