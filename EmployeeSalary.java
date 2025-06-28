import java.util.*;
public class EmployeeSalary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter basic salary of employee:");
        double salary=sc.nextDouble();
        double hra=0.20*salary;
        double da=0.50*salary;
        double grossSalary = salary+hra+da;
        double taxDeduction=0.10*grossSalary;
        double netSalary=grossSalary-taxDeduction;

        System.out.println("Gross Salary ="+grossSalary);
        System.out.println("Tax Deduction="+taxDeduction);
        System.out.println("Net Salary ="+netSalary);
        sc.close();
        
    }
}