package numbers.fibonacci;

public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
