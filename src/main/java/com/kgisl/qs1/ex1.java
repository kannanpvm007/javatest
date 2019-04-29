package com.kgisl.qs1;



import java.util.Scanner;

/**Exercise 1:
 This program is a computer game. 
 Please, type in an integer in the range 1 ... 2147483646 : 17

 You typed in 17.
 My numbers are 34, 35, and 36.

 You typed in 144.
 My numbers are 72, 36, and 18.
*/
public class ex1 {

   public static void main(String[] args) {
       System.out.println("welcome");
       Scanner sc=new Scanner(System.in);
   System.out.println("enter value");
   int aa=sc.nextInt();
 //  int b=5;
   System.out.println("You typed in"+aa);



  System.out.println("\n\n My numbers are "+aa*2+"  ,"+(aa*2+1)+" and "+(aa*2+2));




//    You typed in 144.
//    My numbers are 72, 36, and 18.


System.out.println("enter second value");
int snd=sc.nextInt();
System.out.println("you typed in"+snd);
if(snd==144)
{
   System.out.println("my numbers are "+snd /2+", "+(snd/4)+" ,"+(snd/8));
}




   }



}