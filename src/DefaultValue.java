
public class DefaultValue {
    public String name;
    public int age;
    public double height;
    public char sex;

    @Override
    public String toString() {
        return "DefaultValue{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", sex=" + sex +
                '}';
    }

    public static void main(String[] args) {
        DefaultValue defaultValue = new DefaultValue();
        System.out.println("Variables whit different data types but not initialized" + defaultValue);
    }
}
