# Fix the Rectangle Class

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Students must fix the Rectangle class constructor and the calculateArea method to correctly compute the area.

Instructions:

Students should only edit the Rectangle class. They must ensure that the output is Area: 50

 **Input Format** 

No input is required. The dimensions of the rectangle are hardcoded as length = 10 and breadth = 5.

 **Constraints** 

length and breadth are positive integers. The formula for the area of a rectangle is length * breadth.

 **Output Format** 

Print the area of the rectangle.

Area: 50

 **Sample Output 0** 

```
Area: 50

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T15:41:59.401Z  

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Rectangle {
    int length, breadth;

    // Constructor
    Rectangle(int l, int b) {
        // Student needs to fix this
        this.length=l;
        this.breadth=b;
    }

    int calculateArea() {
        // Student needs to fix this
        return length*breadth;
    }
}

public class Solution {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("Area: " + rect.calculateArea());
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/fix-the-rectangle-class/problem)