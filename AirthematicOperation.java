import java.util.Scanner;

public class AirthematicOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n=========== Welcom to Aithematic Operatins=========");
        int number1, number2, number3;
        int sum, average, product, smallest, largest;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        System.out.print("Enter third integer: ");
        number3 = input.nextInt();

        sum = number1 + number2 + number3;
        average = sum / 3;
        product = number1 * number2 * number3;

        smallest = number1;
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
        largest = number1;
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }
        System.out.println("\n====== Results =======");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        System.out.println("\n ========= Operatins is End =========");

    }
}
