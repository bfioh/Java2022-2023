package timus.task_1563DODELAT;

import java.util.Objects;
import java.util.Scanner;

public class task_1563 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int shops_not_visited = 0;

        String shops[] = new String[N];

        for (int i = 0; i < shops.length; i++) {
            String k = in.nextLine();
            shops[i] = k;
        }

        for (int i = 0; i < shops.length; i++) {
            String k = shops[i];
            for (int j = shops.length - 1; j >= 0; j--) {
                String o = shops[j];

                if (shops[j] == null) {
                    j--;
                    i++;
                } else if (Objects.equals(o, k)) {
                    shops_not_visited++;
                    shops[j] = null;
                    shops[i] = null;
                }
            }
        }
        System.out.println(shops_not_visited);
    }
}
