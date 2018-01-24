package Main;

public class Main {

    public static void main(String args[]) {
        new Thread(new Prime()).start();
        new Thread(new Randomizar()).start();
    }
}
