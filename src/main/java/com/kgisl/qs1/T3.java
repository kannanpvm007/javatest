
/* Exercise 3:
Make the program print how many characters there are in the first name and in the last name. 

Please, type in your first name: Kari
 Please, type in your last name: Laitinen
 Your full name is Kari Laitinen.
 Your first name has 4 characters.
 Your last name has 8 characters.

Enter your speed in mph: 58
Enter your distance in miles: 657.5

At 58 mph, it will take 11.336206896551724 hours
to travel 657.5 miles.
*/
package com.kgisl.qs1;

import java.util.Scanner;

public class T3 {

    
}



 class Distance {
    private static double milesTokm(double distanceInMiles) {
        return distanceInMiles * 1.60934;
    }

    private static double kmTomiles(double distanceInKm) {
        return distanceInKm * 0.621371;
    }

    public static void main(String[] args) {
        System.out.print("Enter distance in miles:");
        Scanner s = new Scanner(System.in);

        double distanceInMiles = s.nextDouble();
        System.out.println(distanceInMiles + "miles " + milesTokm(distanceInMiles) + "km");

        System.out.print("Enter distance in km:");
        double distanceInKm = s.nextDouble();

        System.out.println(distanceInKm + " km " + kmTomiles(distanceInKm) + "miles");

    }

}