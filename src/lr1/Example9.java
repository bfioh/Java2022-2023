package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter month: ");
        String month = in.nextLine();
        System.out.println("enter the number of days in this month: ");
        int day_number = in.nextInt();
        System.out.println( "Month " + month + " contains " + day_number + " days");
    }
}
