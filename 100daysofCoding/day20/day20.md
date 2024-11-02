# Lucky Number in array


GFG: https://leetcode.com/problems/find-lucky-integer-in-an-array/


## What is a Subarray ? 
A subarray is defined as a contiguous sequence of numbers in an array.

A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r, numsi  < numsi+1. Note that a subarray of size 1 is ascending.

I can try the Kadane's algorithm for this question
## HashMap - MyOwn -- 6ms 

```java
class Solution {
    public int findLucky(int[] arr) {
        
        // secondMax
        // 2 pointer 
        // create a setMap 
        int n = arr.length;
        HashMap<Integer, Integer> aree = new HashMap<>();
        // number, value

        for(int i = 0; i<n; i++){
            if(!aree.containsKey(arr[i])){
               aree.put(arr[i], 1);
               continue;
            }
            int cnt = aree.get(arr[i]) + 1;
            aree.put(arr[i], cnt);
        }

        int luckyNumber = -1;
        for(Map.Entry<Integer,Integer> entry : aree.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(key == value) luckyNumber = key;
        }

        return luckyNumber;

        


    }
}
```
