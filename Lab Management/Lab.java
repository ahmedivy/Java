public class Lab {
    private String name;
    private Employee labAttendant;
    private PC[] computers = new PC[100];

    public Lab(String name, Employee labAttendant) {
        this.name = name;
        this.labAttendant = labAttendant;
    }

    public Lab(Lab other){
        this.name = other.getName();
        this.labAttendant = new Employee(other.getLabAttendant());
        
        // Creating deep copy of the array
        PC temp[] = new PC[other.getComputers().length];
        for (int i = 0; i < temp.length; i++) {
            if(other.getComputers()[i] != null){
                temp[i] = new PC(other.getComputers()[i]);
            }
        }
        this.computers = temp;
    }

    public PC[] getComputers() {
        return this.computers;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    public void addPC(PC pc){
        for (int i = 0; i < computers.length; i++) {
            if(computers[i] == null){
                computers[i] = pc;
                break;
            }
        }
    }

    public void printPCs(){
        for(PC computer: computers){
            if (computer != null){
                System.out.println(computer);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s; Lab Attendant: %s; Total PCs: %d", name, labAttendant, totalPCs());
    }

    public void removePC(PC pc){
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] != null && computers[i].equals(pc)){
                computers[i] = null;
                break;
            }
        }
    }

    @Override
    protected Object clone() {
        return new Lab(this);
    }

    public int searchPC(String name){
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] != null && computers[i].getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }

    public int totalPCs(){
        int count = 0;
        for (PC computer : computers) {
            if (computer != null){
                count++;
            }
        }
        return count;
    }

}

