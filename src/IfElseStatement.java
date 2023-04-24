import java.util.Scanner;

public class IfElseStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello,check if your number is Even or Odd:");
        System.out.println("Enter your number: ");
        int number1 = scanner.nextInt();

        if (number1 % 2 == 0) {
            System.out.println(number1 + " - It's a Even number");
            System.out.println("Have a nice day!");
        } else {
            System.out.println(number1 + " - It's a Odd number");
            System.out.println("Have a nice day!");
        }
        scanner.close();
    }
}
