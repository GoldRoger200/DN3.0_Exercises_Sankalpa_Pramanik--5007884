import java.util.*;
public class finForecast {
    public static double futureValue(double P0, double r, int n) {
        if (n == 0) {
            return P0;
        } else {
            return futureValue(P0, r, n - 1) * (1 + r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting value:");
        double initialValue = sc.nextDouble(); // Initial investment
        System.out.println("Enter the growth rate:");
        double growthRate = sc.nextDouble();   // 5% annual growth rate
        System.out.println("Enter number of years:");
        int years = sc.nextInt();             // Number of years

        double fv = futureValue(initialValue, growthRate, years);
        System.out.println("The future value after " + years + " years is: " + fv);
        sc.close();
    }
}
