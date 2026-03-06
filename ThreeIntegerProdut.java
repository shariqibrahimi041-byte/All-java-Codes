import java.util.Scanner;

public class ThreeIntegerProdut {

    public static void main() {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int sum;
        int sub;
        int mul;
        int division;
        System.out.print("Enter first integer: ");
         x = input.nextInt();
         System.out.print("Enter second integer: ");
         y = input.nextInt();
     sum = x+y;
        sub= x-y;
        mul = x*y;
        division = x/y;
        sum = x + y;
        System.out.println("Addition is: "+ sum);
        sub = x - y;
        System.out.println("Subtraction is: "+ sub);
        mul = x * y;
        System.out.println("Multiplication is: "+ mul);
        division= x - y;
        System.out.println("Division is: "+ division);

    }
}
