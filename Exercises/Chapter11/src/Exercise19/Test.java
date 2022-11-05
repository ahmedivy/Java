package Exercise19;

public class Test {
    public static void main(String[] args) {
        
        try{
            new SomeClass();
        } catch (IllegalArgumentException e) {
            System.out.printf("Catches %s\n", e.getClass().getSimpleName());
        }

    }
}
