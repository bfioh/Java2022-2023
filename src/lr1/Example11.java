package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = in.nextLine();
        System.out.println("enter your year of birth: ");
        int year_birth = in.nextInt();
        LocalDate current_date = LocalDate.now();
        int current_Year = current_date.getYear();
        int s = current_Year - year_birth;
        System.out.println("Your name: " + name + "\n" + "Your age: "+s);
    }
}