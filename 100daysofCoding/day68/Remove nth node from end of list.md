[[linked list]], [[100Days Of Leetcode]]

# Approach I 
```java
/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int sizeLL(ListNode head){
        int cnt = 0;
        ListNode ptr = head;
        while(ptr!=null){
            cnt++;
            ptr=ptr.next;
        }
        return cnt;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr = head;
        int cnt = 0;
        int sl = sizeLL(head);
        if(sl==n){
            return ptr.next;
        }
        while(ptr!=null){
            cnt++;
            if(cnt==sl-n){
                ListNode temp = ptr.next;
                ptr.next = temp.next; 
                break;
            }
            ptr=ptr.next;
        }
        return head;
    }
}
```

# Approach II - Fast and Slow pointer

```java

```

