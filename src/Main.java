public class Main {
private int x; // Class attribute

// Class constructor
public Main() {
        x = 5; // Set initial value for x as 5
        }

public static void main(String[] args) {
        Main myObj = new Main(); // Create an object of class Main
        System.out.println("Value of x: " + myObj.getX()); // Print the value of x using a getter method
        }

// Getter method to access the value of x
public int getX() {
        return x;
        }
        }