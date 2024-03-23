package Estudo;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class programEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee e = new Employee();
	
		System.out.println("Employee Data- ");
		System.out.println("Name: ");
		e.name = sc.next();
		System.out.println("Gross Salary: ");
		e.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		e.tax = sc.nextDouble();
		
		System.out.println("");
		System.out.println("Employee: "+ e );
		
		System.out.println("Which percentage to increase salary? ");
		double increase = sc.nextDouble();
		e.IncreaseSalary(increase);
		
		System.out.println("Update Data: "+ e);

	}

}
