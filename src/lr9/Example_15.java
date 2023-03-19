package lr9;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] myArray = new int[5];
        int avg= 0;
        int count = 0;
        try{
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = in.nextInt();
            }
        } catch (InputMismatchException e){
            System.out.println("Ввёдён некоректный символ");
        }

        for (int i = 0; i < myArray.length; i++){
            if(myArray[i] > 0){
                avg = avg + myArray[i];
                count ++;
            }
        }
        if (count == 0){
            throw new NullPointerException("String can not be empty!");
        }
        System.out.println("Среднее арифметическое = " + (avg = avg / count));
    }
}
