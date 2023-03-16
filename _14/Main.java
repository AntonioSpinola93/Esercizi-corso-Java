package javabasics._14;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();

    }

    /**
     * 1a: Use a FOR EACH loop to the total sum all the elements of the ArrayList itemsA
     * 1b: Use a FOR EACH loop to the total sum all the elements of the int array itemsB
     * 1c: Use a FOR I loop to the total sum all the elements of the int ArrayList itemsA
     * <p>
     * Print your results
     * <p>
     * Notice how we can use the same exact code for arrays and ArrayLists
     */
    private static void exercise1() {
        System.out.println("Exercise 1a:");
        List<Integer> itemsA = Arrays.asList(1, 56, 23);
        int sumForA = 0;
        for(Integer item : itemsA){
            sumForA += item;
        }
        System.out.println("the sum is : "+ (sumForA));



        // Write your code for 1a here
        System.out.println("\nExercise 1b:");
        int[] itemsB = new int[]{1, 56, 23};

        int sumForB = 0;
        for (Integer item : itemsB){
            sumForB += item;
        }
        System.out.println("the sum is : "+ (sumForB));

        // Write your code for 1b here
        System.out.println("\nExercise 1c:");
        int sumForC = 0;
        for (int index=0;index<itemsA.size();index++){
            sumForC += itemsA.get(index);

        }
        System.out.println( "the sum is : " + sumForC);



        // Write your code for 1c here, refer back to the lesson to check the fori syntax

        if (sumForA != sumForB || sumForB != sumForC) {
            System.out.println("Failed, sums are different!");
        } else {
            System.out.println("Success, sums are the same!");
        }
    }

    /**
     * 2: Find the smallest and largest items in the arraylist
     * using a for each loop and an if statement/Math.min
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<Integer> items = Arrays.asList(300, 23, 56, 55, 84);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = 0;

        for (int item : items){ // for each item contained in the items box
            if (item < minNumber){ //if the single item is smaller of 2147483647(the.MAX_VALUE of int minNumber)
                minNumber = item;  // essendo il valore iniziale gigantesco rispetto a quello di ogni singolo elemento
            }                      //dell' array si comparerà a tutti fino a che non trova quello piu piccolo --> 300 < 2147483647 =300 ; 23< 300 = 23; 53<23 = falso quindi minNumber = 23
            if (item >maxNumber){
                maxNumber= item;
            }
        }
        System.out.println("Smallest number: " + minNumber);
        System.out.println("Largest number: " + maxNumber);


    }

    /**
     * 3: Edit the for i loop below so it only prints the first 2 names.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        List<String> names = Arrays.asList("Alan", "Alice", "Antonio", "Aziz");

        for (
                int index = 0;
                index < 2;           // solitamente nella parte centrale della sintassi abbiamo " i<names.size() " che racchiude tutto il
                index = index + 1    // contenuto dell' array . Modificandolo con il solo int corrispondente alla posizione degli elementi che
                                     // vogliamo possiamo estromettere i successivi ( in questo caso 2 comprende solo le posizioni 0 e 1 ovvero Alan e Alice
        ) {
            System.out.println(names.get(index));
        }
    }

    /**
     * 4: Edit the for i loop below so it prints the 8 multiplication table
     * <p>
     * Bonus, how could we use a single variable to change our times table?
     * <p>
     * Multiplication tables, in case my vocabulary is different:
     * <a href="https://i.pinimg.com/originals/e0/ca/5f/e0ca5f21a16a02edbba8b758e7aa4af5.jpg">
     *      https://i.pinimg.com/originals/e0/ca/5f/e0ca5f21a16a02edbba8b758e7aa4af5.jpg
     * </a>
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");

        for (
                int timesTableCurrentValue = 8; // <---- Edit this line
                timesTableCurrentValue <= 80; // <---- Edit this line
                timesTableCurrentValue = timesTableCurrentValue + 8// <---- Edit this line
        ) {
            System.out.println(timesTableCurrentValue);
        }
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * -------------------------------------------------------------------------<br/>
     * Inside of the for i loop below, write another for i loop to complete all
     * the multiplication tables between 1-10.
     *
     * i.e. 5  = 5,10,15,20,25,30,35,40,45,50
     *
     * When a loop in inside a loop, we call this a nested loop
     */
    private static void exercise5() {
        for (int timesTableNumber = 1; timesTableNumber <= 10; timesTableNumber++) {
        }
        for (int timesTableNumber = 2; timesTableNumber <= 20; timesTableNumber = timesTableNumber + 2) {
            System.out.println(timesTableNumber);
        }
        for (int timesTableNumber = 3; timesTableNumber <= 30; timesTableNumber = timesTableNumber + 3){
            System.out.println(timesTableNumber);
        }
        for (int timesTableNumber = 4; timesTableNumber <= 40; timesTableNumber = timesTableNumber + 4){
            System.out.println(timesTableNumber);
        }
        for (int timesTableNumber = 5; timesTableNumber <= 50; timesTableNumber = timesTableNumber + 5){
            System.out.println(timesTableNumber);
        }
        for (int timesTableNumber = 6; timesTableNumber <= 60; timesTableNumber = timesTableNumber + 6){
            System.out.println(timesTableNumber);
        }
        for (int timesTableNumber = 7; timesTableNumber <= 70; timesTableNumber = timesTableNumber + 7) {
            System.out.println(timesTableNumber);
        }
        for (int timesTableNumber = 8; timesTableNumber <= 80; timesTableNumber = timesTableNumber + 8) {
            System.out.println(timesTableNumber);
        }
        for (int timesTableNumber = 9; timesTableNumber <= 90; timesTableNumber = timesTableNumber + 9) {
            System.out.println(timesTableNumber);
        }
        for (int timesTableNumber = 10; timesTableNumber <= 100; timesTableNumber = timesTableNumber + 10) {
            System.out.println(timesTableNumber);
        }
    }


    }


