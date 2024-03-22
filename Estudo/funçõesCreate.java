package Estudo;

import java.util.Scanner;

public class funçõesCreate {

	public static void main(String[] args) {

		// Treino para criação das próprias funções

		// Aqui vamo descobrir o maior valor entre 3 números.

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);

		showValue(higher);

	}
	
	public static int max(int x, int y, int z) { // Criamos uma função personalizada para descobrir qual o maior valor.
		int aux;
		
		if(x > y && x > z) {
			aux = x;
		}else if(y > x && y > z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
	}
	
	public static void showValue(int value) { // Criamos uma função que não retorna nada, apenas imprime o valor na tela
		System.out.println("The highest value is = " + value);
	}

}
