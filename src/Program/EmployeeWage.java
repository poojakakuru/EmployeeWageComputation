package Program;
import utility.Utility;
import java.util.Scanner;

/**@author Pooja kakuru
 * Create Date   : 17th-october-2020
 * Functionality : Calculating Employee Wage
 */

public class EmployeeWage {
    public static void main(String[] args) {
        //welcome message
        System.out.println("Welcome to Employee Wage Computation Program");
        //computing salary of employee for a month
        System.out.println(" To know the salary of employee for a month , select any option below: ");
        System.out.println("1. Full-time employee\n2. Part-time employee");
        Scanner scanner=new Scanner(System.in);
        int TypeofEmployee = scanner.nextInt();
        Utility util=new Utility();
        int salary=util.WageForMonth(TypeofEmployee);
        System.out.println("Total Salary of the employee for a month is " +salary);

    }
}