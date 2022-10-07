import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Employee hod = new Employee("Dr. A", "HOD");
        Employee labIncharge = new Employee("Dr. B", "Lab Incharge");

        // Create a Department
        Department department = new Department("Computer Science", hod, labIncharge);

        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Add a Lab");
            System.out.println("2. Remove a Lab");
            System.out.println("3. Print Labs");
            System.out.println("4. Add PC to a Lab");
            System.out.println("5. Remove PC from a Lab");
            System.out.println("6. Print PCs of a Lab");
            System.out.println("7. Print all PCs of a Department");
            System.out.println("8. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Lab Name: ");
                    String labName = sc.nextLine();
                    System.out.println("Enter Lab Attendant Name: ");
                    String labAttendantName = sc.nextLine();
                    department.addLab(new Lab(labName, new Employee(labAttendantName, "Lab Attendant")));
                    System.out.println("Lab added successfully!\n");
                    break;
                case 2:
                    System.out.println("Enter Lab Name: ");
                    String name = sc.nextLine();
                    int index = department.searchLab(name);
                    if (index != -1) {
                        department.removeLab(department.getLabs()[index]);
                        System.out.println("Lab removed successfully!\n");
                    } else {
                        System.out.println("Lab not found!\n");
                    }
                    break;
                case 3:
                    department.printLabs();
                    break;
                case 4:
                    System.out.println("Enter Lab Name: ");
                    String labName1 = sc.nextLine();
                    int index1 = department.searchLab(labName1);
                    if (index1 != -1) {
                        System.out.println("Enter PC Name: ");
                        String pcName = sc.nextLine();
                        System.out.println("Enter Monitor Name: ");
                        String monitorName = sc.nextLine();
                        System.out.println("Enter RAM Size: ");
                        int ramSize = sc.nextInt();
                        System.out.println("Enter Hard Disk Size: ");
                        int hardDiskSize = sc.nextInt();
                        System.out.println("Is PC has a graphic card? (true/false): ");
                        boolean hasGraphicCard = sc.nextBoolean();
                        department.getLabs()[index1].addPC(new PC(pcName, monitorName, ramSize, hardDiskSize, hasGraphicCard));
                        System.out.println("PC added successfully!\n");
                    } else {
                        System.out.println("Lab not found!\n");
                    }
                    break;
                case 5:
                    System.out.println("Enter Lab Name: ");
                    String labName2 = sc.nextLine();
                    int index2 = department.searchLab(labName2);
                    if (index2 != -1) {
                        System.out.println("Enter PC Name: ");
                        String pcName = sc.nextLine();
                        int index3 = department.getLabs()[index2].searchPC(pcName);
                        if (index3 != -1) {
                            department.getLabs()[index2].removePC(department.getLabs()[index2].getComputers()[index3]);
                            System.out.println("PC removed successfully!\n");
                        } else {
                            System.out.println("PC not found!\n");
                        }
                    } else {
                        System.out.println("Lab not found!\n");
                    }
                    break;
                case 6:
                    System.out.println("Enter Lab Name: ");
                    String labName3 = sc.nextLine();
                    int index4 = department.searchLab(labName3);
                    if (index4 != -1) {
                        department.getLabs()[index4].printPCs();
                    } else {
                        System.out.println("Lab not found!\n");
                    }
                    break;
                case 7:
                    department.printPCs();
                    break;
                case 8:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
    
   
