package homework_week2_manish_meghji;

/**  Java program to convert a given string into lowercase.
 *   Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 *   Output: the quick brown fox jumps over the lazy dog.
 */
import java.util.Scanner;

public class JavaProgramme19
{
        public void Bh1Method() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter in Uppercase");
            String str = sc.nextLine();
            System.out.println(str.toLowerCase());
        }

        public static void main(String[] args) {
            JavaProgramme19 obj = new JavaProgramme19();
            obj.Bh1Method();
        }

}
