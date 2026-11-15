class Solution(object):
    def moveZeroes(self, nums):
        #nums = [0,1,0,3,12]
        n=sorted(nums)
#print(n)
#p=len(n)-i
        for i in range(len(n)):
            if n[i]==0:
                nums.remove(0)
                nums.append(n[i])
        #nums.remove(0)
        print(nums)
        