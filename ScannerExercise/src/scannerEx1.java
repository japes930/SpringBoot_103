import java.util.Scanner;
public class scannerEx1 {

    public static void main(String[] args){
        char firstInitial;
        String lastName, streetName, streetType, city;
        int houseNumber;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter name and address");
        firstInitial = keyboard.next().charAt(0);
        lastName = keyboard.next();
        houseNumber = keyboard.nextInt();
        streetName = keyboard.next();
        streetType = keyboard.next();
        city = keyboard.next();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.print(streetName + " " + streetType + " " + city);

    }
}
