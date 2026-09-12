
class JoinMethodDemo extends Thread {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("current thread " + name);
        // System.out.println("This is the run method logic");
    }
}

public class ThreadJoinMethod {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Method Execute now");
        JoinMethodDemo demo1 = new JoinMethodDemo();
        JoinMethodDemo demo2 = new JoinMethodDemo();
        JoinMethodDemo demo3 = new JoinMethodDemo();

        demo1.setName("child 1");
        demo2.setName("child 2");
        demo3.setName("child 3");
        demo1.start();
        demo1.join();//The current thread stops until the demo1 thread finishes.
        demo2.start();
        demo3.start();

        System.out.println("main method execution stop");

    }
}
