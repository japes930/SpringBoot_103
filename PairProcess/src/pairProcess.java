import java.util.Scanner;

public class pairProcess {

    public static void main(String[] args) {
        int num1, num2, sum, product, avg;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        sum = num1 + num2;
        avg = sum/2;
        product = num1 * num2;


        if (sum > 200 && sum <1000) {
            System.out.printf("Sum: %d*~\nAverage is: %d\nProduct: %d ", sum, avg, product);
        } else if (sum > 200) {
            System.out.printf("Sum: %d*\nAverage is: %d\nProduct: %d ", sum, avg, product);
        } else {
            System.out.printf("Sum: %d\nAverage is: %d\nProduct: %d ", sum, avg, product);
        }
    }

}