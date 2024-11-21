- Java does not support Multiple interface but it provides a way to do it through interfaces. 
- The problem with multiple interfaces is that it won't know which method to run while executing the objects functions 
### Java Interface is a pure 100% abstract class 

```java
// PET
abstract void beFriendly();
abstract void play();
```
### To Define an Interface
```java
public interface Pet {...}
```
### To Implement an Interface
```java
public class Cat extends Animal implements Pet {...}
```

## Interface vs Abstract Class 
- Interace is a pure abstract class but it is used for multiple inhertiance rather than just a blueprint. Abstract class on the other is just a blueprint for classes and it can inherited by another subclass with it extending it's functions. 
- A class can interface multiple interfaces but can extend only one class. 
- We cannot create a constructor for interfaces but we can create constructor for subclasses.
