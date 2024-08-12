import java.util.Scanner;
public class MyClass {
    public static void main (String [] args){
        int empid;
        String empname;
        Float empsalary;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Id");
        empid = sc.nextInt();
        System.out.println("Enter name");
        empname = sc.next();
        System.out.println("Enter salary");
        empsalary = sc.nextFloat();

        System.out.println("Employee id : "+empid);
        System.out.println("Employee name : "+empname);
        System.out.println("Employee salary : "+empsalary);

    }
}
