# Valid Palindrome
```java
class Solution {

    public boolean isPalindrome(String str) {

        String s = str.toLowerCase();

  

        int left = 0;

        int right = s.length() - 1;

        while (left <= right) {

            char first = s.charAt(left);

            char last = s.charAt(right);

            if (!Character.isLetterOrDigit(first))

                left++;

            else if (!Character.isLetterOrDigit(last))

                right--;

  

            else {

                if (first != last) {

                    return false;

                }

                right--;

                left++;

            }

        }

        return true;

    }

}
```

```java
class Solution {
    public boolean isPalindrome(String s) {
        int start = 0, end = s.length()-1;
     //   s = s.toLowerCase();
        char letter1 = ' ', letter2 = ' ';
        while(start < end) {
            letter1 = s.charAt(start);
            letter2 = s.charAt(end);
            if(letter1 >= 'A' && letter1 <= 'Z') {
                letter1 = (char) (letter1 + 32);
            }
            if(letter2 >= 'A' && letter2 <= 'Z') {
                letter2 = (char) (letter2 + 32);
            }
            if( (letter1 < 'a' || letter1 > 'z') && ( letter1 < '0' || letter1 > '9') ) {
                start++;
            }
            else if( (letter2 < 'a' || letter2 > 'z') && ( letter2 < '0' || letter2 > '9') ) {
                end--;
            }
            else if(letter1 != letter2) {
                return false;
            }
            else {
                start++;
                end--;
            }
        }
        return true;
    }
}
```