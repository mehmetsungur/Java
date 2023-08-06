package threads;

public abstract class Thread {
    public static void main(String[] args) {
        System.out.println("Mevcut Thread: " + java.lang.Thread.currentThread().getName());

        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        java.lang.Thread myThread2 = new java.lang.Thread(myRunnable);
        myThread2.start();

        // anonymous class
        java.lang.Thread anonymous = new java.lang.Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous: " + java.lang.Thread.currentThread().getName());
            }
        });
        anonymous.setName("Nemrut");
        anonymous.start();

        // anonymous class alternative
        java.lang.Thread anonymous1 = new java.lang.Thread(() ->
                System.out.println("alternative: " + java.lang.Thread.currentThread().getName()));
        anonymous1.setName("alternative");
        anonymous1.start();

        try {
            java.lang.Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Sleep - 1000");
    }

    public abstract void run() throws InterruptedException;
}

class MyThread extends java.lang.Thread{
    @Override
    public void run() {
        System.out.println("MyThread: " + java.lang.Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("MyRunnable: " + java.lang.Thread.currentThread().getName());
    }
}