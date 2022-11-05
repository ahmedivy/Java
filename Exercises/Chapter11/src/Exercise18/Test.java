package Exercise18;

import Exercise16.*;

public class Test {
    public static void main(String[] args) {
        
        // try {
        //     throw new Exception();
        //     throw new ExceptionB();
        //     throw new ExceptionC();
        // }
        // catch (Exception e) {
        //     System.out.println("Catches Exception from catch(Exception e)");
        // }
        // catch (ExceptionA e) {
        //     System.out.println("Catches ExceptionB from catch(ExceptionA e)");
        // }
        // catch (ExceptionB e) {
        //     System.out.println("Catches ExceptionC from catch(ExceptionB e)");
        // }

        /* 
            Above commented code is not valid because catch blocks are checked in order from top to bottom and the first catch block that 
            matches the exception type is executed. The first catch block that matches the exception type is Exception, so the 
            code will never reach the other catch blocks. So the catch block of subclass must be placed before the catch block of
            superclass.
        */

        // Below is the correct code
        try {
            throw new ExceptionC();
        }
        catch (ExceptionC e) {
            System.out.println("Catches ExceptionC from catch(ExceptionC e)");
        }
        // catch (ExceptionB e) {
        //     System.out.println("Catches ExceptionC from catch(ExceptionB e)");
        // }
        // catch (ExceptionA e) {
        //     System.out.println("Catches ExceptionB from catch(ExceptionA e)");
        // }
        // catch (Exception e) {
        //     System.out.println("Catches Exception from catch(Exception e)");
        // }

        /*
         * The above code showing warning that catch blocks after ExceptionC will never be executed because only throwned exception
         * is ExceptionC (in this case) which is caught by the first catch block. 
         */
    }
}
