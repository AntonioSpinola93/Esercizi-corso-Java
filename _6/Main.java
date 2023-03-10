package javabasics._6;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * 1: Create a double variable called value, create another double variable called valueSquareRoot
     *
     *    Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
     */
    private static void exercise1() {
        double value = 121;
        double valueSquareRoot = Math.sqrt(value);
        System.out.println( "The square root of 121 amounts : "+ valueSquareRoot);
        // Write your code here
    }

    /**
     * 2: See the code below
     *
     *    Print out the highest value using Math.max()
     *
     *    Then print out the lowest value using Math.min()
     *
     *    You must put your variables into these methods and separate them with a comma
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int valueA = 5;
        int valueB = 10;

        System.out.println("Max value : "+ Math.max (valueA,valueB));
        System.out.println("Min value : "+ Math.min (valueA,valueB));

        // Write your code here
    }

    /**
     * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        int totalMoney = 50;
        int costPerBurger = 9;
        double remainder = totalMoney % costPerBurger;

        // Write your code here
        System.out.println("After my last meal, i have " + remainder +" € in my wallet" );
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
     *
     * You do not need to write any code
     *
     * Answers can be found in resources
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Bonus!):");

        double ourValue = 4.5;


        // math.ceil = arrotonda per eccesso e restituisce un numero intero maggiore o uguale al valore di partenza
        System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));
        // math.floor = arrotonda per difetto e restituisce un numero intero minore  o uguale al valore di partenza
        System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));
        // msth.round = arrotonda per eccesso restituendo il numero intero piu vicino , quindi aggiungendo
        System.out.println(ourValue + " after using round=" + Math.round(ourValue));
        // Math.pow = elevazione a potenza di "ourValue" = in questo caso il quadrato di 4.5 / 4.5 *4.5
        System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));
        // Math.pow = elevazione a potenza di "ourValue" = in questo caso il cubo di 4.5 / 4.5 * 4.5* 4.5
        System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));
        // Math.random = genera un moltiplicatore "pseudo-casuale" compreso tra 0.1 e 1 (come i moltiplicatori dei colpi critici nei videogame)
        System.out.println(ourValue + " times random =" + Math.random() * ourValue);
    }
}