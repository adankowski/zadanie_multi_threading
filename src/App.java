import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Long> arr = new ArrayList<>();
        long tm = System.currentTimeMillis();

        for (long i = 1L; i < 100L; i++) {
            arr.add(new PrimeProducer(i * 100000000000L).call());
        }
        System.out.println(arr  + " Computation time: " + (System.currentTimeMillis() - tm) + "ms");
    }
}
