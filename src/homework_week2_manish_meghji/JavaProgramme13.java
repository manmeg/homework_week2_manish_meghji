package homework_week2_manish_meghji;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */

import java.util.Scanner;

public class JavaProgramme13
{
        public void instMethod() {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter value A :  ");
            Double a = sc.nextDouble();
            System.out.println(" Enter value B :  ");
            Double b = sc.nextDouble();
            System.out.println(" Enter value C :  ");
            Double c = sc.nextDouble();
            Double avg = a + b + c / 3;
            System.out.println("Average : " + avg);

        }

        public static void main(String[] args) {
            JavaProgramme13 obj = new JavaProgramme13();
            obj.instMethod();

        }

}
