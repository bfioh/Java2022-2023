package lr7.Example_5;

public class SecondSubExample_5 extends Example_5{

    protected char ch;

    SecondSubExample_5(String str, char ch) {
        super(str);
        this.ch = ch;
    }

    public void PrintInfo(){
        String className = getClass().getSimpleName();
        System.out.println(className + "\n " + " str: " +
                super.str + " ch: "+ ch);
    }
}
