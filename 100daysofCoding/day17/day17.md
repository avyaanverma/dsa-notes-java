# 11. Container With Most Water

Leetcode: https://leetcode.com/problems/container-with-most-water/description/

GFG: https://www.geeksforgeeks.org/problems/container-with-most-water0535/1

![water](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg)

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

# Approach I : Two Pointer

```java
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxWater = Integer.MIN_VALUE;
        int water = 0;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int length = j-i;
                int breadth = (height[j]>=height[i])?height[i]:height[j];
                int water = length * breadth;

                if(water>maxWater) maxWater = water;
             }
        }

        return maxWater;
    }
}

```

I got the error of Time Limit Exceeded because of this Approach 🥲

🥹However someone in the solutions section used the same two pointer approach and he suceeded but used the left and right pointer approach in two-pointer.


## ChatGPT Explanation
```java
if (height[left] < height[right]) {
    left++;
} else {
    right--;
}
```
Explanation: 

Code 1:
After calculating currentArea, it only decreases right by 1 in each loop iteration.
When left equals right, it resets right to n - 1 and increments left by 1. This approach re-evaluates many pairs unnecessarily, resulting in a complexity closer to 𝑂(𝑛2)

Code 2:

It avoids unnecessary recalculations by moving the pointer that points to the smaller height, because only moving the smaller-height pointer can potentially increase the area.
This results in each pointer moving towards the center only once, leading to an optimal 
𝑂(𝑛)
O(n) time complexity.
Why This is More Optimized:
In Code 2, each pair is only considered once, and the approach skips comparisons that are guaranteed not to yield a larger area. By only moving the smaller height, it directly reduces the number of computations and skips redundant checks, leading to a more efficient solution.






You said:
     but how do I know if code 2 computing all the pairs ? 
ChatGPT said:
ChatGPT
Great question! Code 2 does compute all necessary pairs because it leverages a two-pointer technique that systematically evaluates every relevant pair without missing any. Here’s how it works:

Key Idea
In this problem, the maximum area is constrained by the shorter of the two lines at each pair of pointers (left and right). Therefore, the two-pointer approach in Code 2 avoids redundant calculations by focusing only on relevant pairs and moving the pointers inward when a smaller line limits the potential area.

Proof of Coverage
Initial Setup:

left starts at the beginning of the array (0), and right starts at the end (n - 1).
Pointer Movement Based on Heights:

In each iteration, Code 2 compares the heights at left and right.
It then moves the pointer pointing to the smaller height, ensuring that each possible boundary height is considered while minimizing unnecessary comparisons:
If height[left] < height[right], moving left++ can potentially yield a larger area.
If height[right] <= height[left], moving right-- is more beneficial for the same reason.
All Possible Pairs Covered:

Since the algorithm moves one pointer per iteration, each unique pair of left and right (from the outermost to the innermost points) is computed once.
This covers all pairs needed for calculating the maximum area, without revisiting pairs that would yield a smaller area than already considered pairs.
Completeness of Coverage:

By moving only the pointer that limits the area (i.e., the shorter height), Code 2 ensures that each height is paired with all potentially larger areas without re-evaluating lower-potential areas.
