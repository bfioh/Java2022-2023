package timus.task_1585DODELAT;

import java.util.Scanner;

public class Task_1585 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        String b = in.nextLine();
        System.out.println();
        String[] penguins = new String[a];

        int Emperor_Penguins = 0;
        int Little_Penguins = 0;
        int Macaroni_Penguins = 0;

        for (int i = 0; i < penguins.length; i++) {
            penguins[i] = in.nextLine();
            System.out.println(penguins[i]);
            if (penguins[i].contains("Emperor Penguin")) {
                Emperor_Penguins++;
            } else if (penguins[i].contains("Little Penguin")) {
                Little_Penguins++;
            } else {
                Macaroni_Penguins++;
            }
        }
        if (Emperor_Penguins > Little_Penguins && Emperor_Penguins > Macaroni_Penguins)
            System.out.println("Emperor Penguins");
        else if (Emperor_Penguins < Little_Penguins && Little_Penguins > Macaroni_Penguins)
            System.out.println("Little Penguins");
        else if (Macaroni_Penguins > Little_Penguins && Emperor_Penguins < Macaroni_Penguins)
            System.out.println("Macaroni Penguins");
    }
}
