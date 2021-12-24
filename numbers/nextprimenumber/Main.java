package numbers.nextprimenumber;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        nextPrimeNumber();
    }

    public static void nextPrimeNumber() {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (a > 0) {
            System.out.print("Pick a number: ");
            int n = sc.nextInt();
            boolean isPrime = false;
            while (!isPrime) {
                n++;
                if (isPrime(n))
                    isPrime = true;
                else
                    continue;
            }       
            System.out.println("The next prime number is " + n);
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Continue? (Y/N)");
            String str = sc2.nextLine();
            if (str.equals("Y"))
                continue;
            else if (str.equals("N"))
                System.out.println("Have a good day!");
                break;
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}