import java.util.*;
public class LeftTrianglePattern{
    public static void main(String[] args) {
        int i,j,number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        number = sc.nextInt();

        for(i=0;i<number;i++){
            for(j=2*(number-i);j>=0;j--){
                System.out.print(" ");  
            }
            for (j=0; j<=i; j++ )   
{   
//prints star      
System.out.print("* ");   
}  
System.out.println(); 
        }


    }   
}
