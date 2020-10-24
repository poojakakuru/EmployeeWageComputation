package Program;
import utility.EmpWageObject;
import utility.EmpWageObjectDmart;
import utility.EmpWageObjectReliance;
import utility.Utility;
import java.util.ArrayList;

/**@author Pooja Kakuru
 * Create Date   : 17th-october-2020
 * Modified Date : 21st-october-2020
 * Functionality : Calculating Employee Wage
 */

public class EmpWage {
    public static void main(String[] args) {
        //welcome message
        System.out.println("Welcome to Employee Wage Computation Program");
        //computing salary of employee for company Dmart and Reliance using ArrayList

        Utility util=new Utility();
        EmpWageObject empWageObject1=new EmpWageObject(20,100,20,
                "Dmart");
        EmpWageObject empWageObject2=new EmpWageObject(10,50,12,
                "Reliance");

        ArrayList<EmpWageObject> list = new ArrayList<EmpWageObject>();
        list.add(empWageObject1);
        list.add(empWageObject2);

        for (EmpWageObject emp : list)

            System.out.println(emp);
    }
}
