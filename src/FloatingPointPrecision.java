import java.util.Scanner;

public class FloatingPointPrecision {

    public static void main(String[] args) {
        //First mode
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float number1 = scanner.nextFloat();

        System.out.println("Enter the second number: ");
        float number2 = scanner.nextFloat();

        System.out.println("Enter the third number: ");
        float number3 = scanner.nextFloat();

        float average = number1 + number2 + number3 / 3;
        System.out.println("The average of this three floating numbers is = " + average);

        scanner.close();

        //Second Mode
        float number4 = 7f;
        float number5 = 1f;
        float number6 = 1f;
        float sum = number4 + number5 + number6 / 3;

        if (average > Float.MAX_VALUE) {
            System.out.println("You exceed the max value of float.");
        } else
            System.out.println("The average is = " + sum);
    }
}

