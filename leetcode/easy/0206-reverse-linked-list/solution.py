# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):

    def reverseList(self, head):
        prev = None
        current = head

        while current:
            nxt = current.next     # Save the next node
            current.next = prev    # Reverse the link
            prev = current        # Move prev forward
            current = nxt         # Move current forward

        return prev

        
        
        
        