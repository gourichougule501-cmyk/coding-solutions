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
        

        