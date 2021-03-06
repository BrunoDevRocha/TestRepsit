package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Enter the employee's Name: ");
		employee.name = sc.nextLine();
		System.out.print("Enter the employee's Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Enter the employee's Tax: ");
		employee.tax = sc.nextDouble();
		System.out.println(employee);
		System.out.println("");
		
		System.out.print("Wwhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Updated data: " + employee);
		
		sc.close();
	}

}
