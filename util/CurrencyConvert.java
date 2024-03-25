package util;

public class CurrencyConvert {
	
	public static final double IOF = 0.06;
	
	
	public static double priceDolar(double cotacao, double dolar) {
		double valor = cotacao * dolar;
		double valorTotal = valor * IOF;
		double real	= valor + valorTotal;
		
		return real;
		
	}
	
	
	


}
