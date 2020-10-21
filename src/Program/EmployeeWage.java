package Program;
import utility.Utility;

/**@author Pooja Kakuru
 * Create Date   : 17th-october-2020
 * Modified Date : 20th-october-2020
 * Functionality : Calculating Employee Wage
 */

public class EmployeeWage {
    public static void main(String[] args) {
        //welcome message
        System.out.println("Welcome to Employee Wage Computation Program");
        //computing salary of employee for either 100 hours or 20 days using
        //   class methods and class variables
        Utility util=new Utility();
        int salary=util.Condition();
        System.out.println("Total Salary of the employee is " +salary);

    }
}

