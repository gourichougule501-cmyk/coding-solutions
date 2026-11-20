# Java Substring Comparisons

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Two strings, $a$ and $b$, are called anagrams if they contain all the same characters in the same frequencies.  For this challenge, the test is not case-sensitive. For example, the anagrams of `CAT` are `CAT`, `ACT`, `tac`, `TCA`, `aTC`, and `CtA`.

**Function Description**    

Complete the *isAnagram* function in the editor.   

*isAnagram* has the following parameters:  

- *string a:* the first string   
- *string b:* the second string   

**Returns**   

- *boolean:* If $a$ and $b$ are case-insensitive anagrams, return true.  Otherwise, return false.   

**Input Format**

The first line contains a string $a$.		
The second line contains a string $b$.

**Constraints**

- $1 \le length(a), length(b) \le 50$
- Strings $a$ and $b$ consist of English alphabetic characters.
- The comparison should NOT be case sensitive. 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T17:52:42.255Z  

```java


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0;i<=s.length()-k;i++){
            String subs = s.substring(i,i+k);
            if(subs.compareTo(smallest)<0){
                smallest = subs;}
            if(subs.compareTo(largest)>0){
                largest = subs;
            }
            
        }
        return smallest + "\n" + largest;
    }


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-anagrams/problem)