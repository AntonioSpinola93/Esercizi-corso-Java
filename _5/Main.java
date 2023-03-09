package javabasics._5;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
        exercise5Bonus();
        playAroundWithModulus();
    }

    /*
            Remember the symbols you need to do maths are

            Plus = +
            Minus = -
            Multiply or times = *
            Divide = /
     */

    /**
     * 1: Create an int variable, add 1 to the value and then print it. Use the + operator
     * Then minus 1 from the same variable and print it.
     */
    private static void exercise1() {
        // trading card game collection
        int myCollection = 30;

        System.out.println("Collection updated : " + (myCollection +1));
        System.out.println("Collection modified : "+( myCollection-1));
        // Write your code here
    }

    /**
     * 2: Create a double variable, times by 2 and then print it.
     * <p>
     * Create another double variable, which is the previous variable divided by 2
     * and then print it
     */
    private static void exercise2() {
        double myAge = 29;
        System.out.println("My age doubled is : " + myAge * 2);
        System.out.println("My age halved is : " + myAge / 2);
        // Write your code here
    }

    /**
     * 3: We are going to convert the temperature from Celsius to Fahrenheit
     * <p>
     * Create a double variable called Celsius
     * <p>
     * Create a new variable called Fahrenheit
     * <p>
     * The variable Fahrenheit should be set as
     * Celsius times by 1.8 plus 32
     * <p>
     * Print out Celsius and Fahrenheit with 2 print statements
     */
    private static void exercise3() {
        double celsius = 4;
        double fahrenheit = (celsius * 1.8 + 32);
        System.out.println("The temperature today is : " + celsius + "°C");
        System.out.println("The temperature today is : " + fahrenheit + "°F");
        // Write your code here
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age with a starting value of 10.
     * <p>
     * Only using the '++' operator increase this value to 15
     */
    private static void exercise4Bonus() {
        int age = 10;
        // I will use the operator "++" for rise up age to 15 1 unit at time!
        age ++;
        System.out.println(age);
        // I repeat the same process for level up age to 12!
        age ++;
        System.out.println(age);
        // I repeat the same process for level up age to 13!
        age ++;
        System.out.println(age);
        // I repeat the same process for level up age to 14!
        age ++;
        System.out.println(age);
        // I repeat the same process for level up age to 15!
        age ++;
        System.out.println(age);


        // Write your code here
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age set as 50
     * <p>
     * Using the -= operator change this value from 50 to 0 in one line of code,
     * <p>
     * Underneath create another int called secondAge set as 50
     * <p>
     * Change this value from 50 to 0 in 3 lines of code
     */
    private static void exercise5Bonus() {
        int age = 50;
        age -= 50;
        System.out.println(age);
        int secondAge = 50;
        secondAge -= 25;
        secondAge -= 25;
        System.out.println(secondAge);
        // Write your code here
    }

    /**
     * This is completely optional, but if you guys want to play around with
     * modulus to get a better understanding. Simply change the code below
     */
    private static void playAroundWithModulus() {
        System.out.println("\nModulus testing!:");

        int value = 3;   // <--- change this value
        int modulus = 30; // <--- and this value to see the results of modulus

        System.out.println("Modulus calculation, " + value + " % " + modulus +
                "=" + value % modulus);
    }

}
