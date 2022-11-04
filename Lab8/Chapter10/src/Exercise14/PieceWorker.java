package Exercise14;

public class PieceWorker extends Employee{
    
    private double wage;
    private double pieces;
    
    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, double pieces) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        if (pieces < 0.0) {
            throw new IllegalArgumentException("Pieces must be >= 0.0");
        }
        this.wage = wage;
        this.pieces = pieces;
    }
    
    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        this.wage = wage;
    }
    
    public double getWage() {
        return wage;
    }
    
    public void setPieces(double pieces) {
        if (pieces < 0.0) {
            throw new IllegalArgumentException("Pieces must be >= 0.0");
        }
        this.pieces = pieces;
    }
    
    public double getPieces() {
        return pieces;
    }
    
    @Override
    public double earnings() {
        return (getWage() * getPieces());
    }
    
    @Override
    public String toString() {
        return String.format("piece worker: %s%n%s: $%,.2f; %s: %.2f", super.toString(), "wage", getWage(), "pieces", getPieces());
    }
}
