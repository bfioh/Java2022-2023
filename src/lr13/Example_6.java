package lr13;

import lombok.SneakyThrows;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class ValueSumCounter extends RecursiveTask<Integer> {

    private int[] array;

    public ValueSumCounter(int[] array) {
        this.array = array;
    }

    @SneakyThrows
    @Override
    protected Integer compute() {
        if (array.length <= 2) {
            System.out.printf("Task %s execute in thread %s%n", this, Thread.currentThread().getName());
//            Thread.sleep(1);
            return Arrays.stream(array).sum();
        }
        ValueSumCounter firstHalfArrayValueSumCounter = new ValueSumCounter(Arrays.copyOfRange(array, 0, array.length / 2));
        ValueSumCounter secondHalfArrayValueSumCounter = new ValueSumCounter(Arrays.copyOfRange(array, array.length / 2, array.length));
        firstHalfArrayValueSumCounter.fork();
        secondHalfArrayValueSumCounter.fork();
        return firstHalfArrayValueSumCounter.join() + secondHalfArrayValueSumCounter.join();
    }
}

public class Example_6 {

    public static void main(String[] args) {
        int[] array = getInitArray(20000);
        ValueSumCounter counter = new ValueSumCounter(array);
        System.out.println(new Date());
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        System.out.println(forkJoinPool.invoke(counter));
        System.out.println(new Date());
    }

    public static int[] getInitArray(int capacity) {
        int[] array = new int[capacity];

        Random random = new Random();
        for (int i = 0; i < capacity; i++) {
            array[i] = random.nextInt(10000);
        }
        return array;
    }
}