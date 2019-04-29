
//Demonstrate static block/block/constructor
package com.kgisl.qs1;

/**
 * T8
 */
public class T8 {

    T8() {
        System.out.println(" T8 constructor ");
    }

    void Hi() {
        System.out.println("this is block and need object ");
    }

    {
        System.out.println("emty block T8 ");
    }

    static {
        System.out.println("this Static method block T8 ");
    }
}

class Two extends T8 {

    Two() {
        System.out.println(" TWO constructor ");
    }

    void hi() {
        System.out.println("this is block"+ "two"+ "need object ");
    }

    {
        System.out.println("emty block two ");
    }

    static {
        System.out.println(" two this Static method block ");
    }

    public static void main(String[] args) {
       
        T8 t = new T8();
        t.Hi(); 
        Two two = new Two();
        two.hi();
      //  T8.hi();
        new Two();

    }
}
