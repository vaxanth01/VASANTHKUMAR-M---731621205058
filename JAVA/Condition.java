// class Condition{
//     public static void main(String[] args){
//       //Scanner sc=new Scanner9System.in);
//       int a=10;
//       int b=20;
//       if(a>b){
//          System.out.println("A is greater");
//       }
//       else{
//          System.out.println("B is greater");
//       }
//     }
//    }
import java.util.Scanner;
class Condition{
    public static void main(String [] args){
       int age;
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter age : ");
       age = sc.nextInt();

       if(age >= 18){
        System.out.println("Eligible for vote");
       }
       else{
        System.out.println("Not Eligible");
       }
        }
}