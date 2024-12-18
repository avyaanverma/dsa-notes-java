 

# Day 16 - Largest number at least twice of others

## Leetcode : https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/

The goal is to find the largest number in an array and determine if it's at least twice as big as the second largest number. This problem calls for us to identify the two biggest elements in the array efficiently.

# Solutions
## Bruteforce Approach
```java
class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;

        // Step 1: Find the largest element and its index
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        // Step 2: Check if max is at least twice as large as all other elements
        for (int i = 0; i < n; i++) {
            if (i != index && nums[i] * 2 > max) {
                return -1;
            }
        }

        // Step 3: Return the index if all conditions are satisfied
        return index;
    }
}


```
#### Complexity Analysis:
-   **Time Complexity**: O(n2)O(n^2)O(n2), where nnn is the length of the array. This is because we loop through the array once to find the maximum element, and then again to validate the dominance condition by comparing with every other element.
-   **Space Complexity**: O(1)O(1)O(1), as it uses only a few additional variable

## Optimized Approach


```java
class Solution {
	public int dominantIndex(int[] nums) {
		int n = nums.length;
	     // Edge case: if there's only one element, it is the dominant by default
		if (n == 1) return 0;

	        // Step 1: Identify max and secondMax elements and their index
	    int max = Integer.MIN_VALUE;
	    int secondMax = Integer.MIN_VALUE;
	    int index = -1;

	    for (int i = 0; i < n; i++) {
		    if (nums[i] > max) {
				secondMax = max;  // update secondMax before updating max
	            max = nums[i];
				index = i;
	         } else if (nums[i] > secondMax) {
				secondMax = nums[i];
	         }
		}

	    // Step 2: Check if max is at least twice as large as secondMax
	    return (max >= 2 * secondMax) ? index : -1;
	    }
    }
```    

#### Complexity Analysis:

-   **Time Complexity**: O(n)O(n)O(n), since we only need a single loop to determine both the largest and second-largest values.
-   **Space Complexity**: O(1)O(1)O(1), as we use only a few extra variables

