package lr11.Example_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExampleWithArrayList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество людей");
        int N = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>(N);
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int x =0;
        Iterator<Integer> iterator = list.iterator();
        while (list.size() >1 ){
            if (iterator.hasNext()){
                iterator.next();
                x++;
                if (x ==2){
                    iterator.remove();
                    x=0;
                }
            }
            else {
                iterator=list.iterator();
            }
        }
        System.out.println(list);
    }
}