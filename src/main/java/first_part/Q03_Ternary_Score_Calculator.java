package first_part;

import java.util.Scanner;

public class Q03_Ternary_Score_Calculator {

    //A >= 90, B 80-89, C 70-79, D 60-69, E 50-59, F < 50

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your exam score");
        int score = input.nextInt();

        String result = score>100 ?
                "Please enter the score between 100-0" : score>89 ?
                "A" : score>79 ?
                "B" : score>69 ?
                "C" : score>59 ?
                "D" : score>49 ?
                "E" : score>-1 ?
                "F" : "Please enter the score between 100-0";
        System.out.println("result = " + result);


    }
}
