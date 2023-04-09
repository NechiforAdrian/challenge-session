
public class TypeCasting {

    public static void main(String[] args) {
        int myInt = 10;
        double myDouble = myInt;
        System.out.println("The int number : " + myInt);
        System.out.println("Automatic casting int to double: " + myDouble);

        double myDoubleNumber = 22.50;
        int myIntNumber = (int) myDoubleNumber;
        System.out.println("The double number : " + myDoubleNumber);
        System.out.println("The manual casting double to int: " + myIntNumber);

    }
}
