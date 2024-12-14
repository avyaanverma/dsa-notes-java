# Add Two Numbers

```java
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // p as pointer

        ListNode p1 = l1;

        ListNode p2 = l2;

  

        ListNode ans = new ListNode(-1);

        ListNode d = ans;

        int carry = 0;

        while(p1!=null || p2!=null){

            int a=0;

            int b=0;

            if(p1!=null) {

                a = p1.val;

                p1 = p1.next;

            }

            if(p2!=null){

                b = p2.val;

                p2 = p2.next;

            }

            int sum = a+b+carry;

            int digit = sum%10;

            carry = sum/10;

  

            ListNode temp = new ListNode(digit);

            d.next = temp;

            d = d.next;

        }

  

        if(carry>0){

            ListNode temp = new ListNode(carry);

            d.next = temp;

        }

  

        return ans.next;

  

    }

}
```