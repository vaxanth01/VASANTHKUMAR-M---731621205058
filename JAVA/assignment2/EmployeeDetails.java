package vasanthjava;


import java.util.*;
class Vasanth{
	
	int emp_id;
	String emp_name;
	int []salary = new int[5];
	int sum;
	int average;
	
	emp(int emp_id,String emp_name) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	
	void calculate(){
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 5 day salary:");
        sum = 0;
        for(int i=0;i<5;i++) {
        	salary[i] = sc.nextInt();
        	sum += salary[i];
        }
        
        System.out.println("Total salary : "+ salary);
    }
	
	void average() {
		 average = salary / 5;
	        System.out.println("Average marks: " + average);
	}
	}

public class EmployeeDetails {

	public static void main(String[] args) {
		

	}

}
