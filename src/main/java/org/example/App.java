/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        //initializing doubles for each temp
        double cConvert, fConvert;

        //asking for temperature to be inputted
        System.out.println("Press C to convert from Fahrenheit to Celsius\n");
        System.out.println("Press F to convert from Celsius to Fahrenheit\n Your choice: \n");
        String temp = scanner.nextLine();

        //if statement to convert fahrenheit to celsius
        if (temp.equals("C") || temp.equals("c") ) {

            //print statement asking for fahrenheit to be inputted
            System.out.println("Please enter the temperature in Fahrenheit:\n");
            double far = scanner.nextDouble();

            //conversion
            fConvert = (far - 32) * 5 / 9;

            //outputs conversion
            System.out.format(" The temperature in Celsius is %.2f\n", fConvert);

            return;
        }


        //if statement to convert celsius to fahrenheit
        if (temp.equals("F") || temp.equals("f")) {

            //print statement asking for celsius to be inputted
            System.out.println("Please enter the temperature in Celsius:\n");
            double cel = scanner.nextDouble();

            //conversion
            cConvert = (cel * 9 / 5) + 32;

            //outputs conversion
            System.out.format(" The temperature in Fahrenheit is %f\n", cConvert);
        }
            else {

            //if not "F", "f", "C", or "c"
            System.out.println("Wrong letter entered!");

        }
    }
}
