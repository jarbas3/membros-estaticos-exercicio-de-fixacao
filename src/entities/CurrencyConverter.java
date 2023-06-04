package entities;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double dollarToReal(double dollarPrice, double dollarsToBeBought) {
		return dollarPrice * dollarsToBeBought * (1.0 + IOF);
	}	
}
