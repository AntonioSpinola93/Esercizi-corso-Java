package javabasics._16;

import java.util.Arrays;
import java.util.List;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Put this into a function

        double celsius = 25;
        double fahrenheit = conversionTemp(celsius);
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";

        // End
        System.out.println(conversionDescription);

    }
     static double conversionTemp(double daCelsius){
        double fahrenheit = ((daCelsius * 9) / 5) + 32;
        return fahrenheit;
    }



    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end                                                //.trim
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"      .contain()
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for (String name : names) {
            System.out.println("I nomi sono :");
            convertName(name);   //abbiamo richiamato la funzione che prenderà in considerazione ogni elemento dell array
            // Call your function
        }
    }

    static void convertName(String name){
        for (int i=0;i<name.length();i++){    // apro un ciclo for per comprendere tutti i caratteri da analizzare nell array
            char character= name.charAt(i); // dichiaro una variabile di tipo char perchè grazie a .charAt(i) posso controllare ogni singolo carattere nella posizione (i)
            if (Character.isDigit(character)){ //apro una condizione if in cui grazie a . isDigit posso controllare se un singolo carattere corrisponde a una cifra numerica (digit).
                System.out.println("invalid"); //se ci sta una cifra numerica printa "invalid"

                return ; // significa "applica la condizione una volta sola ed esci "--> se non ci fosse stamperebbe due invalid perchè in Ant0ni0 ci sono 2 zeri

            }
        }
        System.out.println(name.toUpperCase().trim());
    }






    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;
        fastFoodMeal(lunchType,description,myLunchPrice,weightInGrams);

        // Call your function
    }
    static void fastFoodMeal(String meal, String descr, double price, int weight){
        System.out.println("You choose : " + meal +" --> good choice! is :" + descr + ". His weight is : " + weight + ". His price is : " + price);

    }
}
