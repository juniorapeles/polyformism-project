package application;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Locale localeUS = new Locale("en","US");
		
		NumberFormat money = NumberFormat.getCurrencyInstance(localeUS);
		
		Scanner sc = new Scanner(System.in);		
		
		ArrayList<Employee> employees = new ArrayList(); 

		System.out.print("Enter the number of employees: ");
		int numberLoops = sc.nextInt();
		
		for(int i = 0; i < numberLoops ; i++) {
			
			System.out.println("Employee #"+ (i+1) + " data:");
			
			System.out.print("Outsourced (y/n)? ");
			String outsorced = sc.next();
			
			System.out.print("Name: ");
			String name = sc.next();
			sc.nextLine();
			
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if(outsorced.equals("y")) {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				Employee employee = new OutsourcedEmployee(name, hours,valuePerHour,additionalCharge);
				employees.add(employee);
			}else {
				Employee employee = new Employee(name, hours, valuePerHour);
				employees.add(employee);
			}

		}
		
		System.out.println("PAYMENTS:");
		for(Employee emp : employees) {
			System.out.println(emp.getName() +" - $ "+ money.format(emp.payment()));
		}
		
		sc.close();
	}
}
