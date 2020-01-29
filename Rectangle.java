// Declare private class variables length and width as doubles.
// Create a default constructor that sets the length to 1 and width to 2.
// Create a constructor that sets the length and width of your rectangle to the input.
// Create area, perimeter, diagonalLength, isASquare (should return true if the rectangle is a square, false otherwise), setLength, setWidth, getLength, getWidth methods.

// Test your class using the Main class by instantiating 3 Rectangle objects:
// rect1 should call on the default constructor
// rect2 should have length of 4 and width of 5
// rect3 should have length and width of 6
// Print the length, width, area, perimeter, diagonalLength, and result of isASquare of each rectangle object you created. Make it pretty, i.e. The length of rect1 is: 1, etc.


public class Rectangle{
    
    private double length = 1.0; 
    private double width = 2.0;
  
    public Rectangle(){
        
    }
    
    public Rectangle(double lenA,double widA){
        length = lenA;
        width = widA;
    }
    
   
    public double getLength(){
        return length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double diagonalLength(){
        double radical = Math.pow(width,2)+Math.pow(length,2);
        double diagonal = Math.sqrt(radical);
        return diagonal;
    }
    
    public double area(){
        double a = width*length;
        return a;
    }
    
    public double perimeter(){
        double p = (2*width)+(2*length);
        return p;
    }
    
    
    
    public String isASquare(){
       if(length==width){
           String flag = "This is a square.";
           return flag;
       }else{
           String flag = "This is not a square.";
           return flag;
       } 
    }
    
    public String toString(){
        return "The length of this rectangle is "+length+" and the width is "+width+".";
    }
    
    public boolean equals(Rectangle rect1){
		if(length==rect1.getLength() && width==rect1.getWidth()){
		    return true;   
		}else{
		    return false;
		}
	}

}
