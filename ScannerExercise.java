import java.util.Scanner;
public class scanner {

    public static void (String[] args){
        char firstInitial;
        String lastName, streetName, streetType, city;
        int houseNumber;

        Scanner keyboard = new Scanner(System.in);
        //System.out.print("What is your first name?");
        firstInitial = keyboard.next().charAt(0);
        System.out.print(firstInitial);
        lastName = keyboard.next();
        System.out.print(lastName);
        houseNumber = keyboard.nextInt();
        System.out.print(houseNumber);
        streetName = keyboard.next();
        System.out.print(streetName);
        streetType = keyboard.next();
        city = keyboard.nextLine();
        System.out.print(streetName);






            System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
            System.out.print(streetName + " " + streetType + " " + city);

        }
    }

}
