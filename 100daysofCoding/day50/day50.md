# Redistribute characters to make all strings equal 
```java
class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length == 1) return true;

        int totalCntChar = 0;
        for(String s : words){
            totalCntChar += s.length();
        }

        if(totalCntChar % words.length != 0) return false;


        int[] cnt = new int[26];
        for (int i = 0; i < words.length; i++) {
            String current = words[i];
            for (int j = 0; j < words[i].length(); j++) {
                int chr = words[i].charAt(j);
                int indx = (int)(chr - 'a');

                cnt[indx] += 1;
            }
        }

        // traverse hashmap
        int n = words.length;
        for (int letter : cnt) {
            if (letter % n != 0)
                return false;
        }

        return true;
    }
}
```