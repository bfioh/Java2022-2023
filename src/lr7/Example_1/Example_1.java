package lr7.Example_1;

public class Example_1 {

    private String str1;

    Example_1(String str1){
        this.str1 = str1;
    }

    Example_1() {}

    @Override
    public String toString() {
        return "Example_1{" +
                "Class name:" + this.getClass().getSimpleName()+ "\n" +
                "str1 = " + this.getStr1()+"}";
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1 (String str1){
        this.str1 = str1;
    }
}

