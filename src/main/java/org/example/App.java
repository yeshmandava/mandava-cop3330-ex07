package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *  *  Copyright 2021 Yeshwanth Mandava
 */

public class App
{

    public static void main( String[] args )
    {
        float conversion = (float) 0.09290304;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        double length = input.nextDouble();

        System.out.print("What is the length of the room in feet? ");
        double width =input.nextDouble();

        System.out.print("You entered dimensions of "+length+" feet by "+width+" feet.");

        double areaFeet = length * width;
        double areaMeters = areaFeet * conversion;
        System.out.printf("The area is\n%.3f square feet\n%.3f square meters", areaFeet, areaMeters);

    }



}