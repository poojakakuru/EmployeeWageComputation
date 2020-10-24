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
        //computing salary of employee for company Dmart and Reliance using Interface

        Utility util=new Utility();
        util.addCompanyEmpWage(20,10,2,"Dmart");
        util.addCompanyEmpWage(10,20,4,"Reliance");
        util.computeEmpWage();
    }
}
