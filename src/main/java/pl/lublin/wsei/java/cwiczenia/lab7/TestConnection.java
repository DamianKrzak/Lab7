package pl.lublin.wsei.java.cwiczenia.lab7;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TestConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String serverName = "localhost";
        String database="mydb";
        Number portNumber = 3306;
        Connection conn =null;
        Properties connectionProps = new Properties();
        connectionProps.put("user","root");
        connectionProps.put("password","k0t13923065");
        connectionProps.put("serverTimezone","Europe/Warsaw");

        conn = DriverManager.getConnection("jdbc:mysql//"+serverName+":" + portNumber + "/" + database, connectionProps);

        System.out.println("Connected to datebase");

    }
}
