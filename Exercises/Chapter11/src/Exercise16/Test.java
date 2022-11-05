package Exercise16;

public class Test {
    public static void main(String[] args) {
        
        try {
            throw new ExceptionB();
        } catch (ExceptionA e) {
            System.out.println("Catches ExceptionB from catch(ExceptionA e)");
        }


        try {
            throw new ExceptionC();
        } catch (ExceptionB e) {
            System.out.println("Catches ExceptionC from catch(ExceptionB e)");
        }
    }
}
