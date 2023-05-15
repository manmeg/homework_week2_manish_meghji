package homework_week2_manish_meghji;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class JavaProgramme4
{
    int a = 15;
    String carName = "Honda";
    static int b =18;
    static int number = 300;

    public static void main(String[] args) {
       JavaProgramme4 obj = new JavaProgramme4();
        System.out.println(obj.a);
        System.out.println(obj.carName);
        System.out.println(JavaProgramme4.b);
        System.out.println(JavaProgramme4.number);
        /* obj.m1();// direct run
         * m2();// direct run
         */
    }
    public void m1() {
        JavaProgramme4 D = new JavaProgramme4();
        System.out.println(D.a);
        System.out.println(D.carName);
    }
    public static void m2(){
        System.out.println(JavaProgramme4.b);
        System.out.println(JavaProgramme4.number);
    }


}
