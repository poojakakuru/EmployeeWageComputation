package utility;
/** @author Pooja kakuru
 * Create Date : 17th-october-2020
 * Functionality :This is utility file which contains logic
 *                of all codes of EmpWageComputationJava
 *                project
 */
public class Utility {
    /**
     *Functionality : This function contains logic for checking
     *                whether the employee is present or absent
     *
     */

    public int EmpAttendance() {
        int Is_present = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == Is_present)
            return 1;
        else
            return 0;
    }
}
