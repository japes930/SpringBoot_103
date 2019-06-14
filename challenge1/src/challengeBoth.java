 /***************************************************************************************
 * JP Villaflores                                                                       *
 * 6/14/19 Challenge 1                                                                  *
 * Objective: User will either provide a number or ask for a random one and then script *
 *            will determine if number is prime or not                                  *
 ***************************************************************************************/

import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

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

            //Creates Array for prime numbers
            //If number is in array prime = true
            //If the number is divisible by any of the prime numbers its not prime (!*redundant?*!)
            int[] primeArr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
                    47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
            for (int i = 0; i < primeArr.length; i++) {
                if (num == primeArr[i]) {
                    prime = true;
                } else if(num % primeArr[i] == 0) {
                    prime = false;
                }
            }


            //Prints out whether the number selected is prime or not
            if (prime) {
                System.out.println(num + " IS a prime number!");
            } else {
                System.out.println(num + " is not a prime number.");
            //Creates array to add what number is divisible by
                List<Integer> divArray = new ArrayList<Integer>();
                for (int i = num; i <= num && i > 1; i--){
                    if (num==i){
                        continue;
                    } else if(num%i==0){
                        divArray.add(i);
                    }
                }
                System.out.println(num  + " is divisible by: " + divArray);
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
