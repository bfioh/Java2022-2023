package lr9;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_16 {
    public static void main(String[] args) {
        int NumStolb = 0;
        int[][] twoDimArray = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер столбца");
        try {
            NumStolb = in.nextInt();
            if ((NumStolb < 0) || (NumStolb > 4)) {
                throw new IllegalArgumentException("Нет такого столбца");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ввёдён некоректный символ");
        } catch (IllegalArgumentException e) {
            System.out.println("Нет такого столбца");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(twoDimArray[i][NumStolb]);
        }
    }
}
