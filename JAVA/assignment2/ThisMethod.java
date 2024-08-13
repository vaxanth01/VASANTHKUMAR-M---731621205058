package vasanthjava;
public class ThisMethod {
	String name;
	ThisMethod(String name){
		this(10,80);
		this.name = name;
		this.greeting();
	}
	ThisMethod(int a , int b){
		System.out.println("Addition : "+(a+b));
	}
	void greeting() {
		System.out.println("Welcome "+name);
	}
	public static void main(String [] args) {
		ThisMethod obj = new ThisMethod("vasanth");
	}
}