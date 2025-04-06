import java.util.Scanner;

public class EvenOddWithBitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if ((number & 1) == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
        System.out.println("Program executed sucessfully!");

        scanner.close();
    }
}
