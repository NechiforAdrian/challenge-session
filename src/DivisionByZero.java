import java.util.Scanner;

public class DivisionByZero {

    public static void main(String[] args) {
        Scanner numberDivide = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = numberDivide.nextInt();

        System.out.print("Enter second number: ");
        int number2 = numberDivide.nextInt();

        int result = number1 / number2;

        if (number1 == 0) {
            System.out.println("Cannot divide by zero!");
        } else {
            System.out.println("Result = " + result);
        }

        numberDivide.close();
    }
}
