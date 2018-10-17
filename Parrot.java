import java.util.Scanner;

public class Parrot {

    Scanner scan = new Scanner(System.in);

// Properties
    String parrotName;
    String parrotColor1;
    String parrotColor2;
    int timesTalked = 0;
    boolean isRunning = true;
    String space = "";

// Constructors
    public Parrot(String name, String color1, String color2) {
        this.parrotName = name;
        this.parrotColor1 = color1;
        this.parrotColor2 = color2;
    }

// Getters
    public String getName() {
        return this.parrotName;
    }

    public String getColor1() {
        return this.parrotColor1;
    }

    public String getColor2() {
        return this.parrotColor2;
    }

// Abilities
    public String talk() {
        System.out.println("Type 'end' to stop the program");
        while (isRunning) {
            String repeat = scan.nextLine();

            if (repeat.equals("end")) {
                isRunning = false;
                break;
            }

            System.out.println(this.parrotName + " says " + repeat);
            System.out.println("");
            this.timesTalked = this.timesTalked + 1;
            
            if (timesTalked >= 3) {
                System.out.println("Squawk!");
                this.timesTalked = 0;
            }       
        }
        return space;
    }
}