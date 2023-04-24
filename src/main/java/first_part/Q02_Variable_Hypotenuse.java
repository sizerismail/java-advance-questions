package first_part;

import java.util.Scanner;

public class Q02_Variable_Hypotenuse {

    //Write a script to calculate hypotenuses of triangles
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for the first vertex of the triangle");
        int a = input.nextInt();
        System.out.println("Enter a value for the second vertex of the triangle");
        int b = input.nextInt();

        double hypotenuse = Math.sqrt(a*a+b*b);
        System.out.println("Hypotenuse = " + hypotenuse);
    }



}

