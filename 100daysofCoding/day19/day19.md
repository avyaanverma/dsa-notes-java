# Maximum Ascending Subarray Sum


GFG: https://www.geeksforgeeks.org/problems/find-maximum-sum-strictly-increasing-subarray4443/0


## What is a Subarray ? 
A subarray is defined as a contiguous sequence of numbers in an array.

A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r, numsi  < numsi+1. Note that a subarray of size 1 is ascending.

I can try the Kadane's algorithm for this question
## Approach of (Kadane’s Algorithm)

```java
class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<n; i++){
           if(nums[i] > nums[i-1]){
            currSum =  nums[i] + currSum;
           }
           else{
            currSum = nums[i];
           }
           maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;

    }
}
```
