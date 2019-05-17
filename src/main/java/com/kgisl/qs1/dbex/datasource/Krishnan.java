package com.kgisl.qs1.dbex.datasource;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.mysql.cj.jdbc.MysqlDataSource;

/**
* CRUD_DB
*/
public class Krishnan {
    Connection connection = null;
    // BasicDataSource bdSource = new BasicDataSource();
    MysqlDataSource bdSource = new MysqlDataSource();

    Krishnan() {
        // Set dataSource Properties

        // bdSource.setDriverClassName("com.mysql.jdbc.Driver");
        // bdSource.setUrl("jdbc:mysql://localhost:3306/giriprasath");
        // bdSource.setUsername("root");
        // bdSource.setPassword("");

        bdSource.setServerName("localhost");
        bdSource.setPortNumber(3306);
        bdSource.setDatabaseName("kananst1?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC");
        bdSource.setUser("root");
        bdSource.setPassword("");

    }

    public static void main(String[] args) throws SQLException, IOException {

        //display();
        insert();
        System.out.println("after insertion :");
        display();

    }

    public static void display() throws SQLException {
        Krishnan dsExample = new Krishnan();
        Connection con = dsExample.createConnection();
        Statement stmt = con.createStatement();
        String query = "SELECT * FROM student";
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println("id " + rs.getString("id") + "\t" + rs.getString("name") + "\t" + rs.getString("dep") + "\t"
                    + rs.getString("college"));
        }
        rs.close();
        stmt.close();
        con.close();

    }

    public static void insert() throws SQLException, FileNotFoundException {
        String query = "insert into student (id,name,dep,college)" + "VALUES(?,?,?,?)";
        Krishnan dsExample = new Krishnan();
       Connection con = dsExample.createConnection();
       PreparedStatement prstm = con.prepareStatement(query);


        CSVReader reader = new CSVReader(new FileReader("D:\\Kannan\\test1\\CSStoDB.CSV"), '|');

        List<StudentDB> emps = new ArrayList<StudentDB>();
        //read line by line
        String[] record = null;

       try {
           while ((record = reader.readNext()) != null) {
               StudentDB emp = new StudentDB();
               emp.setId(record[0]);
               emp.setName(record[1]);
               emp.setDep(record[2]);
               emp.setCollege(record[3]);
               emps.add(emp);
           }
           System.out.println("CSV to List :");
           for (StudentDB var : emps)
            {
               System.out.println(var);
           }
       } catch (IOException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
           int i=0;
           for (StudentDB    var : emps)
           {
           prstm.setString(1, var.getId());
           prstm.setString(2, var.getName());
           prstm.setString(3, var.getDep());
           prstm.setString(4, var.getCollege());
           i+=prstm.executeUpdate();
            }

           System.out.println("No of Rows Executed :"+i);
          
        
           try {
           reader.close();
       } catch (IOException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }

       }


    
       private Connection createConnection()
       {
           Connection con = null;
           try
           {

               con = bdSource.getConnection();
           }
           catch (Exception e)
           {
               System.out.println("Error Occured " + e.toString());
           }
           return con;

   }
}