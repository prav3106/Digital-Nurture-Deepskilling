package Exercise7;
import java.util.*;

public class FinancialForecast {

    public static double futureValueRecursive(double principal, double rate, int years) {
        if (years == 0) return principal;
        return futureValueRecursive(principal, rate, years - 1) * (1 + rate);
    }

    private static Map<Integer, Double> memo = new HashMap<>();

    public static double futureValueMemo(double principal, double rate, int years) {
        if (years == 0) return principal;
        if (memo.containsKey(years)) return memo.get(years);

        double result = futureValueMemo(principal, rate, years - 1) * (1 + rate);
        memo.put(years, result);
        return result;
    }

    public static double futureValueIterative(double principal, double rate, int years) {
        double value = principal;
        for (int i = 0; i < years; i++) {
            value *= (1 + rate);
        }
        return value;
    }

    public static double futureValueVariableRates(double principal, double[] rates, int year) {
        if (year == 0) return principal;
        return futureValueVariableRates(principal, rates, year - 1) * (1 + rates[year - 1]);
    }

    public static void main(String[] args) {
        double principal = 10_000;
        double rate      = 0.08;
        int    years     = 5;

        System.out.printf("Principal : ₹%.2f%n", principal);
        System.out.printf("Rate      : %.0f%%%n", rate * 100);
        System.out.printf("Years     : %d%n%n", years);

        System.out.printf("Naive Recursive   : ₹%.2f%n", futureValueRecursive(principal, rate, years));
        System.out.printf("Memoized Recursive: ₹%.2f%n", futureValueMemo(principal, rate, years));
        System.out.printf("Iterative         : ₹%.2f%n", futureValueIterative(principal, rate, years));

        double[] rates = {0.06, 0.08, 0.10, 0.07, 0.09};
        System.out.printf("Variable Rates    : ₹%.2f%n", futureValueVariableRates(principal, rates, years));
    }
}