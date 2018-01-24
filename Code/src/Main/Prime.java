package Main;

import java.util.Queue;

public class Prime implements Runnable {

    public Queue<PrimeDetail> sending_Q = Randomizar.receiving_Q;
    public Queue<Integer> receiving_Q = Randomizar.sending_Q;

    public boolean checkPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void checkAndSend() {
        for (;;) {
            if (!receiving_Q.isEmpty()) {
                Integer intX = receiving_Q.poll();
                sending_Q.add(new PrimeDetail(intX, checkPrime(intX)));
            }
        }
    }

    @Override
    public void run() {
        checkAndSend();
    }
}
