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
