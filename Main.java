package javabasics._3;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("A");
        System.out.println("S");
        // Write your code here
    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        double lunchPrice = 4.99;
        boolean hadLunchToday = false;
        System.out.print("My age is : ");
        System.out.println(29);
        System.out.print("Do i lunch today?: ");
        System.out.println(hadLunchToday);
        System.out.print("my lunch price today: ");
        System.out.println(lunchPrice);


        // Write your code here
    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        int myAge = 29;
        double lunchPrice = 4.99;
        boolean hadLunchToday = false;

        System.out.print("My age is: ");
        System.out.println(myAge);
        System.out.print("Do i lunch today?: ");
        System.out.println(hadLunchToday);
        System.out.print("my lunch price today: ");
        System.out.println(lunchPrice);
        // Write your code here
    }
}