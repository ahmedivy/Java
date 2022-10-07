public class Department {
    private String name;
    private Lab[] labs= new Lab[20];
    private Employee HOD;
    private Employee labIncharge;

    public Department(String name, Employee HOD, Employee labIncharge) {
        this.name = name;
        this.HOD = HOD;
        this.labIncharge = labIncharge;
    }

    // Copy Constructor
    public Department(Department other){
        this.name = other.getName();
        this.HOD = new Employee(other.getHOD());
        this.labIncharge = new Employee(other.getLabIncharge());

        // Creating deep copy of the array
        Lab temp[] = new Lab[other.getLabs().length];
        for (int i = 0; i < temp.length; i++) {
            if(other.getLabs()[i] != null){
                temp[i] = new Lab(other.getLabs()[i]);
            }
        }
        this.labs = temp;
    }

    @Override
    public String toString() {
        return String.format("Name: %s; HOD: %s, Total Labs: %d", name, HOD, totalLabs());
    }

    public Lab[] getLabs() {
        return labs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getHOD() {
        return HOD;
    }

    public Employee getLabIncharge() {
        return labIncharge;
    }

    public void setHOD(Employee hOD) {
        this.HOD = hOD;
    }

    public void setLabIncharge(Employee labIncharge) {
        this.labIncharge = labIncharge;
    }

    public void printLabs(){
        for(Lab lab: labs){
            if(lab != null){
                System.out.println(lab);
            }
        }
    }

    public void addLab(Lab lab){
        for (int i = 0; i < labs.length; i++) {
            if(labs[i] == null){
                labs[i] = new Lab(lab);
                break;
            }
        }
    }

    public void removeLab(Lab lab){
        for (int i = 0; i < labs.length; i++) {
            if(labs[i] != null && labs[i].equals(lab)){
                labs[i] = null;
                break;
            }
        }
    }

    public void printPCs(){
        for(Lab lab: labs){
            if(lab != null){
                System.out.println(lab.getName() + ": ");
                lab.printPCs();
            }
        }
    }

    @Override
    protected Object clone() {
        return new Department(this);
    }

    public int searchLab(String name){
        for (int i = 0; i < labs.length; i++) {
            if(labs[i] != null && labs[i].getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }

    public int totalLabs(){
        int count = 0;
        for (Lab lab : labs) {
            if(lab != null){
                count++;
            }
        }
        return count;
    }

    // Adding some data in department
    {
        // Create some Employees
        Employee labAttendant1 = new Employee("Dr. C", "Lab Attendant");
        Employee labAttendant2 = new Employee("Dr. D", "Lab Attendant");

        // Create some labs
        Lab lab1 = new Lab("Lab 1", labAttendant1);
        Lab lab2 = new Lab("Lab 2", labAttendant2);

        // Create some PCs
        PC pc1 = new PC("PC 1", "LCD 1", 8, 1000, false);
        PC pc2 = new PC("PC 2", "LCD 2", 16, 500, true);
        PC pc3 = new PC("PC 3", "LCD 3", 8, 500, true);
        PC pc4 = new PC("PC 4", "LCD 4", 16, 1000, false);
        
        // Adding PCs to labs
        lab1.addPC(pc1);
        lab1.addPC(pc2);
        lab2.addPC(pc3);
        lab2.addPC(pc4);

        // Adding labs to department
        this.addLab(lab1);
        this.addLab(lab2);
    }
}
