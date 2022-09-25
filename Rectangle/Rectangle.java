public class Rectangle {
    private double length, width;
    private int x, y;

    // Constructors
    public Rectangle() {

    }

    public Rectangle(double length, double width, int x, int y) {
        if (length > 0 && width > 0) {
            this.length = length;
            this.width = width;
            this.x = x;
            this.y = y;
        } else {
            System.out.println("Length and Width should be greate than zero!");
        }
    }

    // Getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setters
    public void setLength(double length) {
        if (length > 0)
            this.length = length;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Does Overlap?
    public boolean overlaps(Rectangle r2) {
        if (r2.getX() + r2.getWidth() < x && r2.getX() > x + width)
            return false;
        if (r2.getY() + r2.getLength() < y && r2.getY() > y + length)
            return false;

        return true;
    }

}
