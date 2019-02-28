package lang;

public class RunnableTest {
    public static void main(String[] args) {
        PrimeRun p = new PrimeRun(143);
        new Thread(p).start();
    }
}

class PrimeRun implements Runnable {
    private long minPrime;

    PrimeRun(long minPrime) {
        this.minPrime = minPrime;
    }

    public void run() {
        // compute primes larger than minPrime
        System.out.println(minPrime + 1);
    }
}