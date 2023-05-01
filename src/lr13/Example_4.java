package lr13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Напишите программу, которая создает 10 потоков и каждый
// поток выводит на экран свой номер.
public class Example_4 {
    public static void main(String args[]) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i <= 200000; i++) {
            service.submit(new Task(i));
        }
    }
}

final class Task implements Runnable {
    private int taskId;

    public Task(int id) {
        this.taskId = id;
    }

    @Override
    public void run() {
        System.out.println("Task ID : " + this.taskId + " performed by "
                + Thread.currentThread().getName());
    }
}

