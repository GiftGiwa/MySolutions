package pinthcounter;
public class Main {
    public static void main(String[] args) {
        System.out.println(piNthNumber(0)); 
    }
    public static double piNthNumber(int n) {
        double decimal = Math.PI - 3;
        return 3 + (int) (decimal / Math.pow(10, -1 * n)) / (Math.pow(10, n));
    }
}
