
package com.kgisl.qs1;


import java.io.FileWriter;
public class Write {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("D:/Kannan/test1/src/main/java/com/kgisl/qs1/hi.txt")) {
            
            //inherited method from java.io.Writer
            fileWriter.write("my page writing in the operation");
            fileWriter.write("welcome");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
