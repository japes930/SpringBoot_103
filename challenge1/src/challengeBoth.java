 /***************************************************************************************
 *JP Villaflores                                                                        *
 * 6/14/19 Challenge 1                                                                  *
 * Objective: User will either provide a number or ask for a random one and then script *
 *            will determine if number is prime or not                                  *
 ***************************************************************************************/

import java.util.Scanner;
import java.util.Random;
public class challengeBoth {
    public static void main( String[] args){

        Scanner keyboard = new Scanner(System.in);
        boolean cont = true;
        do {
            boolean prime = true;

            System.out.println("Would you like to generate a random number? [Y/N]");
            char choice = keyboard.next().charAt(0);
            char c = Character.toUpperCase(choice);
            int num=0;


            //Switch for whether user wants a random number or user produced
            switch (c) {
                case 'N':
                    System.out.println("Enter a number: ");
                    num = keyboard.nextInt();
                    break;
                case 'Y':
                    Random rnd = new Random();
                    num = rnd.nextInt(250) + 1;
                    System.out.println("Random number is: " + num);
                    break;
            }

            //If number is divisible by 2, 3, or 5 it is not prime
            if ((num % 2 == 0) || (num % 3 == 0) || (num % 5 == 0)) { //Test 1
                prime = false;
            }

            //If number selected is 2, 3, or 5 it will know its prime
            int[] primeArr = {2, 3, 5};
            for (int i = 0; i < primeArr.length; i++) {
                if (num == primeArr[i]) {
                    prime = true;
                }
            }


            //Prints out whether the number selected is prime or not
            if (prime) {
                System.out.println(num + " IS a prime number!");
            } else {
                System.out.println(num + " is not a prime number.");
            }


            //Asks user if they'd like to pick another number
            System.out.println("Would you like another number? [Y/N]");
            char reply = keyboard.next().charAt(0);
            char r = Character.toUpperCase(reply);
            if (r == 'N') {
                cont = false;
            }
        } while (cont);
    }
}
