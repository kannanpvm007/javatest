package com.kgisl.qs1.dbex;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
// import java.util.Set;
/**
 * DbProperties
 */
public class one {
    private static final String filename = "Db.properties";
    // public static Map<String, List<String>> categoryMap = new Hashtable<String,
    // List<String>>();
    public static void main(String[] args) throws IOException, SQLException {
        Properties prop = new Properties();
        InputStream input = null;
       
        input = one.class.getClassLoader().getResourceAsStream(filename);
        
        prop.load(input);
     
        // String[] hsbc = prop.get("HSBC").toString().split(",");
        String[] HSBC = { "gst=15", "stt=3", "brokerage=2.5" };
        List<String> answer = new ArrayList<String>();
        for (String var : HSBC) {
            for (String s : var.split(","))
                answer.add(s);
        }
        String url = prop.getProperty("jdbc.url");
        String username = prop.getProperty("jdbc.username");
        String password = prop.getProperty("jdbc.password");
        
        String gst = prop.getProperty("gst");
        String stt = prop.getProperty("stt");
        String brokerage = prop.getProperty("brokerage");
        
        System.out.println(url + " " + username + " " + password);
        System.out.println(gst + " " + stt + " " + brokerage);
        System.out.println(Arrays.toString(HSBC));
        System.out.println(answer.get(0));
        // System.out.println(hsbc);
        Connection con = DriverManager.getConnection(url, username, password);
        Statement stmr = con.createStatement();
        ResultSet rs = stmr.executeQuery("Select * from student");
        while (rs.next()) {
            System.out.println("\n" + rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
                    + rs.getFloat(4) + " " + rs.getInt(5) + " " + rs.getDate(5));
        }
        rs.close();
        stmr.close();
        con.close();
    }
}









// package com.kgisl.qs1.dbex;

// import java.awt.List;
// import java.io.InputStream;
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.Statement;
// import java.util.Arrays;
// import java.util.Enumeration;
// import java.util.Hashtable;
// import java.util.Map;
// import java.util.Properties;

// /**
//  * one
//  */
// public class one {

//     private static final String fn = "Db.properties";

//     public static void main(String[] args) throws Exception {
//         Properties ps = new Properties();
//         InputStream input = one.class.getClassLoader().getResourceAsStream(fn);
//         ps.load(input);
//         String url = ps.getProperty("jdbc.url");
//         String username = ps.getProperty("jdbc.username");
//         String password = ps.getProperty("jdbc.password");
//         String gst = ps.getProperty("gst");
//         String stt = ps.getProperty("st");
//         String brokerage = ps.getProperty("brokerage");
//         System.out.println("stack" + stt + "" + gst + "" + brokerage);
//         System.out.println(url + " " + username + " " + password);
//         Connection cn = DriverManager.getConnection(url, username, password);
//         Statement st = cn.createStatement();
//         ResultSet rs = st.executeQuery("SELECT * FROM student");
//         while (rs.next()) {
//             System.out.println(rs.getString(1) + " " + rs.getString(2));

//         }
//             public static Map<String,List<String>> categoryMap = new Hashtable<String, List<String>>();


//         Properties prop = new Properties();


//     try {

//         prop2.load(new FileInputStream(/displayCategerization.properties));
//         Set<Object> keys = prop.keySet();
//         List<String> categoryList = new ArrayList<String>();
//         for (Object key : keys) {
//             categoryList.add((String)prop2.get(key));
//             LogDisplayService.categoryMap.put((String)key,categoryList);
//         }
//         System.out.println(categoryList);
//         System.out.println("Category Map :"+LogDisplayService.categoryMap);

//         keys = null;
//         prop = null;

//     } catch (Throwable e) {
//         e.printStackTrace();
//     }

// //         }
// //     // String[] value= ps.get("icici").toString().split(",");
// //     // String sbi = ps.getProperty("SBI");
// //     // sbi = Arrays.asList(sbi.split(","));
// //     // System.out.println("work "+value);

// //         String icici = ps.getProperty("icici");
// //    // System.out.println("lenth "+icici);
// //     Enumeration e = ps.propertyNames();

// //     for (; e.hasMoreElements();) {
// //       System.out.println(e.nextElement());

// //     }


   

// //     icici.split(",");
// //    // System.out.println(icici.split(","));
     

//         rs.close();
//         st.close();
//         cn.close();

    
// }
// }

// // FileInputStream fn = new FileInputStream("db.Properties");
// // Properties p = new Properties ();
// // p.load (fn);

// // String Url= (String) p.get ("URL");
// // String Username= (String) p.get ("username");
// // String Password= (String) p.get ("pssword");

// // Connection con = DriverManager.getConnection(Url,Username,Password);
// // Statement stmt = con.createStatement();
// // String strSelect = "select id, name, dep from student";
// // ResultSet rset = stmt.executeQuery(strSelect);

// // System.out.println("");
// // System.out.println("The records selected are:");
// // int rowCount = 0;
// // while (rset.next()) {
// // String id = rset.getString("id");
// // String name = rset.getString("name");
// // String dep = rset.getString("dep");
// // System.out.println(id + ", " + name + ", " + dep);
// // ++rowCount;
// // }
// // System.out.println("Total number of records = " + rowCount);

// // // rs.close();
// // stmt.close();
// // con.close();

// // }

// // }
