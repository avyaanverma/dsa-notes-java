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