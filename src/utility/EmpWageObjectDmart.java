package utility;
/**@author Pooja Kakuru
 * Create Date   : 20th-october-2020
 * Functionality : This file contains constructor,
 *                 getter and setters for
 *                 company Demart
 */
public class EmpWageObjectDmart {
    private int WorkingDays;
    private int MaxHrsInMonth;
    private  int EmpRatePerHour;
    private String company;

    public EmpWageObjectDmart() {
    }

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