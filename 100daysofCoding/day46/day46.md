# String Interning and Immutability

## What is Interning
String interning is when string is associated same address of a string which is already present in the string pool or intern pool 
![[interning.png]]
## Why ? 
too save space 

## To prevent it we use New keyword
- When we use the new keyword we can avoid having the same memory address, and have  a new string with same value
- But in actual there is a character array that is also present in the pool and when creating through new we assign a the same character array but pointing is different.
![[Pasted image 20241128204108.png]]


# Implications 
## Comparisions
- Well if we are making strings through this new keyword the problem comes up when checking equal strings with the equal operator.
- If in our previous example we check both the strings we will have a true condition for s1 and s2 but it will be false for s3 as the equal operator only checks for the memory address. 
- To tackle this problem it is advised to use .equals function which is provided by Java. This is interesting and it actually gives us more insight into strings and how they are created.
s1== s2
s1 == s3

## Immutability

immutability is when something can't be changed 

- Reference is mutable, instance is not.
![[Pasted image 20241128204859.png]]

- Immutability is an important characteristic of strings as because of interning if two or more strings are pointing to one address or memory location then by changing one variable it would reflect in every string
- Because of this reason in cases when traversing the string if we change or concatenate the string in a simple loop single n case it would it twice the time just because new string will be created
# Length of last word
```java
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0; // Initialize the length of the last word
        int i = s.length() - 1; // Start from the last character

        // Skip any trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count the length of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}

```