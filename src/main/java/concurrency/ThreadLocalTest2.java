package concurrency;

public class ThreadLocalTest2 {

    public static class MyRunnable implements Runnable {

        private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

        public MyRunnable(){
            threadLocal.set((int) (Math.random() * 100D));
            System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get() + " at constructor");
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get() + " at run method");
        }
    }


    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "A");
        Thread t2 = new Thread(new MyRunnable(), "B");
        t1.start();
        t2.start();
    }
}
