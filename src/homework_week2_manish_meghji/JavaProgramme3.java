package homework_week2_manish_meghji;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class JavaProgramme3
{
    String name = "Chromebook";
    static int number = 100;

    public static void main(String[] args) {
        JavaProgramme3 obj = new JavaProgramme3();
        System.out.println(obj.name);
        System.out.println(JavaProgramme3.number);


    }
    public void m1() {
        JavaProgramme3 a = new JavaProgramme3();
        System.out.println(a.name);
    }

    public static void m2(){
        System.out.println(JavaProgramme3.number);

    }


}
