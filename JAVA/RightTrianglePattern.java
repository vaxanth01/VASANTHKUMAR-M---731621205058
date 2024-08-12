import java.util.*;
public class RightTrianglePattern   
{   
    public static void main(String[] args) {
        int i,j,number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        number = sc.nextInt();

        for(i=0;i<number;i++){
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }   
}  