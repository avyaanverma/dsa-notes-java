# Maximum Subarray 
This questions I had done already so I didn't think of much just knew that we are going to traverse the array and have a current sum that is going to store the numbers coming up 
- If the number that comes when adding to the sum we don't add it and instead start from the next number that is nums[i]
- then if the sum that we got is greater than the max Sum we hange it's value.

```java
class Solution {
    public int maxSubArray(int[] nums) {
         if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0; i < nums.length; i++){

            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
```