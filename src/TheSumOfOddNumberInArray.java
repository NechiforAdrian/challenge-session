public class TheSumOfOddNumberInArray {

    public static void main(String[] args) {
        int[] numbers = { 3, 5, 9, 11, 13 };
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
        }

        System.out.println("Sum of odd numbers: " + sum);
    }
}

