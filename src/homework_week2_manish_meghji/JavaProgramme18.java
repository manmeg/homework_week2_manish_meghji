package homework_week2_manish_meghji;

/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

import java.util.Scanner;

public class JavaProgramme18
{



        public void instMethod() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input first number : ");
            int num1 = sc.nextInt();
            System.out.print("Input second number : ");
            int num2 = sc.nextInt();
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
            System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
            System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
        }
        public static void main(String[] args) {
           JavaProgramme18 obj = new JavaProgramme18();
            obj.instMethod();
        }

}
