package Exercise14;

import java.util.ArrayList;
import java.time.LocalDate;

public class PayrollSystemTest {
    public static void main(String[] args) {
        
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", new Date(1, 1, 2000), 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", new Date(2, 2, 2000), 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", new Date(9, 3, 2000), 10000, .06);
        BasePlusCommisionEmployee basePlusCommisionEmployee = new BasePlusCommisionEmployee("Bob", "Lewis", "444-44-4444", new Date(4, 4, 2000), 5000, .04, 300);   
        PieceWorker pieceWorker = new PieceWorker("Bob", "Lewis", "444-44-4444", new Date(4, 4, 2000), 2.5, 200);
        
        ArrayList<Employee> employees = new ArrayList<>();
        
        employees.add(salariedEmployee);
        employees.add(hourlyEmployee);
        employees.add(commissionEmployee);
        employees.add(basePlusCommisionEmployee);
        employees.add(pieceWorker);
        
        System.out.printf("Employees processed polymorphically:%n%n");
        
        for (Employee currentEmployee : employees) {
            if (currentEmployee instanceof BasePlusCommisionEmployee) {
                BasePlusCommisionEmployee employee = (BasePlusCommisionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
            }
        }

        // Printing employees
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }
    }
}
