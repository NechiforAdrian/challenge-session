import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day of the week: ");
        String day = scanner.nextLine().toLowerCase();

        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println(day + " is a day of week");
                break;
            case "saturday":
            case "sunday":
                System.out.println(day + " is a day of weekend");
                break;
            default:
                System.out.println("You enter a invalid day of week.");
                break;
        }
        scanner.close();
    }
}
