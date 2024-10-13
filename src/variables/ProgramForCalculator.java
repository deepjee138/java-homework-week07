package variables;

/**Write a program for a calculator with addition, subtraction, multiplication
 and division methods all with parameters and use string concatenation
 methods.(Note:
 *
 */

public class ProgramForCalculator {

    public static void addition(int a, int b) {
        int answer = a + b;
        System.out.println("addition of two number " +a+ " and " +b+ " is " +answer+ ".");
    }
   public static void subtraction(int c, int d) {
    int answer = c - d;
    System.out.println("subtraction of two number " + c + "  and  " + d + "  is" + answer + ".");
    }
   public static void main(String[]args) {
       addition(10, 20);
       subtraction(30, 40);
       ProgramForCalculator obj = new ProgramForCalculator();
       obj.multification(70,90);
       ProgramForCalculator obj2 = new ProgramForCalculator();
       obj2.division(80,100);
   }
            public void multification(int e, int f){
                int answer= e  * f;
                System.out.println("multification of two number " + e + "  and  " + f+ "  is " + answer + ".");
            }

          public void division(int g, int h){
            int answer = g / h;
            System.out.println("division of two number" + g + "  and  " + h+ "  is " + answer + ".");
            }
        }











