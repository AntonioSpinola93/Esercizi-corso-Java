package javabasics._15;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1a: Edit this while loop to stop once our currentInvestmentValueEuros reaches €100,000
     * <p>
     * 1b: Change the same line, but now instead of currentInvestmentValueEuros reaching €100,000
     *
     *     Let's just run it for 5 years OR until it reaches €15,000 use || just like an if!
     */
    private static void exercise1() {
        System.out.println("Exercise 1 - Compounding Interest:");

        double currentInvestmentValueEuros = 10_000;  //i soldi che abbiamo
        double averageReturnFromStockMarketIndexPercentage = 8; //andamento della borsa x es indice del mercato azionario
        double perYearMultiplier = 1 + (averageReturnFromStockMarketIndexPercentage / 100); //moltiplicatore per anno --> 1 + 8/100 = 1,08
        int yearsPast = 0; // anni passati
        double interestGainedThisYearEuros = 0; // interessi ottenuti in euro all anno

        while (currentInvestmentValueEuros<=15_000 || yearsPast<=5) {      //finchè il valore di while è true procede all infinito --->fino a che non raggiungo un valore di 15k o son passati 5 anni -->PROCEDI
            System.out.println("Investment value = €" + currentInvestmentValueEuros + " after " + yearsPast++ + " years" +
                    ", interest this year €" + interestGainedThisYearEuros);
            double previousYearsInvestment = currentInvestmentValueEuros; //investimento dell anno precedente = investimento corrente
            currentInvestmentValueEuros = currentInvestmentValueEuros * perYearMultiplier; // 10k euros iniziali * 1.08 ogni anno che passa
            interestGainedThisYearEuros = currentInvestmentValueEuros - previousYearsInvestment; // gli interessi ammontano alla sottrazione dei soldi guadagnati in un anno - i soldi dell anno precedente
        }
    }

    /**
     * 2: Write a while loop for our trading bot!
     *
     *    The bot is going through a financial catastrophe! It's holding 10,000 great british pounds.
     *
     *    It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
     *    It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
     *
     *    On days where it sells, it can only sell 1000 pounds for euros.
     *
     *    Write a while loop
     *
     *    Use the calculation for exchange rate below
     *    1 + (Math.random() * 0.2);
     *
     *    to recalculate our rate every day (once per loop)
     *
     *    Print the number of days it takes for our bot to sell its pounds
     */
    private static void exercise2() {
        System.out.println("Exercise 2 - Selling the pound:");
        double poundToEuroExchangeRate = 1 + (Math.random() * 0.2); //cambio valuta
        int daysToSell = 0; //giorni passati
        int remainingPoundsToSell = 10_000; //budget iniziale
        int maxPoundsToSellPerDay = 1_000;  //soldi investibili per giorno

        while (remainingPoundsToSell>0){          // finchè i  nostri soldi sono superiori allo zero
             daysToSell++;                       // aggiungo il counter dei giorni
             poundToEuroExchangeRate = 1 + (Math.random() * 0.2); //aggiungo il cambio valuta per ogni giorno
             if (poundToEuroExchangeRate > 1.15){           // se il cambio valuta è superiore a 1.15

                remainingPoundsToSell-=maxPoundsToSellPerDay;// vendi
             }

        }

        // Write your while loop here

        System.out.println("It took " + daysToSell + " to exit that cursed economy");
    }

    /**
     * 3: Write answers below for the following 4 situations, should we use a while, do while, for i or for each loop?
     *    Which would work best? Why?
     *
     * Q Example: Print out the numbers 1 to 10
     * A Example: for i
     *
     * Q1: A user inputs their actions into an ATM, they can withdraw, deposit, check balance or exit. What loop should we use?
     * A1: while //poiché le azioni dell'utente devono essere eseguite almeno una volta e poi continuare finché l'utente non sceglie di uscire.
     *
     * Q2: We have a list of 1000 users to send emails to
     * A2: for each prende tutta la lista e finchè invia le mail fino a che non termina gli elementi dell array
     *
     * Q3: We want to print out the first 80 customer names from our bank database
     * A3: for i fa una selezione fra gli elementi di un array
     *
     * Q4: We want to read a file 100 lines at a time, without loading the full file into our program
     * A4: while // finchè le righe sono >0 leggimi 100 righe del totale.
     */
}
