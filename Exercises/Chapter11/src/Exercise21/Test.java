package Exercise21;

public class Test {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try{
            anonymousMethod(array);
        }
        catch (Exception e) {
            System.out.printf("Catches %s from the outer catch block\n", e.getClass().getSimpleName());
        }
    }


    static void anonymousMethod(int[] array) {
        try{
            array[array.length + 5] = 3 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("Catches %s inside the anonymousMethod\n", e.getClass().getSimpleName());
        }
    }
}
