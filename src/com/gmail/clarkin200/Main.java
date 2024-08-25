package com.gmail.clarkin200;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("App for temperature converting");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter celsius value to fahrenheit");
        double celsius = sc.nextDouble();
        System.out.println("Enter fahrenheit value to celsius");
        double fahrenheit = sc.nextDouble();

        double celsiusResult = convCelsToFahr(celsius);
        double fahrenheitResult = convFahrToCels(fahrenheit);

        System.out.println("Result is "+ celsiusResult + " fahrenheit, " + fahrenheitResult + "celsius");


    }

    public static double convFahrToCels(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convCelsToFahr(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
