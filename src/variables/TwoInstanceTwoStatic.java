package variables;

/**4.1 Declare two instance and two static variables.
 4.2 Declare one instance method.
 4.3 Declare one static method.
 4.4 Call all four instance and static variables into both instance and static methods inside the
 print statement.
 4.5 Declare the Main method.
 4.6 Call both instance and static methods into the Main method and run the programme.

 *
 */

public class TwoInstanceTwoStatic {
        int a = 10; // instance
        int b = 20;
   static int c = 30; // static
   static int d = 40;

    public static void main(String[] args) {
        TwoInstanceTwoStatic obj = new TwoInstanceTwoStatic();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(TwoInstanceTwoStatic.c);
        System.out.println(TwoInstanceTwoStatic.d);
        obj.m1();

    }
    public void m1(){

        System.out.println(a);
        System.out.println(b);

        System.out.println(TwoInstanceTwoStatic.c);
        System.out.println(TwoInstanceTwoStatic.d);



    }

}
