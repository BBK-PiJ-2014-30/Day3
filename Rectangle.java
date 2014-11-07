/**
 * Created by devon on 07/11/2014.
 */
import java.util.Scanner;

public class Rectangle {


    public static void main ( String args []){

        Scanner input = new Scanner ( System.in);
        System.out.println(" the program will commute the area and the perimeter of a rectangle from the width and length ");
        System.out.println(" please input the length: ");
        int rectangleValue1 = input.nextInt ();
        System.out.println(" please input the width: ");
        int rectangleValue2 = input.nextInt ();


        Rect d = new Rect(rectangleValue1,rectangleValue2);
        System.out.println(" the Area of the rectangle is: " +d.getArea() );
        System.out.println(" the perimeter of the rectangle is: " +  d.getPerimeter());



        }




}
}

