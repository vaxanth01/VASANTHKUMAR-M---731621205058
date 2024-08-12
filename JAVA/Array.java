import java.util.Scanner;
public class Array
{
    public static void main(String[] args) 
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}