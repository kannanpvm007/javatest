package com.kgisl.qs1.dbex;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

/**
 * two
 */
public class two {
    private static final String fn = "Db.properties";

    public static void main(String[] args) throws IOException {
        

        

      
            Properties ps = new Properties();
            InputStream input = two.class.getClassLoader().getResourceAsStream(fn);
            ps.load(input);

             String icici= ps.getProperty("icici");

             char[] str =icici.toCharArray();
             System.out.println("chare "+str);

             






            //  int i;String s2 = icici;
            //  int j;
            //  for (i = 0; i <= s2.length() - 1; i++){
            //      if (s2.substring(i).startsWith(",") || i == 0){
     
            //          //here I search for the start of the sentence or " "
            //          for (j = i + 1; j <= s2.length() - 1; j++){
     
            //              if (s2.substring(j).startsWith(",") || j == s2.length() - 1) {
            //                  //here I search for the next " " or the end of the sentence
            //                  System.out.println(s2.substring(i,j));
            //                  //printing
            //                  i = j;
            //                  //i=j because the next search must be done from where we left
     
            //              }
            //          }
                 }
                }





            //  String s = icici;
            //  for(int counter=0;counter<s.length();counter+=1) {
            //  System.out.println(s.charAt(counter));
            //  }
            // }}


//              System.out.println(icici);
//              String hi ="iam kannan";
//              String[] sourceAry = hi.split(hi,“ “);
// for(String value : sourceAry) {

// if(value.length() == 1) {

// System.out.println(value); // This prints single words

























            // String url = ps.getProperty("jdbc.url");
            // String username = ps.getProperty("jdbc.username");
            // String password = ps.getProperty("jdbc.password");
            // String gst = ps.getProperty("gst");
            // String stt = ps.getProperty("st");
            // String brokerage = ps.getProperty("brokerage");
            // System.out.println("stack" + stt + "" + gst + "" + brokerage);
            // System.out.println(url + " " + username + " " + password);
            // Connection cn = DriverManager.getConnection(url, username, password);
            // Statement st = cn.createStatement();
            // ResultSet rs = st.executeQuery("SELECT * FROM student");
            // while (rs.next()) {
            //     System.out.println(rs.getString(1) + " " + rs.getString(2));
    
            
