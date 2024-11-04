# Problem 22 - Find First and Last Position of Element in Sorted Array

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        // array of integers nums sorted in non-decreasing order
        // target, [-1,-1]
        // O(log n)
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int middle = (low+high)/2;
            if(nums[middle] == target){
                int start=middle, end = middle;
                while(start>0 && nums[start-1]==target ){
                    start--;
                }
                while(end<n-1 && nums[end+1]==target ){
                    end++;
                }
                
                return new int[]{start, end};
            }
            else if(target>nums[middle]){
                low = middle+1;
            }
            else{
                high=middle-1;
            }
        }

        return new int[]{-1,-1};
    }
}

```


# POTD --  String Compression III

just doing it for the fun of it. 


Given a string word, compress it using the following algorithm:

Begin with an empty string comp. While word is not empty, use the following operation:
Remove a maximum length prefix of word made of a single character c repeating at most 9 times.
Append the length of the prefix followed by c to comp.
Return the string comp.

 Example 1:

Input: word = "abcde"
itially, comp = "". Apply the operation 5 times, choosing "a", "b", "c", "d", and "e" as the prefix in each operation.

For each prefix, append "1" followed by the character to comp.

Example 2:

Input: word = "aaaaaaaaaaaaaabb"

Output: "9a5a2b"

Explanation:

Initially, comp = "". Apply the operation 3 times, choosing "aaaaaaaaa", "aaaaa", and "bb" as the prefix in each operation.

For prefix "aaaaaaaaa", append "9" followed by "a" to comp.
For prefix "aaaaa", append "5" followed by "a" to comp.
For prefix "bb", append "2" followed by "b" to comp.
 

Constraints:

1 <= word.length <= 2 * 105
word consists only of lowercase English letters.

```java
class Solution {
    public String compressedString(String word) {

        String comp="";
        int n = word.length();
        int i = 0;
        int cnt = 1;
        while(i < n){
            if(i!=n-1 && word.charAt(i+1) == word.charAt(i)){
                cnt++;
            }
            else{
                comp += cnt + word.charAt(i);
                cnt = 1;
            }
            i++;
        }   
        return comp;
    }
}

```

- Correctly Appending Characters and Counts: comp.append(currentChar).append(count) adds the character and its count after the full count for each unique character is determined.
## Simple Approach
```java
class Solution {
    public String compressedString(String word) {

        StringBuilder comp=new StringBuilder();
        int n = word.length();
        int i = 0;
        int cnt = 1;
        while(i < n){
            char currentChar = word.charAt(i);
            if(i!=n-1 && cnt<9 && word.charAt(i+1) == word.charAt(i)){
                cnt++;
            }
            else{
                comp.append(cnt).append(currentChar);
                cnt = 1;
            }
            i++;
        }   
        return comp.toString();
    }
}
```

## Optimzed Approach

- After a fucking 37% solution I thought let's remove StringBuilder, and it worked flawlessly excpect for the fact I got a large runtime of 1034ms which is hilarious tbh.

- Another thing I realised is that StringBuilder is a game changer.
```java
class Solution {
    public String compressedString(String word) {

        StringBuilder comp=new StringBuilder();
        int n = word.length();
        int i = 0;
        int cnt = 1;
        while(i < n){
            char currentChar = word.charAt(i);
            cnt = 0;
            while(i < n && word.charAt(i)==currentChar  && cnt<9){
                cnt++;
                i++;
            }
            comp.append(cnt).append(currentChar);
        }   
        return comp.toString();
    }
}
````