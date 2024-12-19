# Delete Linked List


## Approach 
- Move the next elements to this position 
- A tricky approach that doesn't comes to mind in the starting  


```java
class Solution{
    public void deleteNode(ListNode node){
        ListNode ptr = node;
        while(ptr!=null){
            if(ptr.next!=null){
                ptr.val = ptr.next.val;
            }
            ptr = ptr.nex:t;
        }        
    }
}
```
