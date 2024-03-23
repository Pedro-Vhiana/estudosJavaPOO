package Entities;

public class Triangle {
	
	// Atributos da Classe
	public double a; // Public indica que pode ser usado em outros arquivos.
	public double b;
	public double c;

	
	
			// double = tipo de dado que o método retorna 
	public double area() { // Método... // Lista de Parametros do método: dentro dos parenteses 
		double p = (a + b + c)/ 2; // Corpo do método, o que ele faz
		return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // O que ele retorna
	}
}
