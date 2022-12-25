package lr5;

public class example_3 {

    private int first, two;

    example_3 (){System.out.println("Пусто(");}

    example_3 (int first) {
        this.first = first;
        System.out.println(first);
    }

    example_3 (int first, int two) {
        this.first = first;
        this.two = two;
        System.out.print(first+" "+two);
    }

    public static void main(String[] args) {
        example_3 number_1 = new example_3();
        example_3 number_2 = new example_3(7);
        example_3 number_3 = new example_3(6,8);
    }
}
