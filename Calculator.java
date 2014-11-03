/**
 * Created by devon on 03/11/2014.
 */
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {

        Scanner calculator = new Scanner ( System.in);
        System.out.println(" please key in two number.");

        int userInput1 = calculator.nextInt();

        int userInput2 = calculator.nextInt();


        System.out.println(" Menu");
        System.out.println(" 1. Add ");
        System.out.println(" 2. Substract");
        System.out.println(" 3. Multiple ");
        System.out.println(" 4. Divide");
        System.out.println(" Pick from menu what maths operator you ");
        System.out.println ("would like to apply to the two numbers inputted");
        double userInput3 = calculator.nextInt();
        int num1 =1;
        int num2 =2;
        int num3 =3;
        int num4 =4;

        if ( userInput3== num1){
            System.out.println ( userInput1+ userInput2);



        }
        if ( userInput3== num2){
            System.out.println ( userInput1- userInput2);
        }
        if ( userInput3==num3){
            System.out.println ( userInput1* userInput2);



        }
        if ( userInput3==num4){
            System.out.println(userInput1/ userInput2);



        }
        else
            System.out.println ( " i was expected a digit from 1 to 4 to be inputted");
    }

}




