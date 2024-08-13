package vasanthjava;

class Employee{
	int employeeId;
	String employeeName;
	float employeeSalary;
	
//	constructor
	Employee(int employeeId ,String employeeName, float employeeSalary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
//	method
	void display() {
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Salary : "+employeeSalary);
		System.out.println();
		
	}
}
public class Main {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"vasanth",2000.0f);
		emp1.display();
		
		Employee emp2 = new Employee(102,"kumar",1000.0f);
		emp2.display();
		
	}
}
