package Main;

public class PrimeDetail {

    private Integer intX;
    private boolean isPrime;

    PrimeDetail(Integer intX, boolean checkPrime) {
        this.intX = intX;
        this.isPrime = checkPrime;
    }

    public Integer getIntX() {
        return intX;
    }

    public void setIntX(Integer intX) {
        this.intX = intX;
    }

    public boolean isIsPrime() {
        return isPrime;
    }

    public void setIsPrime(boolean isPrime) {
        this.isPrime = isPrime;
    }

    @Override
    public String toString() {
        return intX + " : " + isPrime;
    }
}
