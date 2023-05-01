package lr13;

import java.util.Arrays;
import java.util.Random;


public class Example_5 {
    private static final Object lock = new Object();
    private static Random random = new Random();
    private static int[] arr = new int[10000];
    private static int pointer = 0;
    private static Integer max = Integer.MIN_VALUE;
    private static final int cores = Runtime.getRuntime().availableProcessors();


    public static void main(String[] args) {

        Thread[] th = new Thread[cores];

        for (int i = 0; i < 10000; i++) {
            arr[i] = random.nextInt(100000);
        }

        System.out.println("Массив: "+ Arrays.toString(arr));

        for (int i = 0; i < cores; i++) {
            int c = i;
            th[i] = new Thread(() -> {
                synchronized (lock) {
                    while (pointer < 10000) {
                        System.out.println(pointer + ") " + Thread.currentThread().getName() + " (" + c + ") : " + arr[pointer]);
                        if (arr[pointer] > max) max = arr[pointer];
                        pointer++;
                        try {
                            lock.wait(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        lock.notifyAll();
                    }
                }
            });
        }

        for (int i = 0; i < cores; i++) {
            th[i].setName("Thread #" + (i + 1));
            th[i].start();
        }

        for (int i = 0; i < cores; i++) {
            try {
                th[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Максимальное число: " + max);
    }
}