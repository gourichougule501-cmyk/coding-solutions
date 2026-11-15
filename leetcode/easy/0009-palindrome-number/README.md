# Palindrome Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `x`, return `true` if `x` is a  **palindrome**, and `false` otherwise.

 

Original
Python
 **Example 1:** 

```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

```

 **Example 2:** 

```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

```

 **Example 3:** 

```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

```

 

 **Constraints:** 

- -231 <= x <= 231 - 1

 

 **Follow up:**  Could you solve it without converting the integer to a string?

## Solution

**Language:** Python  
**Runtime:** 14 ms (beats 56.27%)  
**Memory:** 12.3 MB (beats 34.69%)  
**Submitted:** 2026-11-15T05:22:23.929Z  

```py
class Solution(object):
    def isPalindrome(self, x):
        rev = 0
        temp = x
        while(x>0):
            d = x%10
            rev =rev *10 +d
            x =x//10
        if temp == rev:
            return True
        return False
        

        
```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-number/)