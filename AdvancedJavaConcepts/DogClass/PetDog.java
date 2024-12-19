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