import java.util.Scanner;

public class IntegerOverFlow {

    public static void main(String[] args) {
        int x = 20;
        int y = 20;
        int result = x * y;

        if (result > Integer.MAX_VALUE) {
            System.out.println("The result is too bigger for a integer try use double, or... :");
        }else {
            System.out.println("Result :" + result);
        }
    }
}
