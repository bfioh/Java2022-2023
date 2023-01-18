package lr7.Example_1;

public class SubExample1 extends Example_1 {
    private String str2;
    private String str3;

    SubExample1 (String str2){
        this.str2 = str2;
    }

    SubExample1 (String str2, String str3){
        this.str2 = str2;
        this.str3 = str3;
    }

    @Override
    public String toString() {
        return "SubExample1{" +
                "Class name:" + this.getClass().getSimpleName()+ "\n" +
                "str1='" + this.getStr1() + "\n" +
                "str2='" + getStr2() + "\n" +
                ", str3='" + getStr3()  +
                '}';
    }

    public String getStr2 (){
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public String getStr3 (){
        return str3;
    }

    public void setStr3(String str3) {
        this.str3 = str3;
    }
}
