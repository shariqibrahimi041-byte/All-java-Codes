import java.util.Scanner;

public class Comparsion {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        System.out.print("Enter first integer: ");
        x = input.nextInt();
        System.out.print("Enter second integer: ");
        y = input.nextInt();
        if (x > y)
            System.out.printf(x+"is Largest");
        if (x < y)
            System.out.printf(y+"is Largest");
        if (x == y)
            System.out.printf(x+"is Equal to");



    }
}


