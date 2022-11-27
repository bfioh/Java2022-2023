package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the day of week: ");
        String day_of_week = in.nextLine();
        System.out.println("enter month: ");
        String month = in.nextLine();
        System.out.println("enter day number: ");
        int day_number = in.nextInt();
        System.out.println(day_of_week + "," + day_number +" " +month);
    }
}
