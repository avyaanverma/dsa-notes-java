# Find the Duplicate Number

## BruteForce
```java
class Solution {

public int findDuplicate(int[] nums) {

  

boolean state = 1;

for(int i=1; i<nums.length+1; i++){

state = state ^ i;

}

for(int i=0;i<nums.length;i++){

state = state ^ nums[i];

}

return state;

}

}
```
## HashMap

```java
class Solution {

public int findDuplicate(int[] nums) {

  

HashMap<Integer,Integer> ans = new HashMap<>();

for(int i=0; i<nums.length; i++){

if(ans.containsKey(nums[i])){

return nums[i];

}

ans.put(nums[i],1);

}

return -1;

  

}

}
```

## Make Negative Index
```java
class Solution{
	public static void main(){
		int[] arr = {3,1,4,2,2}
		int index = arr[0];
		for(int i=0;i<arr.length; i++){
			int location = Math.abs(arr[i]);
			if(arr[location]<0){
				index = location;
				break;
			}
			arr[location] = -arr[location];
		}
	}
}
```