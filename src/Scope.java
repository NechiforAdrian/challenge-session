
public class Scope {

    int instanceVariable = 1;

    void localVariables() {
        int x = 4;
        int y = 5;
        int result = x + y;
        System.out.println("Print Local variable: " + result);
    }

    static int staticVariable = 3;

    public static void main(String[] args) {
        Scope object = new Scope();
        System.out.println("Call the instance variable: " + object.instanceVariable);
        object.localVariables();
        System.out.println("Static variable print: " + staticVariable);
    }
}
