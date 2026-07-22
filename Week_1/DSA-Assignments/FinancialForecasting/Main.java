package FinancialForecasting;

public class Main {
    public static void main(String[] args) {
        FinancialForecast financialForecast = new FinancialForecast();

        double initialInvestment = 10000.0;
        double annualGrowthRate = 0.08;
        int years = 5;

        double futureValue = financialForecast.calculateFutureValue(initialInvestment, annualGrowthRate, years);

        System.out.println("Initial Investment: " + initialInvestment);
        System.out.println("Annual Growth Rate: " + (annualGrowthRate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.printf("Forecasted Future Value: %.2f%n", futureValue);
    }
}
