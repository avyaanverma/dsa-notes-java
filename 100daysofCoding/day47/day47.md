# String Builder


```java
class Solution {
    public void reverseString(char[] s) {
        int a = 0;
        int b = s.length-1;
        while(a<b){
            char c = s[a];
            s[a] = s[b];
            s[b] = c;
            a++;
            b--;
        }
    }
}
```
# Remove Duplicate letters
