package numbers.pinthcounter;
public class Main {
    public static void main(String[] args) {
        System.out.println(piNthNumber(4)); 
    }
    public static double piNthNumber(int n) {
        int wholeNumber = (int) ( (Math.PI - 3.0) / Math.pow(10, -1 * n));
        return 3 + (wholeNumber / Math.pow(10, n));
    }
}
