
package utility;
/**@author Pooja Kakuru
 * Create Date   : 21st-october-2020
 * Functionality : This object class file contains constructor,
 *                 getter and setters for all companies in
 *                 EmpWage program
 */
public class EmpWageObject {
    private int WorkingDays;
    private int MaxHrsInMonth;
    private  int EmpRatePerHour;
    private String company;

    public EmpWageObject(int workingDays, int maxHrsInMonth, int empRatePerHour, String company) {
        WorkingDays = workingDays;
        MaxHrsInMonth = maxHrsInMonth;
        EmpRatePerHour = empRatePerHour;
        this.company = company;
    }

    public String toString() {
        return "EmpWageObject{" +
                "WorkingDays=" + WorkingDays +
                ", MaxHrsInMonth=" + MaxHrsInMonth +
                ", EmpRatePerHour=" + EmpRatePerHour +
                ", company='" + company + '\'' +
                '}';
    }

    //constructor
    public EmpWageObject() {}

    //getters and setters
    public int getWorkingDays() {
        return WorkingDays;
    }

    public void setWorkingDays(int workingDays) {
        WorkingDays = workingDays;
    }

    public int getMaxHrsInMonth() {
        return MaxHrsInMonth;
    }

    public void setMaxHrsInMonth(int maxHrsInMonth) {
        MaxHrsInMonth = maxHrsInMonth;
    }

    public int getEmpRatePerHour() {
        return EmpRatePerHour;
    }

    public void setEmpRatePerHour(int empRatePerHour) {
        EmpRatePerHour = empRatePerHour;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}