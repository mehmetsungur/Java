package threads;

public class MultiThreads {
    public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter("A");
        counter1.countMe();
        Counter counter2 = new Counter("B");
        counter2.countMe();

        System.out.println("*******************");

        CounterWithMulti counter3 = new CounterWithMulti("C");
        counter3.countMe();

        CounterWithMulti counter4 = new CounterWithMulti("D");
        counter4.countMe();
    }
}

class Counter{
    private String name;

    public Counter(String name) {
        this.name = name;
    }

    public void countMe() throws InterruptedException {
        for(int i=1;i<11;i++){
            try {
                java.lang.Thread.sleep(500);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println(i + name);
        }
    }
}

class CounterWithMulti extends Thread{
    private String name;

    public CounterWithMulti(String name) {
        this.name = name;
    }

    @Override
    public void run() throws InterruptedException {
        countMe();
    }

    public void countMe() throws InterruptedException {
        for(int i=1;i<11;i++){
            try {
                java.lang.Thread.sleep(500);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println(i + name);
        }
    }
}
