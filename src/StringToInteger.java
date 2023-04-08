
public class StringToInteger {

    public static void main(String[] args) {

        String x = "15";
        System.out.println("First mode: " + (Integer.parseInt(x) + 5));

        int y = Integer.parseInt("5");
        System.out.println("Second mode1: " + (y + 5));

        int a = Integer.parseInt(x);
        System.out.println("Second mode2: " + (a + 10));

        String s = "age: 45";
        s = s.replaceAll("\\D+", "");

        int i = Integer.parseInt(s);
        System.out.println("Third mode: " + (s + 5));
    }
}
