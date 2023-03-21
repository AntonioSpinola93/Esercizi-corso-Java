package javabasics._17;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
        data();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        int myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000l;
         long myBankBalanceEuro1 = myBankBalanceEuro + questionableFundsEuro;
        System.out.println("Actual balance : "+ myBankBalanceEuro1 + " euros ");

        //Add the questionable funds to your bank balance and print it out!
    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age =                       =short
     *    2b: The age of a baby in months           =byte
     *    2c: Money in a hedgefund in euros         =long
     *    2d: Price of a good in euros on amazon.com  =float
     *    2e: The exact weight of an apple measured by scientific equipment =double
     *    2f: The number of kilometers from any 2 places in the world = short
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");
    }

    static void data (){
        LocalDate time = LocalDate.now();
        System.out.println(time);
        int dayOfTheMonth = time.getDayOfMonth();
        System.out.println("Today is  : "+ dayOfTheMonth);
        DayOfWeek dayOfWeek = time.getDayOfWeek();
        System.out.println("Today is : "+ dayOfWeek);
        int dayOfTheYear= time.getDayOfYear();
        System.out.println("This is the " + dayOfTheYear+ "th day of the year");
        Month actualMonth= time.getMonth();
        System.out.println("We are in : "+ actualMonth);
        int monthNow = time.getMonthValue();
        System.out.println("Month = "+ monthNow);

        LocalDate time1 = LocalDate.now();
        LocalDate time2 = LocalDate.of(2053, 8, 25);
        if (time2.isBefore(time1) ){
            System.out.println("we are in the past");
        }else{
            System.out.println("we are in the future");
        }



    }

}


