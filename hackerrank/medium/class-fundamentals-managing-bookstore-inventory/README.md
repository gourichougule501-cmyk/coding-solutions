# Class Fundamentals – Digital Inventory with OOP

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You manage a bookstore and need to streamline the tracking of book details. Each book has four attributes:

title (String) author (String) price (double) stock (int)

Your task is to create a class called Book that models each book in your inventory. Implement a method called displayDetails() to print the book's details in the following format:

 **Input Format** 

The Great Gatsby F. Scott Fitzgerald 10.99 15

 **Constraints** 

title and author will have at most 50 characters. price will be between 0.01 and 1000.00. stock will be a non-negative integer not exceeding 1000.

 **Output Format** 

Title: The Great Gatsby Author: F. Scott Fitzgerald Price: 10.99 Stock: 15

 **Sample Input 0** 

```
1984
George Orwell
15.55
20

```

 **Sample Output 0** 

```
Title: 1984
Author: George Orwell
Price: 15.55
Stock: 20

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T15:58:58.184Z  

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;
    int stock; 
    
    // TODO: Define attributes for title, author, price, stock

    // Constructor
    // TODO: Create a constructor to initialize the attributes
    Book(String i,String s,double p,int st){
       this.title=i;
        this.author=s;
        this.price=p;
        this.stock=st; 
    }

    
    // Method to display details
    public void DisplayDetails() {
        // TODO: Print book details in the required format
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("Stock: "+stock);
        
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        double price = scanner.nextDouble();
        int stock = scanner.nextInt();
        
        // Create Book object
        // TODO: Instantiate a Book object
        Book b = new Book(title,author,price,stock);
        
        // Call displayDetails
        // TODO: Invoke displayDetails() on the Book object
        b.DisplayDetails();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/class-fundamentals-managing-bookstore-inventory/problem)