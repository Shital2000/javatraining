import java.sql.*;
import java.util.*;



public class test1 {
    public static void main(String[] args) throws Exception {
        // Load database driver in memory
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");

        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test6", "postgres", "root");

        System.out.println("Coonection done");

        Statement stmt;
        stmt=conn.createStatement();
        String sql;
        sql="insert into student values(500,'testing')";
        stmt.executeUpdate(sql);
        System.out.println("record inserted");

        conn.close();

    }
}

