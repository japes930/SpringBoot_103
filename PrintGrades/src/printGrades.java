import java.util.Scanner;
public class printGrades {
    public static void main (String [] args){
        Scanner keyboard = new Scanner(System.in);
        boolean enterGrade = true;
        char reply;
        int score = 0;
        while(enterGrade == true){
            System.out.println("Enter an exam score");
            score = keyboard.nextInt();
            if (score >= 0 && score < 60) {
                System.out.println("Yikes, your grade is an F.");
            } else if(score >= 60 && score < 70) {
                System.out.println("Yikes, your grade is a D.");
            } else if(score >=70 && score < 80) {
                System.out.println("Your grade is a C");
            } else if(score >=80 && score < 90) {
                System.out.println("Good job. Your grade is a B");
            } else{
                System.out.println("Excellent. Your grade is an A");
            }
            System.out.println("Do you want to enter another score (Y/N)?");
            reply = keyboard.next().charAt(0);
            char r = Character.toUpperCase(reply);
            if (r =='N'){
                enterGrade = false;
            } else {
                enterGrade = true;
            }

        }
    }
}
