# Strings 
Basics  
	https://www.youtube.com/watch?v=_jM3iMT4k7g&list=PL-Jc9J83PIiFIKbdCKuYwsV8KaX-jHe0V&index=2
```java
String s = ""

// to get char at i 
s.charAt(2);
s.charAt(2);

// to get substring
s.substring()

// to get all substrings of a string
for(int i=0;i<s.length()-1;i++){
	for(int j=i+1;j<=s.length();j++){
		System.out.println(s.substring(i,j));
	}
}

// check what value is 
sop("hello" + 10 + 20);
sop(10 + 20 + "hello" );

// to split a string in array 
String[] parts = s.split(" ");

```


# Print all Palindromic Substrings
* to print all substrings we use two for loops 
* to check if string is palindromic we can use two pointer method and compare equal characters 

```
public static Boolean isPalindromic(String s){
	int left = 0;
	int right = s.length()-1;
	while(left<=right){
		if(s.charAt(left)!=s.charAt(right)) return false;

		left++;
		right--;
		
	}
	return true
}

public static void main(){
	s = "helloworldletsdoit"
	for(int i=0;i<s.length();i++){
		for(int j=i+1;j<s.length()+1;j++){
			String subs = s.substring(i,j);
			if(isPalindromic(subs)) System.out.println(subs)
		}
	}
}
```
# Length of last word