package utility;

/** @author Pooja Kakuru
 * Create Date   : 17th-october-2020
 * Functionality : This is utility file which contains logic
 *                 of all codes of EmpWageComputationJava
 *                 project
 */
public class Utility {
    int Is_present = 1;

    /**
     * Functionality     : This function is used to generate
     *                     random numbers
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
     * @return       - Return 1 if employee is present else returns 0
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
        int empRatePerHr = 20;
        int empHrs = 8;
        int salary;
        double attend = GenerateRandom();
        if (attend == Is_present)
            return salary = empRatePerHr * empHrs;
        else
            return 0;
    }

    /**
     * Functionality   : This function is used to calculate
     *                   salary for part time work of
     *                   employee for 4 hours
     *
     * @return salary  - Returns the value after computing the
     *                   salary
     */

    public int DailyWagePartTime() {
        int empRatePerHr = 20;
        int empHrs = 4;
        int salary;
        double attend = GenerateRandom();
        if (attend == Is_present)
            return salary = empRatePerHr * empHrs;
        else
            return 0;
    }
    /**
     * Functionality   : This function is used to calculate
     *                   salary of Full-time and Part-time
     *                   work of employees using switch case
     * @return salary  - Returns the value after computing the
     *                   salary
     */
    public int SwitchCaseComputation(int TypeofEmployee) {
        int empRateperHr = 20;
        int empHrs;
        int salary;
        switch (TypeofEmployee) {
            case 1:
                empHrs = 8;
                salary = empRateperHr * empHrs;
                return salary;
            case 2:
                empHrs = 4;
                salary = empRateperHr * empHrs;
                return salary;
            default:
                return 0;

        }
    }
}

