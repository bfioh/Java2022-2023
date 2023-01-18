package lr7.Example_2;

public class SubExample_2 extends Example_2 {
    public int num;

    SubExample_2(String str1, int num) {
        super(str1);
        this.num = num;
    }

    public void set()   {    }

    public void set (String str1){
        super.SetStr1(str1);
    }

    public void set (int num){
        this.num = num;
    }

    public void set(String str1, int num){
        super.SetStr1(str1);
        set(num);
    }
}
