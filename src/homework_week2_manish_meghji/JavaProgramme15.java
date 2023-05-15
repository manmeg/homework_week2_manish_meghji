package homework_week2_manish_meghji;



public class JavaProgramme15
{
    /**
     * Java program to swap two variables.
     *
     */

        public void instMethod() {
            int a = 10, b = 20;
            int t = a;
            a = b;
            b = t;
            System.out.println(" After swapping value are .." + a + " " + b);
        }

        public static void main(String[] args) {
            JavaProgramme15 obj = new JavaProgramme15();
            obj.instMethod();
        }


}
