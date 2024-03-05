package bankmanagementsystem;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn () {
        try {
<<<<<<< HEAD
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "root");
=======
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "1qaz@Wsx3edc");
>>>>>>> 6dc1f13ad10d3d9d8c02e315521d812da3bf1bf1
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }   
}
