package Estudo;

import java.util.Locale;
import java.util.Scanner;

import Entities.Student;

public class programStudant {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Name: ");
		student.name = sc.nextLine();
		System.out.println("Grade 1: ");
		student.grade1 = sc.nextDouble();
		System.out.println("Grade 2: ");
		student.grade2 = sc.nextDouble();
		System.out.println("Grade 3: ");
		student.grade3 = sc.nextDouble();
		
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		
	}
}