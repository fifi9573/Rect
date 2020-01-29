// Declare private class variables length and width as doubles.
// Create a default constructor that sets the length to 1 and width to 2.
// Create a constructor that sets the length and width of your rectangle to the input.
// Create area, perimeter, diagonalLength, isASquare (should return true if the rectangle is a square, false otherwise), setLength, setWidth, getLength, getWidth methods.

// Test your class using the Main class by instantiating 3 Rectangle objects:
// rect1 should call on the default constructor
// rect2 should have length of 4 and width of 5
// rect3 should have length and width of 6
// Print the length, width, area, perimeter, diagonalLength, and result of isASquare of each rectangle object you created. Make it pretty, i.e. The length of rect1 is: 1, etc.


//Name: Fiona Tong
//Date: 11/8/18
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("The length of rect1 is: "+rect1.getLength());
        System.out.println("The width of rect1 is: "+rect1.getWidth());
        System.out.println("The area of rect1 is: "+rect1.area());
        System.out.println("The perimeter of rect1 is: "+rect1.perimeter());
        System.out.println("The diagonal length of rect1 is: "+rect1.diagonalLength());
        System.out.println(rect1.isASquare());
        
        System.out.println();
        
        Rectangle rect2 = new Rectangle(4,5);
        System.out.println("The length of rect2 is: "+rect2.getLength());
        System.out.println("The width of rect2 is: "+rect2.getWidth());
        System.out.println("The area of rect2 is: "+rect2.area());
        System.out.println("The perimeter of rect2 is:"+rect2.perimeter());
        System.out.println("The diagonal length of rect2 is: "+rect2.diagonalLength());
        System.out.println(rect2.isASquare());
    
        System.out.println();
        
        Rectangle rect3 = new Rectangle(6,6);
        System.out.println("The length of rect3 is: "+rect3.getLength());
        System.out.println("The width of rect3 is: "+rect3.getWidth());
        System.out.println("The area of rect3 is: "+rect3.area());
        System.out.println("The perimeter of rect3 is:"+rect3.perimeter());
        System.out.println("The diagonal length of rect3 is: "+rect3.diagonalLength());
        System.out.println(rect3.isASquare());
    
        System.out.println("");
    
        Rectangle rect4 = new Rectangle(3,4);//to string method
        System.out.println(rect4);
        
        System.out.println("");

        System.out.println(rect1.equals(rect2));// equals method
    }
}
