package utility;
import java.util.Random;
/** @author Pooja Kakuru
 * Create Date   : 17th-october-2020
 * Functionality : This is utility file which contains logic
 *                 of all codes of EmpWageComputationJava
 *                 project
 */
public class Utility {
    int Is_present = 1;
    int EmpRatePerHr = 20;

    /**
     * Functionality     : This function is used to generate
     * random numbers
     *
     * @return empCheck - Returns generated random number
     */

    public double GenerateRandom() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        return empCheck;
    }

    /**
     * Functionality : This function contains logic for checking
     *                 whether the employee is present or absent
     *
     * @return      - Return 1 if employee is present else returns 0
     */

    public int EmpAttendance() {
        double attendance = GenerateRandom();
        if (attendance == Is_present)
            return 1;
        else
            return 0;
    }

    /**
     * Functionality   : This function is used to calculate
     *                   salary for full time work of
     *                   employee for 8 hours
     *
     * @return salary  - Returns the value after computing the
     *                   salary
     */

    public int DailyWage() {
        int empHrs = 8;
        int salary;
        double attend = GenerateRandom();
        if (attend == Is_present)
            return salary = EmpRatePerHr * empHrs;
        else
            return 0;
    }

    /**
     * Functionality   : This function is used to calculate
     *                   salary for part time work of
     *                   employee for 4 hours
     * @return salary  - Returns the value after computing the
     *                   salary
     */

    public int DailyWagePartTime() {
        int empHrs = 4;
        int salary;
        double attend = GenerateRandom();
        if (attend == Is_present)
            return salary = EmpRatePerHr * empHrs;
        else
            return 0;
    }

    /**
     * Functionality         : This function is used to calculate
     *                         salary of Full-time and Part-time
     *                         work of employees using switch case
     * @param TypeofEmployee - Input parameter from the user
     *                         regarding full-time or
     *                         part-time employee
     * @return salary        - Returns the value after computing the
     *                         salary
     */
    public int SwitchCaseComputation(int TypeofEmployee) {
        int empHrs, salary;
        switch (TypeofEmployee) {
            case 1:
                empHrs = 8;
                salary = EmpRatePerHr * empHrs;
                return salary;
            case 2:
                empHrs = 4;
                salary = EmpRatePerHr * empHrs;
                return salary;
            default:
                return 0;

        }
    }

    /**
     * Functionality         : This function is used to calculate
     *                         salary of Full-time and Part-time
     *                         work of employees for a month
     * @param TypeofEmployee - Input parameter from the user
     *                         regarding full-time or
     *                         part-time employee
     * @return salary        - Returns the value after computing the
     *                         salary
     */
    public int WageForMonth(int TypeofEmployee) {
        int WorkingDays = 20, salary, TotalSalary = 0;
        for (int day = 1; day <= WorkingDays; day++) {
            salary = SwitchCaseComputation(TypeofEmployee);
            TotalSalary = TotalSalary + salary;
        }
        return TotalSalary;
    }

    /**
     * Functionality         : This function is used to calculate
     *                         salary of employee till working
     *                         hours reached 100 or working days
     *                         reached 20
     * @return TotalSalary   - Returns the value after computing the
     *                         salary
     */
    public int Condition() {
        int TotalEmpHr = 0, TotalWorkingDays = 0, MaxHrsInMonth = 100, WorkingDays = 20;
        int EmpHrs, TotalSalary = 0,FullTime=1, PartTime=0;
        double empCheck;
        while (TotalEmpHr < MaxHrsInMonth && TotalWorkingDays < WorkingDays) {
            TotalWorkingDays++;
            empCheck = GenerateRandom();
            if (empCheck == FullTime) {
                EmpHrs = 8;
                TotalEmpHr = TotalEmpHr + EmpHrs;
            } else if (empCheck == PartTime) {
                EmpHrs = 4;
                TotalEmpHr = TotalEmpHr + EmpHrs;
            }
        }
        TotalSalary = TotalEmpHr + EmpRatePerHr;
        return TotalSalary;
    }
}

