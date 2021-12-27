package numbers.mortgage;
/*Calculate the monthly payments of a fixed term mortgage
over given Nth terms at a given interest rate.
Also figure out how long it will take the user to pay back the loan.
For added complexity, add an option for users to select the
compounding interval (Monthly, Weekly, Daily, Continually).*/
public class Main {
    public static void main(String[] args) {
        double i = 5;
        double m = 50000.00;
        int t = 12;
        System.out.println(monthlyPayment(m, i, t));
        
    }

    public static double monthlyPayment(double mortgage, double interest, int terms) { 
        //monthly payments of fixed term mortgage
        double decimal = interest / 100;
        double onePlusPercentage = 1 + (decimal);
        double payment = mortgage * (decimal * Math.pow(onePlusPercentage, terms)) / (Math.pow(onePlusPercentage, terms) - 1);
        payment *= 100;
        int fixed = (int) payment;
        return fixed / 100.0;

    }

    public static double time() {
        //how long it will take to pay off loan

    }
}
