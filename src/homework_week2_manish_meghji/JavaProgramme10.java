package homework_week2_manish_meghji;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */

import java.util.Scanner;

public class JavaProgramme10
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num1 = in.nextInt();

        for (int a=0; a< 10; a++){
            System.out.println(num1 + " x " + (a+1) + " = " +
                    (num1 * (a+1)));
        }
    }


}
