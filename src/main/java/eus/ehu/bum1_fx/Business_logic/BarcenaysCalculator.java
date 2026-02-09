package eus.ehu.bum1_fx.Business_logic;

public class BarcenaysCalculator implements ExchangeCalculator {


    @Override
    public String[] getCurrencyLongNames() {
        return Currency.longNames();
    }

    @Override
    public double getChangeValue(String origCurrency, double origAmount, String endCurrency) throws Exception {
            ForexOperator operator = new ForexOperator(origCurrency, origAmount, endCurrency);
            return operator.getChangeValue();
    }

    @Override
    public double calculateCommission(double origAmount, String currency) throws Exception {
        CommissionCalculator calculator = new CommissionCalculator(origAmount, currency);
        return calculator.calculateCommission( );
    }   

    
}