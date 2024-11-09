package Lab4_tasks;

public class Task1 extends Thread {
    public void run() {
        System.out.println("This is Task one. 115");
    }

    public static void main(String[] args) {
        Task1 thread1 = new Task1();
        Task1 thread2 = new Task1();
        Task1 thread3 = new Task1();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
