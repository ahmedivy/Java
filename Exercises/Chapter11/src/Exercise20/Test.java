package Exercise20;

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try{
            System.out.println(computeAverage(array));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("Catches rethrowned %s inside the main method\n", e.getClass().getSimpleName());
            System.out.println("StackTree of the exception:");
            for (StackTraceElement s : e.getStackTrace()) {
                System.out.println("\t" + s);
            }
        }
    }

    static double computeAverage(int[] array) {
        int sum = 0;
        try{
            for (int i = 0; i < array.length + 5; i++) {
                sum += array[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("Catches %s inside the method computeAverage\n", e.getClass().getSimpleName());
            throw e;
        }
        return sum / array.length;
    }
}
