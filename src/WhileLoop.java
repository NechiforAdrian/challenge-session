import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        boolean isPrimeNumber = true;
        int i = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        while (i <= number / 2) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
            i++;
        }
        if (isPrimeNumber) {
            System.out.println(number + " is a prime number!");
        } else {
            System.out.println(number + " is not a prime number!");
        }
        scanner.close();
    }
}