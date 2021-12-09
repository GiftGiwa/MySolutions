package numbers.pinthcounter;
public class Main {
    public static void main(String[] args) {
        System.out.println(piNthNumber(2)); 
    }
    public static double piNthNumber(int n) {
        return 3 + (int) ((Math.PI - 3 / Math.pow(10, -1 * n))) / (Math.pow(10, n));
    }
}
