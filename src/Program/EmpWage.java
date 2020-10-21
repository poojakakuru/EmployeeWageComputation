package Program;
import utility.EmpWageObjectDmart;
import utility.EmpWageObjectReliance;
import utility.Utility;

/**@author Pooja Kakuru
 * Create Date   : 17th-october-2020
 * Modified Date : 20th-october-2020
 * Functionality : Calculating Employee Wage
 */

public class EmpWage {
    public static void main(String[] args) {
        //welcome message
        System.out.println("Welcome to Employee Wage Computation Program");
        //computing salary of employee for company Dmart and Reliance using objects and
        // encapsulation
        Utility util=new Utility();
        EmpWageObjectReliance empWageObjectReliance = new EmpWageObjectReliance();
        empWageObjectReliance.setCompany("Reliance");
        empWageObjectReliance.setWorkingDays(20);
        empWageObjectReliance.setMaxHrsInMonth(100);
        empWageObjectReliance.setEmpRatePerHour(20);
        EmpWageObjectDmart empWageObjectDmart = new EmpWageObjectDmart();
        empWageObjectDmart.setCompany("Dmart");
        empWageObjectDmart.setWorkingDays(30);
        empWageObjectDmart.setMaxHrsInMonth(200);
        empWageObjectDmart.setEmpRatePerHour(40);
        int salaryReliance=util.Condition( empWageObjectReliance.getWorkingDays(),
                empWageObjectReliance.getMaxHrsInMonth(),
                empWageObjectReliance.getEmpRatePerHour() );
        System.out.println("Total Salary of the employee of company " + empWageObjectReliance.getCompany() +
                " is " +salaryReliance);
        int salaryDmart=util.Condition( empWageObjectDmart.getWorkingDays(), empWageObjectDmart.getMaxHrsInMonth(),
                empWageObjectDmart.getEmpRatePerHour() );
        System.out.println("Total Salary of the employee of company " + empWageObjectDmart.getCompany() +
                " is " +salaryDmart);

    }
}

