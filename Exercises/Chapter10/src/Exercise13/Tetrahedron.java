package Exercise13;

public class Tetrahedron extends ThreeDimShape {
    private double side;

    public Tetrahedron(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * Math.pow(side, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3) / (6 * Math.sqrt(2));
    }

    @Override
    public String toString() {
        return "Tetrahedron [side=" + side + "]";
    }
}
