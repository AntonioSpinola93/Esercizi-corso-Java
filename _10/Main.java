package javabasics._10;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * AND = &&
     * OR = ||
     * XOR = ^
     */

    /**
     * 1: Using an if statement, print: "Comfortable clothes" if the following conditions are met:
     *
     *    isWarm is true and wearingShorts is true
     *    isWarm is false and wearingShorts is false
     *
     *    If these conditions are not met, print: "Uncomfortable clothes"
     */
    private static void exercise1() {
        System.out.println("\nExercise 1 - Comfortable clothes:");

        double temperatureInCelsius = 5;
        double isWarmTemperatureInCelsius = 20;
        boolean isWarm = temperatureInCelsius >= isWarmTemperatureInCelsius;
        boolean wearingShorts = true;

        if ((isWarm && wearingShorts)||(!isWarm && !wearingShorts)){   // "se fuori è mite E vesto i pantaloncini OPPURE se fuori NON è mite E NON vesto i pantaloncini"
            System.out.println("Comfortable clothes");

        }else {
            System.out.println("Uncomfortable clothes");
        }

        // Write your code here
    }

    /**
     * 2: We are going to automate the club bouncer, write a condition with an if statement with the && (and)
     *    to check if someone is able to enter the club.
     *
     *    Their shoeType must be "fancy" AND they must be over 18 AND they must have at least 10 euros in their pocket
     *
     *    Write 1 if statement that checks all of these, print "Come in" if they meet the condition
     *    or "stay out" if they don't.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2 - Club Bouncer:");
        String shoeType = "fancy";



        int age = 30;
        double eurosInPocket = 17.5;
        double eurosForEntry = 10;
        boolean minAge = age>=18;
        boolean moneyNeed = eurosInPocket >= eurosForEntry;
        if ((shoeType=="della Lidl") && (minAge) && (moneyNeed)){
            System.out.println("Come in");
        }else{
            System.out.println("Stay out");
        }

        // Write your code here
    }

    /**
     * 3: Write an if else statement to calculate our grade
     *
     *    If our grade is 90%+ of the total, we print "A"
     *    If our grade is 80%+ of the total, we print "B"
     *    If our grade is 70%+ of the total, we print "C"
     *    If our grade is 60%+ of the total, we print "D"
     *    If our grade is under 60% of the total, we print "F"
     *
     *    If 'isTestRetry' we cap the maximum grade at C
     *
     *    Remember was can use ! to invert the value of a boolean, i.e. true -> false
     */
    private static void exercise3() {
        System.out.println("\nExercise 3 - Test Grader:");

        double ourTestScore = 8.5;
        double maxTestScore = 10;
        boolean isTestRetry = false;
        // double gradePercentage = ourTestScore / maxTestScore * 100; ----> creare valori in % --> codice + corto
        // uso questa forma per semplificare il ragionamento e la possibile spiegazione a un compagno dell esercizio
        if (!isTestRetry) { // ! = il compito non è un secondo tentativo

            if ((ourTestScore >= 9) && (ourTestScore <= maxTestScore)) { //il valore compreso tra 9.0 e 10.0 corrisponde al 90%+ del voto max
                System.out.println("A");
            } else if ((ourTestScore >= 8) && (ourTestScore < 9)) { //il valore compreso 8.0 e 8.9  corrisponde al 80%+ del voto max
                System.out.println("B");
            } else if ((ourTestScore >= 7) && (ourTestScore < 8)) { //il valore compreso 7.0 e 7.9  corrisponde al 70%+ del voto max
                System.out.println("C");
            } else if ((ourTestScore >= 6) && (ourTestScore < 7)) { //il valore compreso 6.0 e 6.9  corrisponde al 60%+ del voto max
                System.out.println("D");
            } else {
                System.out.println("F"); //i valori al di sotto di 5.9 sono al di sotto del 60%

            }

        } else {
            if ((ourTestScore>=7)&&(ourTestScore <= maxTestScore)){
                System.out.println("C"); // voto che va da 7.0 a 10.0 ha il cap a C

            }else if((ourTestScore>=6)&&(ourTestScore <7)){
                System.out.println("D");
            }else{
                System.out.println("F");
            }

        }
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ---------------------------------------------------------------------------------
     *    Write a XOR condition, print "safe" if only one car is driving down the road,
     *    print "CRASH! or No cars" if not.
     *
     *    XOR = ^
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Optional) - One way road:");
        boolean carIsDrivingFromLeftToRight = true;
        boolean carIsDrivingFromRightToLeft = false;
        if ((carIsDrivingFromRightToLeft)^(carIsDrivingFromLeftToRight)){
            System.out.println("safe");
        }else{
            System.out.println("Crash! or no Cars");
        }

        //Write your code here
    }
}
