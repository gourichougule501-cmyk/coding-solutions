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