public class TestRectangle {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(4, 12, 4, 3);
        Rectangle r2 = new Rectangle(4, 12, 4, 3);

        System.out.println(r1.overlaps(r2) ? "Rectangles Overlap" : "Rectangles do not overlap");
        System.out.println(r1.intersection(r2));
        System.out.println(r1.equals(r2));
    }

}
