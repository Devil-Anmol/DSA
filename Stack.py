# Author: AG

class Node:
    def __init__(self,n):
        self.value = n
        self.next = None


class stack:
    def __init__ (self,n):
        self.root = Node(n)

    def push(self,n):
        node = Node(n)
        node.next = self.root
        self.root = node
        

        pass
    def pop(self):
        # n = None
        if self.isEmpty()== False:
            n = self.root
            self.root = self.root.next
        else :
            return None
        return n.value
        pass

    def printstack(self):
        n = self.root
        while(n.next!=None):
            print(n.value)
            n = n.next
        print(n.value)

    def isEmpty(self):
        count = 0
        n = self.root
        while(n!=None):
            count+=1
            n = n.next
        return count==0

# Testing part.....
new = stack(5)
new.push(6)
new.push(8)
new.push(9)
new.printstack()
print(new.pop())
