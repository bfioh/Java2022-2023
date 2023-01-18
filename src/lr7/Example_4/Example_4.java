package lr7.Example_4;

public class Example_4 {
    public char ch;

    Example_4 (char ch){
        this.ch = ch;
    }

    Example_4(Example_4 example_4){
        this.ch = example_4.ch;
    }

    public String toString() {
        String className = getClass().getSimpleName();
        return className + " ch:" + ch;
    }

    public static void main(String[] args) {
        Example_4 example_4 = new Example_4('s');
        SubExample_4 subExample_4 = new SubExample_4('g',"ggwp");
        SubSubExample_4 subSubExample_4 = new SubSubExample_4('s', "ss", 4);

        System.out.println(example_4.toString());
        System.out.println(subExample_4.toString());
        System.out.println(subSubExample_4.toString());
    }
}
