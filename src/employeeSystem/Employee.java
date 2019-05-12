package employeeSystem;

public class Employee {
	private int employeeId;
	private String employeeName;
	private float salary;
	
	public int getId() {
		return this.employeeId;
		
	}
	public String getName() {
		return this.employeeName;
	}
	public float getSalary() {
		return this.salary;
	}
	
	public void setId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee(String name, int id, float salary) {
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
		System.out.println("You added the employee with Id: " +  this.employeeId + ", Name: " +this.employeeName+ " and Salary: "+this.salary);
	}

}
