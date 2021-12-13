/*importing scanner from java util package*/
import java.util.Scanner;

public class RectangleArea{

    public static void main(String [] args){
        //create Scanner object called sc
        Scanner sc = new Scanner(System.in);

        System.out.println("the area will be shown here");

        //prompt the user to enter length followed by breadth
        System.out.println("Enter length followed by breadth to calculate area of the rectangle :");
        double length=sc.nextDouble();
        double breadth=sc.nextDouble();

        //create class object for Area class
        Area obj1 =new Area(length,breadth);

        //use obj1 to get area from the return area method from the Area class
        System.out.println("The Area of a rectangle with length "+length+" and breadth "+breadth+" is "+obj1.returnArea());

        sc.close();


    }
}

class Area{
    //creating data fields
    private double length,breadth;
    private double area;

    //creating Area class constructor with length and breadth as parameters
    Area(double len,double breadt){
        length=len;
        breadth=breadt;
    }

    //the method that calculates and returns area given length and breadth
    public double returnArea(){
    area=length*breadth;
    return area;
    }
}