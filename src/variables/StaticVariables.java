package variables;

/**2.1 Declare two static variables
 2.2 Declare one static method
 2.3 Call both static variables into the static method inside the print statement.
 2.4 Declare the Main method.
 2.5 Call the static method into the Main method and Run the programme.
 *
 */

public class StaticVariables {
 static int num1 = 23; // static variables
 static int num2 = 24;

    public static void main(String[] args) {
        System.out.println(num1);
        System.out.println(num2);
        StaticVariables obj = new StaticVariables();
        obj.m1();
    }
    public void m1(){
        System.out.println(StaticVariables.num1);
        System.out.println(StaticVariables.num2);


    }
}

