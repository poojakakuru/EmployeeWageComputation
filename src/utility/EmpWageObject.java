package utility;
/**@author Pooja Kakuru
 * Create Date   : 21st-october-2020
 * Functionality : This object class file contains constructor,
 *                 getter and setters for all companies in
 *                 EmpWage program
 */
interface IComputeEmpWage{
    public void addCompanyEmpWage(int workingDays, int maxHrsInMonth, int empRatePerHr, String company);
    public int computeEmpWage(EmpWageObject empWageObject);
}
public class EmpWageObject {
    public  int WorkingDays;
    public  int MaxHrsInMonth;
    public  int EmpRatePerHour;
    public  String company;
    public  int totalWage;

    public EmpWageObject(int workingDays, int maxHrsInMonth, int empRatePerHour, String company) {
        WorkingDays = workingDays;
        MaxHrsInMonth = maxHrsInMonth;
        EmpRatePerHour = empRatePerHour;
        this.company = company;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    @Override
    public String toString() {
        return "Total employee wage for company" +company + "is "+ totalWage;
    }

    /*public String toString() {
            return "EmpWageObject{" +
                    "WorkingDays=" + WorkingDays +
                    ", MaxHrsInMonth=" + MaxHrsInMonth +
                    ", EmpRatePerHour=" + EmpRatePerHour +
                    ", company='" + company + '\'' +
                    '}';
        }
    */
    //constructor
    public EmpWageObject() {}

    //getters and setters

    public int getTotalWage() {
        return totalWage;
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