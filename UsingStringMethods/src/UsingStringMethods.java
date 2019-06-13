import java.util.Scanner;
public class UsingStringMethods {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = keyboard.nextLine();
        System.out.println("Enter a number as an index: ");
        int num = keyboard.nextInt();

        System.out.println("The length of " + word + "is: " + word.length());
        System.out.println("The substring from 0 to " + num + " is: " + word.substring(0,num));


    }

}