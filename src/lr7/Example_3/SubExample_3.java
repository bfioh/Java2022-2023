package lr7.Example_3;

public class SubExample_3 extends Example_3 {

    public char ch;

    SubExample_3(int num, char ch) {
        super(num);
        this.ch = ch;
    }

    public void set (int num, char ch){
        super.set(num);
        this.ch = ch;
    }

    public String toString() {
        String className = getClass().getSimpleName();
        return className + " num:" + super.num + " ch:" + ch;
    }

}
