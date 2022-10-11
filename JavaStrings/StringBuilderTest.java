package JavaStrings;

import java.lang.StringBuilder;

public class StringBuilderTest {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("This is a test.");
        
        // Some StringBuilder methods:
        System.out.println("Before Appending: " + sb);
        System.out.println("After Appending: " + sb.append(" This is appended String."));
        System.out.println("After Inserting: " + sb.insert(0, "This is inserted String. "));
        System.out.println("After Deleting (first 5 chars.): " + sb.delete(0, 5));
        System.out.println("After Reversing: " + sb.reverse());
        System.out.println("Again After Reversing: " + sb.reverse());
        System.out.println("After Replacing(first 5 chars.): " + sb.replace(0, 5, "This is replaced String."));
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        sb.setLength(10);
        System.out.println("After Setting Length to 10: " + sb);
    }
}
