package Entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	
	public 	double netSalary() {
		return grossSalary - tax;
		
	}
	
	public void IncreaseSalary(double increase) {
		grossSalary += grossSalary * increase / 100; // Aqui a lógica é pura matemática...
		
	}
	
	public String toString() { // Usando toString pois toda class pertence a classe Object que possue o toString como atributo.
		return name
				+ ", $ "
				+ String.format("%.2f", this.netSalary()); 
	}
	

}
