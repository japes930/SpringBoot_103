import java.util.Scanner;
public class petQuestions{



    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);  //Added line to read in scanner
        String name;
        String breed;
        int age;

        System.out.print( "Greetings. What is your pet's name? " );
        name = keyboard.next();

        System.out.print( "What kind of animal is " + name + "? " );
        breed = keyboard.next();  //Added line to take user input as variable 'breed'

        System.out.print( "How old is " + name + "? ");
        age = keyboard.nextInt(); //Added line to take next input from user that is a number as variable 'age'

        System.out.println( name + " is your " + breed + " and it is " + age );
    }
}