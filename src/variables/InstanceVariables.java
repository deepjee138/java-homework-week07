package variables;

/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class InstanceVariables {
    int num1 = 23; // is a instance
    int num2 = 24;

    public static void main(String[] args){
       InstanceVariables obj = new InstanceVariables();
       System.out.println(obj.num1);
       System.out.println(obj.num2);
       obj.m1();

        }
        public void m1(){

        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.num1);
         System.out.println(obj.num2);

            }





    }

