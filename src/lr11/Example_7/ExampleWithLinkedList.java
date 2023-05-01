package lr11.Example_7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class ExampleWithLinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество людей");
        int N = in.nextInt();

        LinkedList<Integer> peoples = new LinkedList<>();
        for (int i = 1;i<=N;i++){
            peoples.add(i);
        }

        int x =0;
        Iterator<Integer> iterator = peoples.iterator();
        while (peoples.size() >1 ){
            if (iterator.hasNext()){
                iterator.next();
                x++;
                if (x ==2){
                    iterator.remove();
                    x=0;
                }
            }
            else {
                iterator=peoples.iterator();
            }
        }
        System.out.println(peoples);
    }
}
