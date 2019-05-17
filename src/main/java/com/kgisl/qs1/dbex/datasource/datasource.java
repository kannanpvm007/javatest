package com.kgisl.qs1.dbex.datasource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;
// import java.util.ArrayList;
// import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;

/**
 * https://javaconceptoftheday.com/statement-vs-preparedstatement-vs-callablestatement-in-java/
 * <= dfd b/w statment and peaperst
 * https://examples.javacodegeeks.com/core-java/apache/commons/dbcp/basicdatasource/create-a-simple-basicdatasource-object/
 * <= this pgm
 */
public class datasource {

    BasicDataSource bd = new BasicDataSource();
    Connection ct = null;

    // PreparedStatement pst = null;
    datasource() {
        bd.setDriverClassName("com.mysql.cj.jdbc.Driver");
        bd.setUrl("jdbc:mysql://localhost:3306/kananst1");
        bd.setUsername("root");
        bd.setPassword("");

    }

    public static void main(String[] args) throws SQLException {
        disply();
        insert();
        delete();
        disply();
        update();
        disply();
        mulitiline();
    }

    public static void disply() throws SQLException {
        System.out.println("connet");
        datasource ds = new datasource();
        Connection cn = ds.creatConnection();
        Statement st = cn.createStatement();
        String select = "SELECT * FROM student";
        ResultSet rs = st.executeQuery(select);
        while (rs.next()) {
            System.out.println(rs.getString("name") + "\t " + rs.getString("id") + "\t" + rs.getString("dep") + "\t"
                    + rs.getString("college"));

        }
        System.out.println("display complet");
        // rs.close();
        st.close();
        cn.close();

    }

    public static void insert() throws SQLException {
        System.out.println("insert");
        String insert = "INSERT INTO `student`(`id`, `name`, `dep`, `college`) VALUES (01,'aaa','dd','cc'),(02,'aaba','dsd','crc'),(03,'hgf','dfgdf','fsd')";

        datasource ds = new datasource();
        Connection cn = ds.creatConnection();
        Statement st = cn.createStatement();
        int countInserted = st.executeUpdate(insert);
        System.out.println(countInserted + " records inserted.\n");
        st.close();
        cn.close();
        System.out.println("insert complet");
    }

    public static void delete() throws SQLException {
        System.out.println("delete");
        String delet = "DELETE FROM `student` WHERE id =1003";
        datasource ds = new datasource();
        Connection cn = ds.creatConnection();
        Statement st = cn.createStatement();
        int countInserted = st.executeUpdate(delet);
        System.out.println(countInserted + " records inserted.\n");
        st.close();
        cn.close();
        System.out.println("delete complet");

    }

    public static void update() throws SQLException {
        System.out.println("updat");

        String update = "UPDATE `student` SET name='sonica' WHERE id= '1003'";
        datasource ds = new datasource();
        Connection cn = ds.creatConnection();
        Statement st = cn.createStatement();
        int countInserted = st.executeUpdate(update);
        System.out.println(countInserted + " records inserted.\n");
        st.close();
        cn.close();
        System.out.println("updat complet ");

    }

    public static void mulitiline() throws SQLException {
        System.out.println("multiline");
      String multiline= "INSERT INTO `student`(`id`, `name`, `dep`, `college`)"+" VALUES(?,?,?,?)";
        List <Student> at = new ArrayList();
        at.add(new Student(201, "haja", "bcom", "kgils"));
        at.add(new Student(201,"ggg","sd","ffh"));
       
        at.add(new Student(202, "mani", "BE ele", "isac"));
        at.add(new Student(203, "nivi", "BE cse", "PSG"));
        datasource ds = new datasource();
        Connection cn = ds.creatConnection();
        // Statement st=cn.createStatement();
        // ResultSet rs= st.executeQuery(multiline);
        PreparedStatement ps =cn.prepareStatement(multiline);
        int i =0;
        for (Student st : at){
            ps.setInt(1, st.getId());
            ps.setString(2, st.getName());
            ps.setString(3, st.getDep());
            ps.setString(4, st.getCollege());
            i+=ps.executeUpdate();// i=i+ps.executeUpdate();

        
        }
        System.out.println(i);
        cn.close();
        
            
        }

    private Connection creatConnection() {
        Connection cn = null;
        try {
            cn = bd.getConnection();
        } catch (Exception e) {
            System.out.println(e);
        }
        return cn;
    }

}