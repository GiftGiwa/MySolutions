package numbers.primefactorization;
import java.util.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.print(primeFactorization());
    }
    public static List<Integer> primeFactorization() {
        ArrayList<Integer> aL = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number: ");
        int n = sc.nextInt();
        sc.close();
        int temp = n;
        while (n > 0) {
            if (n % 2 == 0) {
                aL.add(2);
                n /= 2;
            }
            else if (n % 3 == 0) {
                aL.add(3);
                n /= 3;
            }
            else if (n != 1) {
                aL.add(n);
                n = 0;
            }
            else {
                n = 0;
            }
        }
        System.out.print("The prime factors of " + temp + " are: ");
        System.out.println(aL);
        return aL;
    }

}
