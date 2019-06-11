package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> scores = new ArrayList<Integer>();
        int counter = 0;
        Scanner myObj = new Scanner(System.in);
        while (counter<10){
            System.out.println("Enter test score");
            int testScore = myObj.nextLine();
            scores.add(testScore);
            //If (counter == 9){
            System.out.println(testScore);


        }
    }
}
