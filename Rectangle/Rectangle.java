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
        if (r2.getX() < x + width && r2.getX() + r2.getWidth() > x) {
            if (r2.getY() < y + length && r2.getY() + r2.getLength() > y) {
                return true;
            }
        }
        return false;
    }

    // Get Intersection of two rectangles
    public Rectangle intersection(Rectangle r2) {

        // Returns null if rectangles do not overlap
        if (this.overlaps(r2) == false) {
            return null;
        }

        // Otherwise return rectangles formed by intersection
        int maxX = Math.min(Rectangle.getX2(this), Rectangle.getX2(r2));
        int maxY = Math.min(Rectangle.getY2(this), Rectangle.getY2(r2));
        int xX = Math.max(this.x, r2.getX());
        int xY = Math.max(this.y, r2.getY());

        return new Rectangle(maxY - xY, maxX - xX, xX, xY);
    }

    public static int getX2(Rectangle r) {
        return (int) (r.getX() + r.getWidth());
    }

    public static int getY2(Rectangle r) {
        return (int) (r.getY() + r.getLength());
    }

    public String toString() {
        return "Length: " + length + ", Width: " + width + ", X: " + x + ", Y: " + y;
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle temp = (Rectangle) obj;
        return length == temp.length && width == temp.width;
    }

}