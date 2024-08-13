package vasanthjava;
// constructor overloading 
public class polymor2 {
	
	polymor2(String name){
		System.out.println("Welcome "+name);
	}
	polymor2(int a,int b){
		this("vasanth");
		System.out.println("Welcome "+(a+b));
	}
	polymor2(int n){
		this(10,50);
		System.out.println("Welcome "+(n+n));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		polymor2 obj1 = new polymor2("vasanth");
//		polymor2 obj2 = new polymor2(10,30);
		polymor2 obj3 = new polymor2(5);

//		polymor2 boj1 = new polymor2(5);
	}
}