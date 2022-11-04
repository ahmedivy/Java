package Exercise15;

import Exercise12.Date;

public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[6];
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", new Date(1, 1, 1970), 800.00);
        payableObjects[3] = new SalariedEmployee("Lisa", "Barnes", "888-88-8888", new Date(1, 1, 1970), 1200.00);
        payableObjects[4] = new HourlyEmployee("Karen", "Price", "222-22-2222", new Date(1, 1, 1970), 16.75, 40);
        payableObjects[5] = new HourlyEmployee("Sue", "Jones", "333-33-3333", new Date(1, 1, 1970), 15.00, 40);

        System.out.println("Invoices and Employees processed polymorphically:");
        for (Payable currentPayable : payableObjects) {
            System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), "payment due", currentPayable.getPaymentAmount());
        }
    }
}
