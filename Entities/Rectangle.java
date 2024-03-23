package Entities;

import java.util.Locale;
import java.util.Scanner;

import Estudo.rectangleArea;

public class Rectangle {

	public static void main(String[] args) {
		
		
		rectangleArea rec = new rectangleArea();


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width adn height: ");
		rec.height = sc.nextDouble();
		rec.width = sc.nextDouble();
		
		
		System.out.println("");
		System.out.printf("Area: %.2f", rec.area());
		System.out.println("");
		System.out.printf("Perimeter: %.2f", rec.perimeter());
		System.out.println("");
		System.out.printf("Diagonal: %.2f", rec.diagonal());
				

	}

}
