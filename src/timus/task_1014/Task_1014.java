package timus.task_1014;

import java.util.Scanner;

public class    Task_1014 {

    private static final Object lock = new Object();
    private static final int cores = Runtime.getRuntime().availableProcessors();
//    private static int number_counter = 0;
    private static int pointer = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        Thread[] th = new Thread[cores];

//        for (int i = 0; i < cores; i++) {
//            int c = i;
//            th[i] = new Thread(() -> {
//                synchronized (lock) {
//                    while (pointer <= 1000000000) {
//                        System.out.println(pointer + ") " + Thread.currentThread().getName() + " (" + c + ") : " + arr[pointer]);
//                        if (arr[pointer] > max) max = arr[pointer];
//                        pointer++;
//                        try {
//                            lock.wait(1);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//
//                        lock.notifyAll();
//                    }
//                }
//            });
//        }
    }
}
