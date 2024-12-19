# Linked List Cycle

We have to find if the linked list is rotated or not 

## Approach I - My own approach
```java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head ==null ||head.next == null) return false;
        ListNode ptr1 = head;
        ListNode ptr2 = head.next.next;

        while(ptr1!=ptr2){
            if(ptr2==null || ptr2.next==null || ptr2.next.next==null) return false;
            ptr2=ptr2.next.next;
            ptr1=ptr1.next;
        }

        return true;
    }
}
```

## Approach II - 
```java
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head ==null ||head.next == null) return false;
        ListNode ptr1 = head;
        ListNode ptr2 = head.next.next;

        while(ptr2!=null && ptr2.next!=null){
            if(ptr2==ptr1) return true;
            ptr2=ptr2.next.next;
            ptr1=ptr1.next;
        }

        return false;
    }
}
```

- Also I didn't knew I won't be able to copy paste in vim mode leetcode 
- Found the solution :) use Ctrl+Insert instead 
