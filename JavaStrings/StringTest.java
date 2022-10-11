package JavaStrings;

public class StringTest {
    public static void main(String[] args) {
        
        String str = "This is a test.";

        // Some String methods:
        System.out.println("Length of str: " + str.length());
        System.out.println("The character at position 3: " + str.charAt(3));
        System.out.println("The substring from 4 to 9: " + str.substring(4, 9));
        System.out.println("The index of the first 's': " + str.indexOf('s'));
        System.out.println("The index of the beginning of the " + "substring \"test\": " + str.indexOf("test"));
        System.out.println("The string in uppercase: " + str.toUpperCase());
        System.out.println("The string in lowercase: " + str.toLowerCase());
        System.out.println("Does the string start with \"This\"? " + str.startsWith("This"));
        System.out.println("Does the string end with \"test.\"? " + str.endsWith("test."));
        System.out.println("Does the string contain \"is\"? " + str.contains("is"));
        System.out.println("Replace 'a' with 'X': " + str.replace('a', 'X'));
        System.out.println("Replace \"test\" with \"toast\": " + str.replace("test", "toast"));
        System.out.println("Remove leading and trailing whitespace: " + ("     " + str + "     ").trim());
        
        // Strings Regex Methods:
        // System.out.println("Remove leading whitespace: " + ("     " + str + "     ").trim().replaceFirst("^\\s+", ""));
        // System.out.println("Remove trailing whitespace: " + ("     " + str + "     ").trim().replaceFirst("\\s+$", ""));
    }
}
