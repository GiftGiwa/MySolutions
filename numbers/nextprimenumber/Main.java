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
            System.out.println("Pick a number: ");
            int n = sc.nextInt();
            System.out.println("The prime number that comes after " + n + " is: ");
            boolean isPrime = false;
            while (!isPrime) {
                n++;
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        continue;
                    }
                    else {
                        isPrime = true;
                        break;   
                    }
                }
            }
            System.out.println(n);
            System.out.println("Continue? (Y/N)");
            String s = sc.nextLine();
            if (s.equals("N") || s.equals("n"))
                break;
            else if (s.equals("Y") || s.equals("y"))
                continue;
            
        }
    }
}