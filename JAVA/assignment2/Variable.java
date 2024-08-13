//Types of variables

package vasanthjava;

public class Variable {
	int b = 20; //instances variables or object variables
	static int c=30;
	public static void main(String[] args) {
		
		int a =10; //local variable
		System.out.println("Local Variable : "+a);
		
		
		Variable obj = new Variable();
		System.out.println("instances or variables : "+ obj.b);
		System.out.println("Static or class Variable : "+ Variable.c);
	}
}