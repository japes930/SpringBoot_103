import java.util.Scanner;

public class iffyLoopy {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean redEyes = true;
        do {
            System.out.println("Are your eyes red?");
            String input = keyboard.next();
            char i = input.charAt(0);
            i = Character.toUpperCase(i);

            if (i == 'Y' || input.equalsIgnoreCase("yes")) {
                System.out.println("Get some sleep!");
            } else {
                System.out.println("You look great!");
                redEyes = false;
            }


            System.out.println("Do you want to try again?");
            String tryAgain = keyboard.next();
            if ((Character.toLowerCase(tryAgain.charAt(0)) == 'n') || tryAgain.equalsIgnoreCase("no")) {
                redEyes = false;
            }
        } while (redEyes);
    }
}
