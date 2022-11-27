package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = in.nextInt();
        LocalDate current_date = LocalDate.now();
        int current_Year = current_date.getYear();
        int s = current_Year - age;
        System.out.println("Your year of birth: " +  s);
    }
}
