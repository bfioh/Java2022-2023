package lr9;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example_17 {
    public static void main(String[] args) {
        byte Sum = 0;
        Scanner in = new Scanner(System.in);
        byte[] myArray = new byte[3];
        for (int i = 0; i < myArray.length; i++) {
            try {
                myArray[i] = in.nextByte();
            } catch (InputMismatchException e){
                System.out.println("Введено некоректное значение");
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            Sum = (byte) (Sum + myArray[i]);
        }
        System.out.println(Sum);
    }
}
