package Estudo;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConvert;

public class buyDolar {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double cotacao = sc.nextDouble();
		
		
		System.out.println("How many dollars will be bought? ");
		double dolars = sc.nextDouble();
		
		
		double real = CurrencyConvert.priceDolar(cotacao,dolars);
		
		System.out.printf("Amount  to be paid in reais = %.2f%n", real);
		
		
		
		
		
		
		
		
		
				
				
	 
	}

}
