package utility;

/** @author Pooja Kakuru
 * Create Date   : 17th-october-2020
 * Modified Date : 20th-october-2020
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

    public static double GenerateRandom() {
        double empCheck = Math.floor(Math.random() * 10) % 3;
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
     *                         salary of employee using objects and
     *                         encapsulation
     * @param WorkingDays    - Input taken from object for number of
     *                         working days in particular company
     * @param MaxHrsInMonth  - Input taken from object for maximum
     *                         number of working hours in particular
     *                         company
     * @param EmpRatePerHour - Input taken from object for Employee
     *                         wage per hour according to particular
     *                         company
     * @return TotalSalary   - Returns the value after computing the
     *                         salary
     */
    public static final int PartTime=1;
    public static final int FullTime=2;

    public static int Condition(int WorkingDays, int MaxHrsInMonth, int EmpRatePerHour) {
        int TotalEmpHr =0 , TotalWorkingDays = 0;
        int EmpHrs;
        while (TotalEmpHr < MaxHrsInMonth && TotalWorkingDays < WorkingDays) {
            TotalWorkingDays++;
            int empCheck = (int ) GenerateRandom();
            switch (empCheck){
                case PartTime:
                    EmpHrs = 4;
                    break;
                case FullTime:
                    EmpHrs = 8;
                    break;
                default:
                    EmpHrs = 0;
            }
            TotalEmpHr = TotalEmpHr + EmpHrs;
            System.out.println("day#:" +TotalWorkingDays + " emp hrs:" +EmpHrs);
        }
        int TotalSalary = TotalEmpHr * EmpRatePerHour;
        return TotalSalary;
    }
}