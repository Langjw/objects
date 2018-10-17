public class Cat {

// Properties
    String catName;
    String color;
    String meow;
    int catHappiness = 100;
    int feed;
    int timesScolded = 0;
    String space = "";

// Constructor(s)
    public Cat(String name, String color) {
        this.catName = name;
        this.color = color;
    }

// Getters
    public String getName() {
        return this.catName;
    }

    public String getColor() {
        return this.color;
    }

// Abilities
    public String meow() {
        System.out.println("Meow!");
        return space;
    }

    public int pet() {
        System.out.println("You have petted " + this.catName);
        System.out.println(this.catName + "'s happiness has dropped by 50%");
        this.catHappiness = this.catHappiness - 50;
        return this.catHappiness;
    }

    public int scold() {
        System.out.println("You have scolded " + this.catName);
        this.timesScolded = this.timesScolded + 1;
        return this.timesScolded;
    }

    public int feed() {
        if (timesScolded < 3) {
            System.out.println("You have fed " + this.catName);
            System.out.println("You do not notice a difference in happiness.");
        }
        else if (timesScolded >= 3) {
            System.out.println("You have fed " + this.catName);
            System.out.println(this.catName + " has gained 10% happiness");
            this.catHappiness = this.catHappiness + 10;
            this.timesScolded = 0;
        }
        return this.catHappiness;
    }

}