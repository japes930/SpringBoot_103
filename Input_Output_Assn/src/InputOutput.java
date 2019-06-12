import java.util.Scanner;
public class InputOutput
{
    public static void main( String[] args )
    {
        //Read in Scanner class from library and sets to keyboard variable
        Scanner keyboard = new Scanner(System.in);

        //Declares variables
        double num1, num2, num3;

        //Asks user for 2 temperatures
        System.out.print( "First temperature? " );
        num1 = keyboard.nextDouble();
        System.out.print( "Second temperature? " );
        num2 = keyboard.nextDouble();

        //Adds first two numbers, gets average, then prints avg out
        num3 = (Double.sum(num1, num2)) / 2;
        System.out.println("The average temperature is : " + num3);
    }
}

