# Kth Distance

Given an unsorted array arr and a number k which is smaller than the size of the array. Return true if the array contains any duplicate within k distance throughout the array else false.

Examples:

Input: arr[] = [1, 2, 3, 4, 1, 2, 3, 4] and k = 3
Output: false
Explanation: All duplicates are more than k distance away.
Input: arr[] = [1, 2, 3, 1, 4, 5] and k = 3
Output: true
Explanation: 1 is repeated at distance 3.
Input: arr[] = [6, 8, 4, 1, 8, 5, 7] and k = 3
Output: true
Explanation: 8 is repeated at distance 3.


Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ k < arr.size()
1 ≤ arr[i] ≤ 105
```java

class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        // using hashMap toa identify if no has occured before as well
        
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i]) && i - map.get(arr[i]) <= k ){
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }
}
```