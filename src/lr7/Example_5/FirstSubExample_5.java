package lr7.Example_5;

public class FirstSubExample_5 extends Example_5{

    protected int num;

    FirstSubExample_5(String str, int num ) {
        super(str);
        this.num = num;
    }

    public void PrintInfo(){
        String className = getClass().getSimpleName();
        System.out.println(className + "\n " + " str: " +
                super.str + " num: "+ num);
    }
}
