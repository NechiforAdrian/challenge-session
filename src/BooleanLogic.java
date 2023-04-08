import java.util.Scanner;

public class BooleanLogic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first boolean value (true or false) : ");
        boolean value1 = scanner.nextBoolean();

        System.out.println("Enter second boolean value (true or false) : ");
        boolean value2 = scanner.nextBoolean();

        boolean andResult = value1 && value2;
        System.out.println("Boolean and(&&) result = " + andResult);
        boolean orResult = value1 || value2;
        System.out.println("Boolean or(||) result = " + orResult);
        boolean notResultValue1 = !value1;
        System.out.println("Boolean not(!) result for value1 = " + notResultValue1);
        boolean notResultValue2 = !value2;
        System.out.println("Boolean not(!) result for value2 = " + notResultValue2);

        scanner.close();


    }
}
