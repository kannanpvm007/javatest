package com.kgisl.qs1.dbex;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.omg.CORBA.portable.InputStream;

public class SqlDb {
    private static final String fn = "Db.properties";

    public static void main(String[] args) throws Exception {
        // String url ="jdbc:mysql://localhost:3606/kannanst1","root"," ";
        Properties ps = new Properties();
        // InputStream input =   SqlDb.class.getClassLoader().getResourceAsStream(fn);
        // ps.load(input);

        String Url = ps.getProperty("URL");
        String Username = ps.getProperty("username");
        String Password = ps.getProperty("pssword");
       // FileInputStream fn = new FileInputStream("db.properties");
       
        Connection con = DriverManager.getConnection(Url, Username, Password);

        Statement stmt = con.createStatement();
        try {
            System.out.println("Connected?");

            String strSelect = "select id, name, dep from student";
            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("");
            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next()) {
                String id = rset.getString("id");
                String name = rset.getString("name");
                String dep = rset.getString("dep");
                System.out.println(id + ", " + name + ", " + dep);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);

        } catch (SQLException e) {

            e.printStackTrace();
        }

    }
}
