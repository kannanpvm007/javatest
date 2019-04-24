
//Demonstrate static block/block/constructor
package com.kgisl.qs1;

/**
 * T8
 */
public class T8 {

  T8(){
       System.out.println("constructor not need object"); }

       void Hi(){
            System.out.println("this is block and need object ");
       }
    
     static void hi(){
         System.out.println("this Static method and it can cal only via class name");
     }
    public static void main(String[] args) {
        T8.hi(); 
        T8 t= new T8();
        t.Hi(); 
       
         
    }
    
}