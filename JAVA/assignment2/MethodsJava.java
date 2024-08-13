package vasanthjava;

public class MethodsJava {
	
	
	void myMethod1() {
		System.out.println("INSTANCE METHOD");
		System.out.println();
	}
	static void myMethod2() {
		System.out.println("STATIC METHOD");
	}
	
	public static void main(String [] args) {
		MethodsJava	obj = new MethodsJava();
		obj.myMethod1();
		
		MethodsJava.myMethod2();
	}

}
