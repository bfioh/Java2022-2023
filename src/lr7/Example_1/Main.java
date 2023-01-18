package lr7.Example_1;

public class Main {
    public static void main(String[] args) {

        Example_1 example_1 = new Example_1("КОНСТРУКТОР СУПЕРКЛАССА");
        String className = example_1.toString();
        System.out.println(className);

        SubExample1 subExample_1 = new SubExample1("КОНСТРУКТОР ПОДКЛАССА");
        String subClassName = subExample_1.toString();
        System.out.println(subClassName);

        SubExample1 subExample_2 = new SubExample1 ("КОНСТРУКТОР ПОДКЛАССА","С ДВУМЯ ПАРАМЕТРАМИ");
        String subClassName2 = subExample_2.toString();
        System.out.println(subClassName2);

    }
}
