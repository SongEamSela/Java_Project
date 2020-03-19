package TP16_SongeamSela;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:8889/JavaDB?" +
                "user=root&password=root");

        Statement stmt = con.createStatement();
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Cat (id INT PRIMARY KEY AUTO_INCREMENT ,Name varchar(100))");

        stmt.executeUpdate("INSERT INTO Cat(name) " +
                "values('Tom'),('Kitty')");

        con.close();
    }
}
