package numbers.tilecover;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int w = 10, h = 20;
        tileCover(w, h);
    }

    public static void tileCover(int w, int h) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much does the tile you would like to use cost (in USD/sq. ft.)? ");
        double cost = sc.nextDouble();
        double total = w * h * cost;
        System.out.println("It will cost $" + total + " to cover a " + w + " x " + h + " room.");
        sc.close();
    }
}
