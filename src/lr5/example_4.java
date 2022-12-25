package lr5;

public class example_4 {

    private char ch1;
    private int x;

    public  example_4(char ch1, int x) {
        this.ch1 = ch1;
        this.x = x;
        System.out.println("Символ: "+ ch1+", его код: "+x);
    }

    public example_4(double double_x){
        int j = (int) double_x;
        ch1 = (char) j;
        x = (int) ((double_x - j)*100);
        System.out.println("символ: "+ ch1+", его код: "+j + ", дробная часть: " + x);
    }

    public static void main(String[] args) {
        example_4 one = new example_4('g', 9);
        example_4 two = new example_4( 75.464278);

    }
}
