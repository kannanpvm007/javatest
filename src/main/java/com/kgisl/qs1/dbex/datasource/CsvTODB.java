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
public class CsvTODB {
    Connection con = null;
    MysqlDataSource md = new MysqlDataSource();
  

    CsvTODB() {
      
        md.setServerName("localhost");
        md.setPortNumber(3306);
        md.setDatabaseName("kananst1?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC");
        md.setUser("root");
        md.setPassword("");
    }
    public static void main(String[] args) throws SQLException, IOException
        
    {   
        display();
        insert();
        display();
      

        
    }



    public static void display() throws IOException, SQLException
    {
        CsvTODB stb = new CsvTODB();
        Connection con = stb.createConnection();
        Statement stmt = con.createStatement();
        String dis = "select * from student";
        ResultSet rs = stmt.executeQuery(dis);
        while (rs.next()) {
            System.out.println("id" + rs.getString("id") + "\t" + rs.getString("name") + "\t" + rs.getString("dep") + "\t"
                    + rs.getString("college"));
        }
        rs.close();
        stmt.close();
        con.close();
    }



    public static void insert() throws IOException, SQLException,FileNotFoundException
{
    String insert = "insert into student(id,name,dep,college)" + "VALUES(?,?,?,?)";
        CsvTODB cd = new CsvTODB();
        Connection con = cd.createConnection();
        PreparedStatement ps = con.prepareStatement(insert);

        CSVReader reader = new CSVReader(new FileReader("D:\\Kannan\\test1\\CSStoDB.CSV"),'|');
        List<StudentDB> stu = new ArrayList<StudentDB>();
        String[] rd = null;

        try {
            while ((rd = reader.readNext()) != null) {
                StudentDB student = new StudentDB();
                student.setId(rd[0]);
                student.setName(rd[1]);
                student.setDep(rd[2]);
                student.setCollege(rd[3]);
                stu.add(student);
            }
            System.out.println("CSV to List :");
        //    for (StudentDB var : stu)
        //     {
        //        System.out.println(var);
        //    }
        System.out.println(stu);


        }
        
        catch (IOException e) {

            e.printStackTrace();
        }

        int i = 0;
        for (StudentDB var : stu) {

            //int temp=( (int) (var.getId());
            ps.setString(1, var.getId());
            ps.setString(2, var.getName());
            ps.setString(3, var.getDep());
            ps.setString(4, var.getCollege());
            i = i + ps.executeUpdate();// i+=ps.executeUpdate();
        }
        System.out.println("No of Rows Executed :"+i);
        try {
            reader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

}
    private Connection createConnection() {
        Connection con = null;
        try {
            con = md.getConnection();
            //conn =md.getConnection();
        }
         catch (Exception e) {
            System.out.println("Error Occured " + e.toString());
        }
        return con;
    }

}


