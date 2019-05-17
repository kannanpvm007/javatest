package com.kgisl.qs1.map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Input {
    // whenReadWithBufferedReader_thenCorrect
    public static void main(String[] args) throws IOException {

        {

            String file = "D:\\Kannan\\test1\\src\\main\\java\\com\\kgisl\\qs1\\map\\demo.txt";
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String ss, s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            } 
            reader.close();

            // ************************************************************************** */

            Scanner se = new Scanner(new File(file));
            // String ss,s;
            // System.out.println("Scanner " + se.nextLine());
            while ((ss = se.next()) != null) {
                System.out.println(ss);
            } se.close();
            
          

            // String currentLine = reader.readLine();
            // System.out.println(currentLine);}
            /*
             * 3. Streaming Through the File Let’s now look at a solution – we’re going to
             * use a java.util.Scanner to run through the contents of the file and retrieve
             * lines serially, one by one:
             */
        }
            System.out.println("useing Stream");
            FileInputStream inputStream = null;
            Scanner sc = null;
            try {
                inputStream = new FileInputStream("D:\\Kannan\\test1\\src\\main\\java\\com\\kgisl\\qs1\\map\\demo.txt");
                sc = new Scanner(inputStream, "UTF-8");
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    // System.out.println(line);
                }
                // note that Scanner suppresses exceptions
                if (sc.ioException() != null) {
                    throw sc.ioException();
                }
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (sc != null) {
                    sc.close();
                }
            }

        }

    
}