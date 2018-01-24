/*
 * Programming Challange
 * Randomizer : add random integer to distributed queue.
 */
package Main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @author Kishan Malaviya
 */
public class Randomizar implements Runnable {

    Random rn = new Random();

    public static Queue<Integer> sending_Q = new LinkedList<>();
    public static Queue<PrimeDetail> receiving_Q = new LinkedList<>();

    private void sendAndReceive() {
        for (;;) {
            sending_Q.add(rn.nextInt());
            if (!receiving_Q.isEmpty()) {
                System.out.println(receiving_Q.poll());
            }
        }
    }

    @Override
    public void run() {
        sendAndReceive();
    }

}
