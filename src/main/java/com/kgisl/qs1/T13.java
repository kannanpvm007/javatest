package com.kgisl.qs1;

import java.util.Arrays;
import java.util.List;



/// Convert ArrayList<String> to String[] array
public class T13 {

    public static void main(String[] args) {


        List<String> name = Arrays.asList("kannan", "vedaranyam");

        String[] arraylist = name.toArray(new String[0]);


        System.out.println( "two string[]"+Arrays.toString(arraylist));
        // List <String> hi = Arrays.asList(arraylist);
        // System.out.println(" stry"+deepToString(hi));

    }

	// private static String deepToString(List<String> hi) {
	// 	return null;
	// }

}