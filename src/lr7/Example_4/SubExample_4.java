package lr7.Example_4;

public class SubExample_4 extends Example_4{

    public String str;

    SubExample_4(char ch, String str) {
        super(ch);
        this.str = str;
    }

    public SubExample_4(SubExample_4 subExample_4) {
        super(subExample_4);
        this.str = subExample_4.str;
    }

    public String toString() {
        String className = getClass().getSimpleName();
        return className + " ch:" + super.ch + " str: "+
                str;
    }
}
