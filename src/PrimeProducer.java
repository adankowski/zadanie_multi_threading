import java.util.concurrent.Callable;

public class PrimeProducer implements Callable<Long> {
    private final long base;

    public PrimeProducer(Long base) {
        this.base = base;
    }

    @Override
    public Long call() throws Exception {
        long num = base;
        while (!isPrime(num)) {
            num = num + 1;
        }
        return num;
    }

    private boolean isPrime(long n) throws Exception {
        if (n < 1) throw new Exception("Wrong number " + n);
        if (n == 1) return false;

        for (long i = 2; i <= Math.sqrt(n); i ++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
