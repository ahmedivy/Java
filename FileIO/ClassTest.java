package FileIO;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.io.IOException;

import BookStore.*;

public class ClassTest{
    public static void main(String[] args) throws IOException {
        
        // Checking source code of book class from BookStore package
        Book book = new Book("29837", "Java", new Person("James", "Halington", "jm@mail.com"), 100, 20);
        
        // Printing the source code of book class
        Class c = book.getClass();

        // Class Methods
        System.out.println("Class Name: " + c.getName());
        System.out.println("Class Simple Name: " + c.getSimpleName());
        System.out.println("Class Package Name: " + c.getPackageName());
        System.out.println("Class Canonical Name: " + c.getCanonicalName());
        System.out.println("Class Type Name: " + c.getTypeName());
        // System.out.println("Class Modifiers: " + c.getModifiers());
        // System.out.println("Class Super Class: " + c.getSuperclass());
        // System.out.println("Class Interfaces: " + c.getInterfaces());
        // System.out.println("Class Annotations: " + c.getAnnotations());

        // Class Methods
        Method methods[] = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method Name: " + method);
            // System.out.println("Method Name: " + method.getName());
            // System.out.println("\tMethod Return Type: " + method.getReturnType());
            // System.out.println("\tMethod Parameter Types: " + method.getParameterTypes());
            // System.out.println("\tMethod Exception Types: " + method.getExceptionTypes());
            // System.out.println("\tMethod Modifiers: " + method.getModifiers());
            // System.out.println("\tMethod Annotations: " + method.getAnnotations());
        }

        // Class Constructors
        Constructor constructors[] = c.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Constructor Name: " + constructor);
            // System.out.println("Constructor Name: " + constructor.getName());
            // System.out.println("\tConstructor Parameter Types: " + constructor.getParameterTypes());
            // System.out.println("\tConstructor Exception Types: " + constructor.getExceptionTypes());
            // System.out.println("\tConstructor Modifiers: " + constructor.getModifiers());
            // System.out.println("\tConstructor Annotations: " + constructor.getAnnotations());
        }
    }
}
