import java.util.Scanner;
public class monthSwitch {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many days in the month?");
        int days = keyboard.nextInt();
        String month;


//        Maybe do for loop with array of 28,30,31 here?
//        int[] arrData = {28,30,31};
//        for (int intTemp : arrData){
//            System.out.println(intTemp);
//            if (days == intTemp) {

//Maybe put inside while loop for when user submits invalid number of days


            //If user inputs valid number of days then return months, otherwise
            if (days == 28 || days == 30 || days== 31){
                    switch (days) {
                        case 28:
                            month = "February";
                            System.out.println(month);
                            break;
                        case 30:
                            month = "September, April, June, November";
                            System.out.println(month);
                            break;
                        case 31:
                            month = "January, March, May, July, August, October, December";
                            System.out.println(month);
                            break;
                    }

            } else {
                    System.out.printf("There are no months that have %d days\n",days);
            }

    }
}
