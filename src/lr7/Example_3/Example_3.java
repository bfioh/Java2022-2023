package lr7.Example_3;

public class Example_3 {
    public int num;

    public void set (int num){
        this.num = num;
    }

    Example_3(int num ){
        set(num);
    }

    public String toString() {
        String className = getClass().getSimpleName();
        return className + " num:" + num;
    }

    public static void main(String[] args) {
        Example_3 example_3 = new Example_3(3);
        SubExample_3 subExample_3 = new SubExample_3(3, 'g');
        SubSubExample3 subSubExample3 = new SubSubExample3(3 , 'g', "ggwp ez");
        System.out.println(example_3.toString());
        System.out.println(subExample_3.toString());
        System.out.println(subSubExample3.toString());
    }
}
