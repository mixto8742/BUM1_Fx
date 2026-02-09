package eus.ehu.bum1_fx.Business_logic;

    public interface ExchangeCalculator {
        String[] getCurrencyLongNames();
        
        double getChangeValue(String origCurrency, double origAmount, String endCurrency) throws Exception
        ;
        
        double calculateCommission(double origAmount, String currency) throws Exception; 
        
    }