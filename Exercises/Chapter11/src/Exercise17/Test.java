package Exercise17;

import java.io.IOException;

// Importing exceptions created in Excercise16
import Exercise16.*;

public class Test {
    public static void main(String[] args) {
        
        try {
            throw new ExceptionA();
        } catch (Exception e) {
            System.out.printf("Catches %s from catch block of 'java.lang.Exception'\n", e.getClass().getSimpleName());
        }

        try {
            throw new ExceptionB();
        } catch (Exception e) {
            System.out.printf("Catches %s from catch block of 'java.lang.Exception'\n", e.getClass().getSimpleName());
        }

        try {
            throw new ExceptionC();
        } catch (Exception e) {
            System.out.printf("Catches %s from catch block of 'java.lang.Exception'\n", e.getClass().getSimpleName());
        }

        try {
            throw new NullPointerException();
        } catch (Exception e) {
            System.out.printf("Catches %s from catch block of 'java.lang.Exception'\n", e.getClass().getSimpleName());
        }

        try {
            throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.printf("Catches %s from catch block of 'java.lang.Exception'\n", e.getClass().getSimpleName());
        }

        try {
            throw new IOException();
        } catch (Exception e) {
            System.out.printf("Catches %s from catch block of 'java.lang.Exception'\n", e.getClass().getSimpleName());
        }
    }
}
