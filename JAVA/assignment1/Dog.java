package assignment;

public class Dog {
	
	private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    // Setter for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Method to display the dog's details
    public void displayDogDetails() {
        System.out.println("Name: " + name + ", Breed: " + breed);
        System.out.println();
    }    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "German Shepherd");

        // Displaying their initial details
        dog1.displayDogDetails();
        dog2.displayDogDetails();

        // Modifying the attributes using setter methods
        dog1.setName("budy");
        dog1.setBreed("Labrador");

        dog2.setName("max");
        dog2.setBreed("Bulldog");	

        // Displaying the updated details
        dog1.displayDogDetails();
        dog2.displayDogDetails();		

	}

}
