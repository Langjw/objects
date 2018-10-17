public class Dog {

// Properties
    String name;
    String breed;
    String bark;
    String sayHi;
    int tagNumber;
    int happiness = 100;
    int eat;
    String space = "";

// Constructor(s)
    public Dog(String name, String breed, int tagNumber) {
        this.name = name;
        this.breed = breed;
        this.tagNumber = tagNumber;
    }

// Getters
    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getTagNumber() {
        return this.tagNumber;
    }
// Setters
    public void setName() {
        this.name = name;
    }

    public void setBreed() {
        this.breed = breed;
    }

    public void setTagNumber() {
        if (tagNumber > 0) return;

        this.tagNumber = tagNumber;
    }

// Abilities
    public String bark() {
        System.out.println("Woof!");
        return space;
    }

    public String sayHi() {
        System.out.println("Woof, my name is " + this.name);
        return space;
    }

    public int pet() {
        if (this.happiness >= 100) {
            System.out.println(this.name + " has full happiness");
        } 
        else if (this.happiness < 100) {
            this.happiness = this.happiness + 10;
            System.out.println(this.name + " has recieved a pet from you and is now 10% happier.");
        }
        return this.happiness;
    }

    public int scold() {
        System.out.println("You have scolded " + this.name);
        System.out.println(this.name + " is now 20% less happy");
        this.happiness = this.happiness - 20;
        return this.happiness;
    }

    public int eat() {
        if (this.happiness > 25) {
            System.out.println("You have fed " + this.name);
            System.out.println(this.name + " has gained 20% happiness");
            this.happiness = this.happiness + 20;
        }
        else if (this.happiness < 25) {
            System.out.println(this.name + " is not happy enough to eat, try petting themm to increase happiness");
        }
        return this.happiness;
    }


}