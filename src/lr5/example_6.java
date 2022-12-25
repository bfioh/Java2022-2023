package lr5;

public class example_6 {
    private static int max,min;

    example_6 (int a1, int b2) {
       min = Math.min(a1,b2);
       max = Math.max(Math.max(a1,max),b2);
    }

    example_6 (int b) {
        min = Math.min(min,b);
        max = Math.max(max,b);
    }

     void SetInt(int a1, int b2){
        min = Math.min(Math.min(a1,min),b2);
        max = Math.max(Math.max(a1,max),b2);
    }

     void SetInt (int a1) {
        min = Math.min(min, a1);
        max = Math.max(max, a1);
    }

     int PrintInfo(){
        System.out.println("Минимальное число: "+ min);
        System.out.println("Максимальное число: " + max);
        return 1;
    }



    public static void main(String[] args) {
        example_6 primer = new example_6(5);
        primer.PrintInfo();
        example_6 primer2 = new example_6(756, 66);
        primer2.PrintInfo();
        primer.SetInt(9);
        primer.PrintInfo();
        primer.SetInt(871, 642);
        primer.PrintInfo();
    }

}
