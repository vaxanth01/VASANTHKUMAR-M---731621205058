package assignment;
//import java.util.*;
//public class Person {
//
//	String name;
//	int age;
//	
//	Person(String name,int age){
//		this.name = name;
//		this.age = age;
//	}
//	
//	void displayPerson(){
//		System.out.println("NAME "+name+" Age "+age);
//	}
//	
//	
//	public static void main(String [] args) {
//		Person obj1 = new Person("vasanth",23);
//		Person obj2 = new Person("rahu",25);
//		obj1.displayPerson();
//		obj2.displayPerson();
//		
//	}
//
//}



import java.util.*;

class Person{
	
	int age;
	String name;
	
	Person(int age,String name){
		this.age = age;
		this.name = name;
	}
	
	void displaydata() {
		System.out.println("name "+name+" age "+age);
	} 
	
	public static void main(String [] args) {
		
		Person obj1 = new Person(22,"vasanthkumar");
		Person obj2 = new Person(21,"murugan");
		
		obj1.displaydata();
		obj2.displaydata();
	}
	
}

























