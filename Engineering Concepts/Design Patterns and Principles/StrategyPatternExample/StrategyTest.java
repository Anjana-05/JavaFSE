package StrategyPatternExample;

public class StrategyTest {

    public static void main(String[] args) {

        PaymentContext context =
                new PaymentContext(new PayPalPayment());

        context.executePayment(2500);
    }
}
