package com.kgisl.qs1.enum_ex;

enum Day {
    sunday, monday, tuesday, wednesday, thursday, friday, saturday;

}

public class enum1 {
    Day day;

    public enum1(Day day) {
        this.day = day;
    }

    public void dayLike() {
        switch (day) {
        case monday:
            System.out.println("bad morning time");
            break;
        case friday:
            System.out.println("good day but very slow day");
            break;
        case saturday:
        case sunday:
            System.out.println("weekend r bor ");
            break;
            default: System.out.println("need need");
            break;
        }

    }
    public static void main(String args[]){
        String today = "friday";
        enum1 em = new enum1(Day.valueOf(today));
        em.dayLike();

    }

}

/**
 * 
 * Enumerations serve the purpose of representing a group of named constants in
 * a programming language. For example the 4 suits in a deck of playing cards
 * may be 4 enumerators named Club, Diamond, Heart, and Spade, belonging to an
 * enumerated type named Suit. Other examples include natural enumerated types
 * (like the planets, days of the week, colors, directions, etc.). Enums are
 * used when we know all possible values at compile time, such as choices on a
 * menu, rounding modes, command line flags, etc. It is not necessary that the
 * set of constants in an enum type stay fixed for all time.
 * 
 * In Java (from 1.5), enums are represented using enum data type. Java enums
 * are more powerful than C/C++ enums . In Java, we can also add variables,
 * methods and constructors to it. The main objective of enum is to define our
 * own data types(Enumerated Data Types).
 * 
 * Declaration of enum in java :
 * 
 * Enum declaration can be done outside a Class or inside a Class but not inside
 * a Method. filter_none edit play_arrow
 * 
 * brightness_4 // A simple enum example where enum is declared // outside any
 * class (Note enum keyword instead of // class keyword) enum Color { RED,
 * GREEN, BLUE; }
 * 
 * public class Test { // Driver method public static void main(String[] args) {
 * Color c1 = Color.RED; System.out.println(c1); } } Output :
 * 
 * RED filter_none edit play_arrow
 * 
 * brightness_4 // enum declaration inside a class. public class Test { enum
 * Color { RED, GREEN, BLUE; }
 * 
 * // Driver method public static void main(String[] args) { Color c1 =
 * Color.RED; System.out.println(c1); } } Output :
 * 
 * RED First line inside enum should be list of constants and then other things
 * like methods, variables and constructor. According to Java naming
 * conventions, it is recommended that we name constant with all capital letters
 * 
 * 
 * 
 * 
 * Important points of enum :
 * 
 * Every enum internally implemented by using Class. /* internally above enum
 * Color is converted to class Color { public static final Color RED = new
 * Color(); public static final Color BLUE = new Color(); public static final
 * Color GREEN = new Color(); }
 */
