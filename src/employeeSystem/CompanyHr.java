package employeeSystem;

import java.util.Scanner;
import java.util.ArrayList;

public class CompanyHr {
	static ArrayList<Employee> employees = new ArrayList<Employee>(1);

	public static void main(String[] args) {
		while (true) {
			System.out.println("What do you want to do ?");
			System.out.println("1 - Add Employee");
			System.out.println("2 - Remove Employee");
			System.out.println("3 - Get Salary of  Employee");
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				addEmployee();
				break;
			case 2:
				removeEmployee();
				break;
			case 3:
				getSalary();
				break;
			default:
				System.out.println("This is invalid option, Please try again.");
			}
		}
	}

	public static void addEmployee() {
		System.out.println("You are adding an employee, please enter the Id of the employee");
		Scanner input = new Scanner(System.in);
		
		int id = input.nextInt();
		for (Employee emp : employees) {
			
			if (emp.getId() == id) {
				System.out.println("This id already exists");
				return;
			}
		}
		;
		System.out.println("Please enter the name of the employee");
		String name = input.next();
		
		System.out.println("Please enter the salary of the employee");
		float salary = 0;
		if(input.hasNextFloat()) {
			salary = input.nextFloat();
			employees.add(new Employee(name, id, salary));
		} else {
			System.out.println("Please enter a float value");
		}
		
	}

	public static void removeEmployee() {
		if (employees.size() == 0) {
			System.out.println("Please add at least one employee before you can use remove method");
			return;
		}
		System.out.println("You are removing an employee, please enter the id of the employee");
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		int count = 0;
		int toBeRemoved = -1;
		for (Employee emp : employees) {
			
			if (emp.getId() == id) {
				toBeRemoved = count;
				break;
			}
			count++;
		}
		;
		if (toBeRemoved == -1) {
			System.out.println("Could not find this id");
			return;
		}
		employees.remove(toBeRemoved);
		System.out.println("You have successfully removed this employee");
	}
	
	public static void getSalary() {
		if (employees.size() == 0) {
			System.out.println("Please add at least one employee before you can get a salary");
			return;
		}
		System.out.println("You are checking an employee's salary, please enter the id of the employee");
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		int count = 0;
		int toBeReturned = -1;
		for (Employee emp : employees) {

			if (emp.getId() == id) {
				toBeReturned = count;
				System.out.println("Salary is: " + String.format("%.2f",emp.getSalary()));
				break;
			}
			count++;
		}
		;
		if (toBeReturned == -1) {
			System.out.println("Could not find this id");
			return;
		}
	}
}
