package lr7.Example_3;

public class SubSubExample3 extends SubExample_3{

    public String str;

    SubSubExample3(int num, char ch, String str) {
        super(num, ch);
        this.str = str;
    }

    public void set (int num, char ch, String str){
        super.set(num, ch);
        this.str = str;
    }

    public String toString() {
        String className = getClass().getSimpleName();
        return className + " num:" + super.num +
                " ch:" + super.ch + " str: " + str;
    }
}
