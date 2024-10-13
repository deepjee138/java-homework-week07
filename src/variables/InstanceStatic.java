package variables;

/**3.1 Declare one instance and one static variable.
 3.2 Declare one instance method.
 3.3 Declare one static method.
 3.4 Call both instance and static variables into both instance and static methods inside the
 print statement.
 3.5 Declare the Main method.
 3.6 Call both instance and static methods into the Main method and run the programme.
 *
 */

public class InstanceStatic {
    int num1 = 23; // variable
    static int mum2 = 24; // static

    public static void main(String[] args) {
        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.num1);
        System.out.println(StaticVariables.num2);
        System.out.println("method start here");
        obj.m1();
    }

    public void m1() {
        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.num1);
        System.out.println(StaticVariables.num2);
    }


}



