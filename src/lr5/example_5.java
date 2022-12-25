package lr5;

public class example_5 {
    private int number_1;

    public void setNumber_1(int i){
        number_1 = i;
        if (i > 100)    {   number_1=100;   }
    }

    public void setNumber_1() {     number_1 = 0;     }

    example_5(int number_1){
        this.setNumber_1(number_1);
    }

    public int PrintInfo(){
        System.out.println(number_1);
        return number_1;
    }

    public static void main(String[] args) {
        example_5 primer = new example_5(105);
        primer.PrintInfo();
        primer.setNumber_1(381);
        primer.PrintInfo();
        primer.setNumber_1(-503);
        primer.PrintInfo();
        primer.setNumber_1(70);
        primer.PrintInfo();
    }
}
