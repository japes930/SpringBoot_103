import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        //Creates scanner object and declares variables
        Scanner keyboard = new Scanner(System.in);
        double loanAmt, intRate, monthMin, bal;
        int term;

        //Asks user amount for loan
        System.out.printf("Enter the loan amount: ");
        loanAmt = keyboard.nextDouble();

        //Asks for loan rate
        System.out.printf("Enter the interest rate on the loan: ");
        intRate = keyboard.nextDouble();

        //Asks user for number of years for loan payment
        System.out.printf("Enter the term (years) for the loan payment: ");
        term = keyboard.nextInt();

        System.out.printf("\n======================================\n");
        keyboard.close();

         //calls method for calculation
        monthMin = calculateMonthly(loanAmt, intRate, term);
        bal = -(monthMin*(term*12));
        System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", bal);
        System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ", monthMin);
    }


    //Creates method calculateMonthly to calculate monthly payment
    public static double calculateMonthly(double loanAmt, double intRate, int term) {
        // calculates the monthly payment 
        double rate = (intRate/ 100) / 12;
        double base = (1 + rate);
        double months = term* 12;
        double result;
        result = ((rate * loanAmt) / (1 - Math.pow(base, -months)));

        return result;
    }
}