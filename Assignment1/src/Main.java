import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        int counter = 1;
        int sum = 0;
        Scanner myObj = new Scanner(System.in);
        while (counter<=10){
            System.out.println("Enter test score #" + counter);
            int testScore = myObj.nextInt();
            sum = sum + testScore;
            System.out.println(sum);
            if (counter==10){
                int avg = sum/counter;
                System.out.println("The average test score is a " + avg );
            }
            counter++;


        }
    }
}
