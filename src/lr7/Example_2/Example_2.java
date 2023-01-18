package lr7.Example_2;

public class Example_2 {
    private String str1;

    public void SetStr1(){}

    public void SetStr1(String str1){
        this.str1 = str1;
    }

    Example_2 (String str1){
        this.str1 = str1;
    }

    public int getStr1Length(){
        return str1.length();
    }
}
