package Program;
import utility.EmpWageObject;
import utility.EmpWageObjectDmart;
import utility.EmpWageObjectReliance;
import utility.Utility;
import java.util.ArrayList;

/**@author Pooja Kakuru
 * Create Date   : 17th-october-2020
 * Modified Date : 21st-october-2020
 * Functionality : Calculating Employee Wage
 */

public class EmpWage {
    public static void main(String[] args) {
        //welcome message
        System.out.println("Welcome to Employee Wage Computation Program");
        //computing salary of employee using class methods nd functions

        Utility util=new Utility();
        int salary = util.Condition(20,20,100);
        System.out.println("total salary of employee is"+salary);
    }
}