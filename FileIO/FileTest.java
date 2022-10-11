package FileIO;

import java.io.File;

public class FileTest {
    
    // Created a file object
    static File file = new File("E:\\Java\\BookStore");
    public static void main(String[] args) {
        
        // Some methods of File class
        System.out.println("File Exists or not: " + file.exists());
        System.out.println("File Name: " + file.getName());
        System.out.println("File Path: " + file.getPath());
        System.out.println("File Absolute Path: " + file.getAbsolutePath());
        System.out.println("File Parent: " + file.getParent());
        // Whether it is a directory
        System.out.println("File is Directory: " + file.isDirectory());
        // Whether it is a file
        System.out.println("File is File(means not a folder): " + file.isFile());
        // Whether it is hidden
        System.out.println("File is Hidden: " + file.isHidden());
        
        // Print all the files in the directory(if it is a directory)
        String[] filesList = file.list();
        System.out.println("Files List: ");
        for (String file : filesList) {
            System.out.println("\t" + file);
        }
    }
}
