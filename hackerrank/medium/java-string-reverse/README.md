# Java String Reverse

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.  

***
Given a string $A$, print ``Yes`` if it is a palindrome, print ``No`` otherwise. 


**Input Format**

 

**Constraints**

* $A$ will consist at most $50$ lower case english letters.

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T01:07:39.683Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        String A=sc.next();
        StringBuilder r =new StringBuilder(A);
        r.reverse();
         if(A.equals(r.toString())){System.out.println("Yes");}
         else{System.out.println("No");}
        /* Enter your code here. Print output to STDOUT. */
        
    }
}




```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-string-reverse/problem)