import java.util.Scanner;

public class DivisionByZero {

    public static void main(String[] args) {
        Scanner numberDivide = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = numberDivide.nextInt();

        System.out.print("Enter second number: ");
        int number2 = numberDivide.nextInt();

        if (number2 == 0) {
            System.out.println("Cannot divide by zero!");
        } else {
            int result = number1 / number2;
            System.out.println("Result = " + result);

            if (result == 0) {
                System.out.println("The result of the division is 0.");
            }
        }

        numberDivide.close();
    }
}
