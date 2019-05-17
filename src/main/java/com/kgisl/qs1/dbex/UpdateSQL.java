package com.kgisl.qs1.dbex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
http://www.ntu.edu.sg/home/ehchua/programming/java/jdbc_basic.html
 */
public class UpdateSQL {

    public static void main(String[] args) {

        try (

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kananst1", "root", "");
                Statement st = con.createStatement();
                

        ) { //System.out.println("connet");
            String update = "UPDATE `student` SET name='sonica' WHERE id= '1001'";
            String delet ="DELETE FROM `student` WHERE id =1002";
            String insert ="INSERT INTO `student`(`id`, `name`, `dep`, `college`) VALUES (01,'aaa','dd','cc'),(02,'aaba','dsd','crc'),(03,'hgf','dfgdf','fsd')";
            // INSERT a partial record
            String paratinal ="INSERT INTO student('id','name','dep') VALUES (25,'mahi','BE')";
            
            /**
             * INSERT INTO `student`(`id`, `name`, `dep`, `college`) VALUES"+" (1001,'kannan','BCA','kmc')"+
            "(1401,'SONICA','BIO','CMS') " ;
             */
            // int countUpdate= st.executeUpdate(update);
            //int up = st.executeUpdate(update);
            int up = st.executeUpdate(insert);

            System.out.println("number of row madifi " + up);
            String select = "SELECT * from student";
           
            //ResultSet rs = st.executeQuery(select);
           // ResultSet rs= st.executeQuery(delet);
           ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t " + rs.getString("name") + "\t" + rs.getString("dep") + "\t"
                        + rs.getString("college"));
            }

        } catch (Exception e) {
            System.out.println(e
            );
        }

    }

}