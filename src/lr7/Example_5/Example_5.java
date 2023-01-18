package lr7.Example_5;

public class Example_5 {

    protected String str;

    public void PrintInfo(){
        String className = getClass().getSimpleName();
        System.out.println(className + "\n " + " str: " + str);
    }

    Example_5(String str){
        this.str = str;
    }

    public static void main(String[] args) {
        Example_5 example_5 = new Example_5("ggwp");
        SecondSubExample_5 secondSubExample_5 = new SecondSubExample_5("ez",'g');
        FirstSubExample_5 firstSubExample_5 = new FirstSubExample_5("gl hf", 721);
        Example_5 example_5_ONE = new FirstSubExample_5("FIRST SUB", 738);

        example_5.PrintInfo();
        firstSubExample_5.PrintInfo();
        secondSubExample_5.PrintInfo();
        example_5_ONE.PrintInfo();
    }
}
