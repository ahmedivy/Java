public class TestRectangle {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(4, 12, 8, 7);
        Rectangle r2 = new Rectangle(10, 4, 19, 4);

        System.out.println(r1.overlaps(r2) ? "Rectangles Overlap" : "Rectangles do not overlap");
        System.out.println(r1.intersection(r2));
        System.out.println(r1.equals(r2));
    }

}
