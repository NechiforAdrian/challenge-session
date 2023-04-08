
public class CharToIntConversion {

    public static void main(String[] args) {
        char a = '2';
        System.out.println("Char converted to integer: " + (Character.getNumericValue(a)));

        char b = 'A';
        int intValue = Character.codePointAt(new char[]{b}, 0);
        System.out.println("Char converted to integer by non numeric digit: " + (intValue));//65
    }
}
