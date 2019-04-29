
package com.kgisl.qs1;

import java.util.Arrays;
import java.util.ArrayList;

/**
Exercise 14:
Create list from comma separated String
String commaSeparated = "item1 , item2 , item3";
[item1, item2, item3]
 */
public class Comma {

    public static void main(String[] args) {
        String commaSeparated = "item1 , item2 , item3";

        
        
ArrayList<String> conv1 = new  ArrayList<String>(Arrays.asList(commaSeparated.split(",")));
System.out.println(conv1);

        

    }

}


        // ArrayList conv = new ArrayList(Arrays.asList(commaSeparated.split(",")));
        // for (int i = 0; i < conv.size(); i++) {
        //     System.out.println(conv.get(i));
        // }





























// ArrayList conv = new ArrayList(Arrays.asList(commaSeparated.split(",")));
        // for (int i = 0; i < conv.size(); i++) {
        //     System.out.println(conv.get(i));
        // }
