package vasanthjava;
//method overloading

public class Polymor {
	void myMethod(String name) {
		System.out.println("Welcome"+name);
	}
	void myMethod(int a,int b) {
		System.out.println("Welcome"+(a+b));	
	}
	void myMethod(int n) {
		System.out.println("Welcome"+(n+n));
	}
	public static void main(String[] args) {
		Polymor obj = new Polymor();
		obj.myMethod(5);
		obj.myMethod("VASANTH");
		obj.myMethod(10,30);
	}
}