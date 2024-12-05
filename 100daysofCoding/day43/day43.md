[Find Pivot Index](https://leetcode.com/problems/find-pivot-index/)
```java
class Solution {
	public int pivotIndex(int[] nums) {
		int rsum = 0;
		for(int ele: nums){
			rsum += ele;
		}
		int lsum =0;
		for(int i=0; i<nums.length; i++){
			lsum+=nums[i];
			if(lsum==rsum){
				return i;
			}
			rsum-=nums[i];
			}
		return -1;
	}

}
```

