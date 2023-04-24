package first_part;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q01_Variable_Fahrenheit_To_Celsius {
    //Write a method that convert Fahrenheit to Celsius
    // c = (f-32)*5/9

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Fahrenheit degree");
        double givenDegree = input.nextDouble();

        double cel = (givenDegree-32)*5/9;


        System.out.println("Weather is " + cel + " Celcius today");

        DecimalFormat format = new DecimalFormat("0.00");

        String formattedCel = format.format(cel);

        System.out.println("Weather is " + formattedCel + " Celcius today");

       // double doubleCel = Double.valueOf(formattedCel); // it doesnt work
        double doubleCel = Double.parseDouble(formattedCel);
       //System.out.println("Weather is " + doubleCel + " Celcius today");

        System.out.printf("%.2f",cel);


    }

}
