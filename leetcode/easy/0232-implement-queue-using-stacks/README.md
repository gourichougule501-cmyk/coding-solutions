# Implement Queue using Stacks

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (`push`, `peek`, `pop`, and `empty`).

Implement the `MyQueue` class:

- void push(int x) Pushes element x to the back of the queue.
- int pop() Removes the element from the front of the queue and returns it.
- int peek() Returns the element at the front of the queue.
- boolean empty() Returns true if the queue is empty, false otherwise.

 **Notes:** 

- You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
- Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.

 

 **Example 1:** 

```
Input
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 1, 1, false]

Explanation
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false

```

 

 **Constraints:** 

- 1 <= x <= 9
- At most 100 calls will be made to push, pop, peek, and empty.
- All the calls to pop and peek are valid.

 

 **Follow-up:**  Can you implement the queue such that each operation is  **amortized**  `O(1)` time complexity? In other words, performing `n` operations will take overall `O(n)` time even if one of those operations may take longer.

## Solution

**Language:** Python  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 12.2 MB (beats 78.77%)  
**Submitted:** 2026-11-21T06:51:10.851Z  

```py
class MyQueue:

    def __init__(self):
# Stack 1: Used to insert new elements
        self.stack1 = []

# Stack 2: Used to remove and access front elements
        self.stack2 = []

    def push(self, x):
# Insert the element into Stack 1
        self.stack1.append(x)

    def pop(self):

# Check whether Stack 2 is empty
        if not self.stack2:

# Transfer all elements from Stack 1 to Stack 2
# This reverses the order of elements
            while self.stack1:

# Remove the top element from Stack 1
# and insert it into Stack 2
                self.stack2.append(self.stack1.pop())

# Remove and return the front element
        return self.stack2.pop()

    def peek(self):

# If Stack 2 is empty, transfer elements from Stack 1
        if not self.stack2:

            while self.stack1:
                self.stack2.append(self.stack1.pop())

# Return the top element without removing it
        return self.stack2[-1]

    def empty(self):

# Queue is empty only when both stacks are empty
        return not self.stack1 and not self.stack2
```

---

[View on LeetCode](https://leetcode.com/problems/implement-queue-using-stacks/)