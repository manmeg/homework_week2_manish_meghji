package homework_week2_manish_meghji;

/**
 * Write a program to calculate the area of a triangle.
 */

import java.util.Scanner;

public class JavaProgramme8
{
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the width of the Triangle:");
        double a = s.nextDouble();

        System.out.println("Enter the height of the Triangle:");
        double b = s.nextDouble();

        double area = (a * b) / 2;
        System.out.println("Area of Triangle is: " + area);
    }


}
