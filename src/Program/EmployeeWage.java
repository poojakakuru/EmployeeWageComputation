package Program;

import utility.Utility;

/**@author pooja kakuru
 * Create Date   : 17th-october-2020
 * Functionality : Calculating Employee Wage
 */

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage Computation program");
        Utility utility=new Utility();
        double attendance = utility.EmpAttendance();
        if (attendance == 1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

    }
}
