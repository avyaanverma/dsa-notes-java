# 11. Day 18 - Increasing Triplet Subsequence

Leetcode: https://leetcode.com/problems/increasing-triplet-subsequence/description/

GFG: https://www.geeksforgeeks.org/problems/sorted-subsequence-of-size-3/1

Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
Example 2:

Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.
Example 3:

Input: nums = [2,1,5,0,4,6]
Output: true
Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.

# Approach I : Two Pointer

```java
class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int n = nums.length;
        int i = 0;
        while(i+2 < n){
            if(nums[i] < nums[i++] && nums[i++] < nums[i+2]){
                return true;
            }
        }

        return false;
    }
}
}

😭 As usual this was the wrong approach altought I studies the correct approach in a better way to fully understand how the approach works

```
 ## Approach II : SecondMin/Max Approach 

```java
if (nums == null || nums.length < 3) {
            return false;
        }
int min1 = Integer.MAX_VALUE;
int min2 = Integer.MAX_VALUE;
for(int n : nums){
    if( n <= min1) min1 = n;
    else if(n < min2) min2 = n;
    else return true;
}

return false;
```

- i < j < k is what we have to check that is ascending order of a sequence of numbers. Here sequence refers to left to right.

- It works on two basic methodologies one is to find the secondMinimum number and if we find it we just need one number greater that secondMin. 

- Time Complexity : O(n)

```java
// Another Edge Case
if (nums == null || nums.length < 3) {
            return false;
        }
```
