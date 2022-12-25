package lr5;

public class example_2 {
    private final char first = 'c';
    private final char two = 'o';

    public void print () {
        for (char i = first; i <= two;i++){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        example_2 example_2 = new example_2();
        example_2.print();
    }
}
