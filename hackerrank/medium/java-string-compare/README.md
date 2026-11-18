# Java Substring Comparisons

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

We define the following terms:

- [Lexicographical Order](https://en.wikipedia.org/wiki/Lexicographical_order), also known as *alphabetic* or *dictionary* order, orders characters as follows:		
	$$\texttt{A} \lt \texttt{B} \lt \ldots \lt \texttt{Y} \lt \texttt{Z} \lt \texttt{a} \lt \texttt{b} \lt \ldots \lt \texttt{y} \lt \texttt{z}$$ 
    
    For example, `ball < cat`, `dog < dorm`, `Happy < happy`, `Zoo < ball`.
- A [substring](https://en.wikipedia.org/wiki/Substring) of a string is a contiguous block of characters in the string. For example, the substrings of `abc` are `a`, `b`, `c`, `ab`, `bc`, and `abc`.

Given a string, $s$, and an integer, $k$, complete the function so that it finds the lexicographically *smallest* and *largest* substrings of length $k$.   

**Function Description**   

Complete the *getSmallestAndLargest* function in the editor below.   

*getSmallestAndLargest* has the following parameters:   

- *string s:* a string  
- *int k:* the length of the substrings to find   

**Returns**  

- *string:* the string '<smallest> + "\n" + <largest>' where <smallest> and <largest> are the two substrings   

**Input Format**

The first line contains a string denoting $s$.		
The second line contains an integer denoting $k$.

**Constraints**

- $1 \le |s| \le 1000$
- $s$ consists of English alphabetic letters only (i.e., `[a-zA-Z]`).

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T00:41:27.142Z  

```java


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        //String[] subs = new String[s.length()];
        for(int i=0;i<=s.length()-k;i++){
            String  subs =s.substring(i,k+i);
        if(subs.compareTo(smallest)<0){
            smallest = subs;
        } 
        if(subs.compareTo(largest)>0){
            largest = subs;
        }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-string-compare/problem)