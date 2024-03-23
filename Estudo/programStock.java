package Estudo;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class programStock {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product(); // intânciando um objeto, esse objeto que será responsável pela comunicação dos arquivos.
											

		System.out.println("Enter Product Data");
		System.out.println("Product Name: ");
		product.name = sc.nextLine(); // por conta do objeto criado podemos armazenar valores, chamando o objeto e atributo dentro da outra classe.
		System.out.println("Product Price: ");
		product.price = sc.nextDouble();
		System.out.println("Product quantity: ");
		product.quantity = sc.nextInt();

		System.out.println("");
		System.out.println("Product Data: " + product);
		
		System.out.println("");
		System.out.print("Enter the number of products to be added in stock:" );
		int quantity = sc.nextInt(); // Criou uma variável para receber o valor
		product.addProducts(quantity); // Chamou o método que adiciona no estoque, usando como parâmetro o valor passado na variável anterior.
		
		System.out.println("");
		System.out.println("Update Data: " + product);
		
		System.out.println("");
		System.out.print("Enter the number of products to be removed in stock:" );
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("");
		System.out.println("Update Data: " + product);
		
		
	}

}
