class MyTask implements Runnable {

    public void run() {
        System.out.println("Thread is running");
    }
}

public class RunnableInterfaceExample {

    public static void main(String[] args) {

        MyTask task = new MyTask();

        Thread t = new Thread(task);

        t.start();
    }
}