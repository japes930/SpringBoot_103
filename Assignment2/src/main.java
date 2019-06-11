import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = myObj.nextLine();
        System.out.println("Enter amount");
        double purchaseAmount = myObj.nextDouble();
        System.out.println("Enter Tax Code");
        int taxCode = myObj.nextInt();



        System.out.println(name + " " + purchaseAmount + " " + taxCode);
        double taxPercent = 0;
        switch (taxCode) {
            case 0:
                taxPercent = 0;
                break;
            case 1:
                taxPercent = .03;
                break;
            case 2:
                taxPercent = .05;
                break;
            case 3:
                taxPercent = .07;
                break;
        }

        double taxTotal= purchaseAmount * taxPercent;
        double totalAmount= purchaseAmount + taxTotal;

        System.out.println(name);
        System.out.println("Cost before tax: " + purchaseAmount);
        System.out.println("Taxes: " + taxTotal);
        System.out.println("Total amount: " + totalAmount);




    }
}
