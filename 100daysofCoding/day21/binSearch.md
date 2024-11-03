# Binary Search 

Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.


```java 
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int high = n-1;
        int low = 0;
        int middle = n / 2;

        while(low <= high){
            if(nums[middle] == target){
                return middle;
            }
            else if (nums[middle]<target){
                low = middle + 1;
                
            }
            else {
                high = middle - 1;
            }
             middle = (high + low) / 2;
        }

        return -1;
    }
}
```


## Leetcode POTD -- Rotate String 

To check if goal is a rotation of s, the correct approach is to use the following insight:

Concatenate s with itself. 
If goal is a rotation of s, it must appear as a substring in s + s.
Check if goal is a substring of this concatenated string (s + s) and if s and goal have the same length.

![logic](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjhwND3Eo4FLiR1mW2zYeDZd-2mH0nfmIxD-BRx6XEBC4RL-kzQAbqWfAYyvxrNE380TuUdMVLThT2yB0ODOW1bKlWPKNKeQf3ta874AlF5LHr23rZ30t7rc39pXBQX3B8PQe8J81ardNg/w619-h341/how+to+check+if+two+string+are+rotation+of+each+other.png)

```java
if(s.length() != goal.length()) return false;
        if((s + s).indexOf(goal) != -1){
            return true;
        }
        return false; 
```