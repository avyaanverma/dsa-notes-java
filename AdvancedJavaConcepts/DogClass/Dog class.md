
By Avyaan Verma
22BCE10007
main class code 


```java
public class Dog {

    String name;

    String breed;

    int age;

    int size;

  

    // static member to count the number of dog instances

    static int numberOfDogs = 0;

  

    // constructor

    Dog() {

        // Increment the static counter

        numberOfDogs++;

    }

  

    Dog(String name, int age, String breed, int size) {

        this.name = name;

        this.age = age;

        this.breed = breed;

        this.size = size;

  

        // Increment the static counter

        numberOfDogs++;

    }

  

    void displayDetails() {

        System.out.println("Name: " + name);

        System.out.println("Age: " + age);

        System.out.println("Breed: " + breed);

        System.out.println("Size: " + size);

        System.out.println();

    }

  

    static int getNumberOfDogs() {

        return numberOfDogs;

    }

  

    void eat() {

        System.out.println("The dog is eating");

    }

  

    void sleep() {

        System.out.println("The dog is sleeping");

    }

  

    void bark() {

        System.out.println("The dog is barking");

    }

  

    void play() {

        System.out.println("The dog is playing");

    }

    public static void main(String[] args) {

        Dog dog1 = new Dog("Buddy", 3, "Golden Retriever", 30);

        Dog dog2 = new Dog("Max", 2, "German Shepherd", 40);

        Dog dog3 = new Dog("Rocky", 1, "Poodle", 20);

        dog1.displayDetails();

        dog2.displayDetails();

        dog3.displayDetails();

        dog3.bark();

        System.out.println("The total number of dogs: " + Dog.getNumberOfDogs());

    }

}
```
OUTPUT
![[Pasted image 20241202095027.png]]

------
## Subclass PetDog

```java
public class PetDog extends Dog {

    private static int totalPetDogs = 0;

    private String ownerName;

  

    public PetDog(String name, int age, String breed, int size, String ownerName) {

        super(name, age, breed, size);

        this.ownerName = ownerName;

        totalPetDogs++;

    }

  

    public static int getTotalPetDogs() {

        return totalPetDogs;

    }

  

    public void displayOwnerDetails() {

        System.out.println("Owner's Name: " + ownerName);

        displayDetails();

    }

  

    public static void main(String[] args) {

        PetDog petDog1 = new PetDog("Buddy", 3, "Golden Retriever", 30, "Alice");

        PetDog petDog2 = new PetDog("Max", 2, "German Shepherd", 40, "Bob");

  

        petDog1.displayOwnerDetails();

        petDog2.displayOwnerDetails();

  

        System.out.println("Total PetDogs: " + PetDog.getTotalPetDogs());

    }

}
```

OUTPUT

![[Pasted image 20241202095546.png]]

---

