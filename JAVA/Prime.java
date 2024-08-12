import java.util.Scanner;
public class Prime{    
    public static void main(String args[]){ 

     int i,m=0,f=0,n;      
    //  int n=3;  
    System.out.println("Enter and check number is prime or not : ");

    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
     m=n/2;           
     if(n==0||n==1){  
      System.out.println(n+" is not prime number");      
     }
     else{  
      for(i=2;i<=m;i++){      
       if(n%i==0){      
        System.out.println(n+" is not prime number");      
        f=1;      
        break;      
       }      
      }      
      if(f==0)  
      { System.out.println(n+" is prime number"); }  
     }
   }
   }