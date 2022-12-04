package lr2;
import java.util.Scanner;
public class Example_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите тысячное число");
        int a = in.nextInt();
        if (a>=1000){
            a = a/1000;
            System.out.println("В введённом числе "+ a + " тысяч");
        }
        else if (a<=-1000){
            a=a/1000*-1;
            System.out.println("В введённом числе "+ a + " тысяч");
        }
        else {
            System.out.println("Число не удовлетворяет условию");
        }
    }
}
