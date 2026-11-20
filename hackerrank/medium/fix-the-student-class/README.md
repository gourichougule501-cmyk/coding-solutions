# Fix the Student Class

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

The Student class is designed to store a student's name and roll number. It includes a constructor to initialize these attributes and a method displayDetails() to print the student details.

You need to:

- Fix the constructor call in the main() method.
- Correct the method call to print the student details.
- Ensure that the program works with input provided for the student’s name and roll number.

 **Input Format** 

- The first line contains the student's name (String).
- The second line contains the student's roll number (integer).

 **Constraints** 

The student's name will have at most 50 characters. The roll number will be an integer between 1 and 1000.

 **Output Format** 

Name:, Roll Number:

Name: Alice, Roll Number: 1023

 **Sample Input 0** 

```
Alice
1023

```

 **Sample Output 0** 

```
Name: Alice, Roll Number: 1023

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T09:58:27.484Z  

```java
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




```

---

[View on HackerRank](https://www.hackerrank.com/challenges/fix-the-student-class/problem)