package Program;
import utility.EmpWageObject;
import utility.EmpWageObjectDmart;
import utility.EmpWageObjectReliance;
import utility.Utility;

/**@author Pooja Kakuru
 * Create Date   : 17th-october-2020
 * Modified Date : 21st-october-2020
 * Functionality : Calculating Employee Wage
 */

public class EmpWage {
    public static void main(String[] args) {
        //welcome message
        System.out.println("Welcome to Employee Wage Computation Program");
        //computing salary of employee for company Dmart and Reliance using single object
        //    instead of multiple objects for every company
        Utility util=new Utility();
        EmpWageObject empWageObject=new EmpWageObject();
        empWageObject.setCompany("dmart");
        empWageObject.setWorkingDays(30);
        empWageObject.setMaxHrsInMonth(200);
        empWageObject.setEmpRatePerHour(40);
        int salaryDmart=util.Condition( empWageObject.getWorkingDays(),
                empWageObject.getMaxHrsInMonth(),
                empWageObject.getEmpRatePerHour() );
        System.out.println("Total Salary of the employee of company " + empWageObject.getCompany() +
                " is " +salaryDmart);
        empWageObject.setCompany("Reliance");
        empWageObject.setWorkingDays(20);
        empWageObject.setMaxHrsInMonth(100);
        empWageObject.setEmpRatePerHour(20);
        int salaryReliance=util.Condition( empWageObject.getWorkingDays(),
                empWageObject.getMaxHrsInMonth(),
                empWageObject.getEmpRatePerHour() );
        System.out.println("Total Salary of the employee of company " + empWageObject.getCompany() +
                " is " +salaryReliance);

    }
}

