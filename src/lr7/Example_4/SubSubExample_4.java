package lr7.Example_4;

public class SubSubExample_4 extends SubExample_4 {

    public int num;


    SubSubExample_4(char ch, String str, int num) {
        super(ch, str);
        this.num = num;
    }

    SubSubExample_4(SubSubExample_4 subSubExample_4){
        super(subSubExample_4);
        this.num = subSubExample_4.num;
    }

    public String toString() {
        String className = getClass().getSimpleName();
        return className + " ch: " + super.ch + " str: "+
                super.str + " num: " + num;
    }
}
