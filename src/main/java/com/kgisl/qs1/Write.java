
package com.kgisl.qs1;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

//import org.apache.poi.hssf.record.chart.ChartTitleFormatRecord;
public class Write {
    public static void main(String[] args) {
        try (FileWriter hi = new FileWriter("D:/Kannan/test1/src/main/java/com/kgisl/qs1/hi.txt")) {

            Scanner se = new Scanner(System.in);
            System.out.println("enter your commants:");
            String see = se.nextLine();

            // for(int i =0; i<see.length();i++){
            hi.write(see);
            // }
            System.out.println("stored");

            System.out.println(" viwe text");
            se.close();

            File rv = new File("D:/Kannan/test1/src/main/java/com/kgisl/qs1/hi.txt");

            FileImageInputStream st = new FileImageInputStream(rv);

            System.out.println(st.readLine());
           

        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
