package Program;
import utility.Utility;
/**@author Pooja Kakuru
 * Create Date   : 17th-october-2020
 * Functionality : Calculating Employee Wage
 */

public class EmployeeWage {
    public static void main(String[] args) {
        //welcome message
        System.out.println("Welcome to Employee Wage Computation Program");
        Utility util=new Utility();
        //checking if employee is present or absent
        double attendance = util.EmpAttendance();
        if (attendance == 1)
            System.out.println("Employee is Present");
        else {
            System.out.println("Employee is Absent");
        }
        //calculating daily wage for 8 hours full-time
        int salary = util.DailyWage();
        if (salary != 0)
            System.out.println("salary for 8 hrs work daily is " + salary);
        else
            System.out.println("employee is absent ,hence salary is " +salary);
        //calculating daily wage for 4 hours part-time
        int salaryPartTime = util.DailyWagePartTime();
        if (salaryPartTime != 0)
            System.out.println("salary for 4 hrs part-time work is " + salaryPartTime);
        else
            System.out.println("employee is absent ,hence salary is " +salaryPartTime);
    }
}