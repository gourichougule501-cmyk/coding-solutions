# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

Original
Python
 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Python  
**Runtime:** 26 ms (beats 28.16%)  
**Memory:** 13.2 MB (beats 42.94%)  
**Submitted:** 2026-11-15T09:05:14.984Z  

```py
class Solution(object):
    def isAnagram(self, s, t):
        return sorted(s) == sorted(t)
                  
        
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)