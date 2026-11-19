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
