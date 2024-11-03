# String Data Type 

![DataTypes](https://media.geeksforgeeks.org/wp-content/uploads/20240809125618/Java-Data-Types.png?autoSizes=true)

## String is a Non-Primitive Data Type

| 		    | Primitive Data Types  | Reference Data Types  |
|-----------|-----------|-----------|
| Memory Allocation  | Stored in the Stack memory  | Stored in the heap memory while the reference to the object is stored in the stack  |
| Value vs Reference  | Hold the actual value of the variable  | Hold a reference (memory address) to the location where the object is located   |
| Default Values  | Have predefined default values.  | The default value  is null if not initialized explicitly. |
| Data Type  | These are predefined by the Java language. They hold the actual values | These refer to objects created from classes, such as Strings, arrays, or custom objects. They hold references to the objects  |


- We have total 8 primitive data types are there in Java.

- And all of them are stored in the stack memory 

- We have to understand JVM and in JVM we have different memory types. All the primitive types are stored in Stack. 

- For Reference Types we other names : User Defined, Object 


```java
main(){
	int i =0;
	String S= "Java";
	// actual object will be stored in the Heap
	// Only the reference/memory address will be stored in the Stack	
}

```



- To understand JVM we have this : https://www.geeksforgeeks.org/how-many-types-of-memory-areas-are-allocated-by-jvm/


- In Java, a String is a sequence of characters, but unlike primitive types such as int or char, String is a reference type.

String -> char c = 'J'


## Key characteristics of a String in Java: 


### Immutable
Immutability means that once a String object is created, it cannot be changed. Any operation that seems to modify a String (like concatenation) actually creates a new String object.

Ref D.T 
-- Immutable --> String
-- Mutable --> arrays

### Stored in the String Pool

- Java maintains a special memory area called String Pool(part of the heap). When you create a String literal, the JVM first checks if that literal already exists in the pool.

- If it does, the reference to the existing object is returned. If not, the JVM adds the new String to the pool.

### Created via Literals or Objects
- Using literals (eg String s = "Hello";) which are stored in the String Pool.
- Using the new keyword (eg String s = new String("hello")) which forces Java to create a new object in the heap even if an identical string exists in the pool.

```java
public static void main(String args[]){

	int i = 1;
	int j = 2;
	char c = 'J';
	String S1 = "Java";
	String S2 = "Java";
	String S3 = new String("Java");
}
```

- For the above code we have the following stack
| main ()|
|--------| 
|String S3;| 
|String S2;| 
|String S1;| 
|char c = 'J';|
| int j = 2; | 
|   int i =1;| 



## String vs Array
| 		    | Array  | String  |
|-----------|-----------|-----------|
| Mutability  | Mutable  | Immutable  |
| Data Type  | can hold primitive as well as reference  | holds a sequence of characters |
| Length  | Fixed at creation. | Dynamic with new strings being created. |
| Methods  | Few methods use Arrays class | Rich set of built-in manipulation methods |


## Methods and Utility

The String class provides a wide range of utility methods for manipulating strings, such as 

length(),

substring(),

toUpperCase(),

toLowerCase(),

replace(),

concat(), and many more.

## Programs 

Write a program that demonstrates the immutability of strings and mutability of arrays in Java. 


- We are first writing program in python to understand logic
```python 
# [1,2,3] --> [3,2,1]

S1 = "Java"
S2 = "Java"
print(S1)

# both of S1 and S2 will have memory address same.
print(id(S1)) 
print(id(S2))

# But S3 will have memory address different.
S1 = S1 + "Java"
print(id(S1))


L1 = [1,2,3]
print(L1)
print(id(L1))

L1.append(4)
print(id(L1)) 

```

- As Java is a secure language we can't directly do the same thing.

```java
 main(){

 	// for Strings
 	String S1 = "Java";
 	System.out.println(System.identityHashCode(S1));

 	String S2 = "Java";
 	System.out.println(System.identityHashCode(S2));

 	String S3 = new String("Java");
 	System.out.println(System.identityHashCode(S3));

 	S1 = S1 + "Program";


 	// for Arrays
	int[] L1 = new int[n];
 	System.out.println(System.identityHashCode(S1));

 	String S2 = "Java";
 	System.out.println(System.identityHashCode(S2));

 	String S3 = new String("Java");
 	System.out.println(System.identityHashCode(S3));

 	S1 = S1 + "Program";


 }
```