/*Jonathan Villaflores
* 6.12.19
* guessNumber
*/
import java.util.Random;
import java.util.Scanner;
public class guessNumber {
    {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);

            //selects a random number and ensures its between 100 and 1
            Random random = new Random();
            long from = 1;
            long to = 100;
            int randomNumber = random.nextInt((int)(to - from + 1)) + (int)from;

            // notice the data types of the variables declared so far
            // (int) is an explicit cast that will convert a 'long' data type to an 'int' data type

            // declares and initiates variable that will hold user's guess
            int guessedNumber = 0;

            //Prints what the range the number is in
            System.out.printf("The number is between %d and %d.\n", from, to);

            //Asks user what number is and sets it to guessedNumber
            //Tells user if number is higher or lower than what was guessed
            do
            {
                System.out.print("Guess what the number is: ");
                guessedNumber = scan.nextInt();
                if (guessedNumber > randomNumber)
                    System.out.println("Your guess is too high!");
                else if (guessedNumber < randomNumber)
                    System.out.println("Your guess is too low!");
                else
                    System.out.println("You got it!");
            } while (guessedNumber != randomNumber);
        }
    }
}
