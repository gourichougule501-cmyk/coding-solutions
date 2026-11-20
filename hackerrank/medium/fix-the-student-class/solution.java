import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student {
    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine().trim();   // trim removes extra spaces around the name
        int rollNumber = scanner.nextInt();

        Student student = new Student(name, rollNumber);

        student.displayDetails();
    }
}



