package homework_week2_manish_meghji;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class JavaProgramme6
{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter any radius value:");
        double r = a.nextDouble();
        double Area =(22*r*r)/7;
        System.out.println("Area of circle of:"+Area);

    }


}
