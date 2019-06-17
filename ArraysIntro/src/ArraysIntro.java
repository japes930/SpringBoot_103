import java.util.Scanner;
import java.util.Arrays;



public class ArraysIntro {
    public static void main(String[] args) {
        //1
        int intArray[] = new int[10];
        for (int i = 0; i < 10; i++) {
            intArray[i] = i + 1;
        }

        //2
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
        }
        System.out.println(sum);

        //3
        Scanner keyboard = new Scanner(System.in);
        int userArray[] = new int[10];
        int userSum = 0;


        //4
        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Enter value # " + (i + 1));
            int input = keyboard.nextInt();
            userArray[i] = input;
            userSum = userSum + userArray[i];
        }
        int userAvg = userSum / userArray.length;
        System.out.println("Sum is: " + userSum);
        System.out.println("Average is " + userAvg);

//        *****************************************
//        #5 Store 3 names and print them out
//        *****************************************

//        String[] nameArray = new String[3];
//        for (int i = 0; i < nameArray.length; i++) {
//            System.out.println("Enter name # " + (i + 1));
//            String name = keyboard.next();
//            nameArray[i] = name;
//        }
//
//        for (String temp : nameArray){
//            System.out.println(temp);
//        }


//       #6
        int[] array6 = {2,5,9,0,2,1,8,5,4};
        for (int i = 0; i<array6.length; i++){
            if(array6[i] == 5){
                System.out.println(i);
            }
        }

//        #7
        int[] array7 = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 9; i>=0; i--){
            System.out.println(array7[i]);
        }

//        Array 8
//        Cannot replace char with string?
//

//        char[] array8 = {'w','t','y','h','k'};
//        for(int i = 0; i<array8.length; i++){
//            if(array8[i]=='t'){
//                array8[i]="hello";
//
//            }
//
//        }

        //#9
        int[] arrayA= {1,7,6,5,9};
        int[] arrayB= {2,7,6,3,4};
        for (int i = 0; i<arrayB.length; i++){
            for(int x=0; x<arrayA.length; x++){
                if (arrayA[x]==arrayB[i]){
                    System.out.println(arrayA[x]+", " + arrayB[i]);
                }
            }

        }


    }
}

