package numbers.etothenthnumber;
public class Main {
    public static void main(String[] args) {
        System.out.println(eNthNumber(5));
    }
    public static double eNthNumber(int n) {
        return 2 + (int) ((Math.exp(1) - 2) / Math.pow(10, -1 * n)) / (Math.pow(10, n));
    }
}
