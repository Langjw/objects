import java.util.Scanner;

public class DogTester {


    public static void main(String[] args) { 
        Dog rover = new Dog("Rover", "Dalmation", 1);
        Cat susan = new Cat("Susan", "Black");
        Parrot dave = new Parrot("Dave", "Blue", "Green");
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Who would you like to play with today? (Dog, Cat, or Parrot)");

        String whichPet = scan.nextLine();

        if (whichPet.equals("Dog")) {
            System.out.println("What would you like to do? (Bark, Pet, Scold, Eat)");

            String dogActivity = scan.nextLine();

            if (dogActivity.equals("Bark")) {
                System.out.println(rover.bark());
            }

            else if (dogActivity.equals("Scold")) {
                System.out.println(rover.scold());
            }

            else if (dogActivity.equals("Pet")) {
                System.out.println(rover.pet());
            }

            else if (dogActivity.equals("Eat")) {
                System.out.println(rover.eat());
            }
        }

        if (whichPet.equals("Cat")) { 
            System.out.println("What would you like to do? (Meow, Pet, Scold, Feed)");

            String catActivity = scan.nextLine();

            if (catActivity.equals("Meow")) {
                System.out.println(susan.meow());
            }

            else if (catActivity.equals("Pet")) {
                System.out.println(susan.pet());
            }

            else if (catActivity.equals("Scold")) {
                System.out.println(susan.scold());
            }

            else if (catActivity.equals("Feed")) {
                System.out.println(susan.feed());
            }
        }
        if (whichPet.equals("Parrot")) {
            System.out.println("What would you like to say to Dave?");
            System.out.println(dave.talk());

        }
    }
}