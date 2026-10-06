class MyTask implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {

        MyTask task = new MyTask();
        Thread t1 = new Thread(task);

        t1.start();
    }
}