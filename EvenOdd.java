import java.util.Scanner;

public class EvenOdd {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n ====== Even / Odd =======");
        System.out.println("Enter First Integer");
        int number = input.nextInt();
        if( number %2==0) {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
