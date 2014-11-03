/**
 * Created by devon on 18/10/2014.
 */
import java.util.Scanner;
public class YourChangePlease {
    /** This program computes the value of goods purchased here by calculating the total of items purchased
        and dividing it from the cash given for the cost of the items giving the change*/
    static double total;
    static double purchase;
    static double invalidInput;

    public static void main ( String arg []){

        System.out.println(" Welcome to Shoes Are Us!");
        System.out.println(" We hope we have what you want and your shopping experience is a pleasant one here!");
        System.out.println(" 1. Doctor Martins     £ 20.99 ");
        System.out.println(" 2. Timberland         £ 24.99 ");
        System.out.println(" 3. Black Adidas Neros £ 20.99 ");
        System.out.println(" 4. Cat Boots          £40.50 ");
        System.out.println(" 5. Snow Nike          £18.20");
        System.out.println(" 6. Fire Nike          £12.20");
        System.out.println(" 7. Plan Black Shoes   £5");
        System.out.println(" If you would like to purchase an item please input corresponding number ");
        Scanner value = new Scanner ( System.in);
        double itemOfPurchase  = value.nextDouble();

        while ( itemOfPurchase != 0){// takes the value of the users purchase and adds it to any other purchase.

            invalidInput = itemOfPurchase;
            if ( itemOfPurchase ==1){
               purchase = 20.99;

                total = purchase+ total;
            }
            if ( itemOfPurchase ==2){
                purchase = 24.99;

                total = purchase+ total;
            }
            if ( itemOfPurchase ==3){
                purchase = 20.99;

                total = purchase+ total;
            }
            if ( itemOfPurchase ==4){
                purchase = 40.50;

                total = purchase+ total;
            }
            if ( itemOfPurchase ==5){
                purchase = 18.20;

                total = purchase+ total;
            }
            if ( itemOfPurchase ==6){
                purchase = 12.20;

                total = purchase+ total;
            }
            if ( itemOfPurchase ==7) {
                purchase = 5;
                total = purchase+ total;
            }
            if ( invalidInput !=1|| invalidInput!=3 ||invalidInput !=4 || invalidInput !=5 ||invalidInput !=6 || invalidInput !=7 ) {
                System.out.println(" incorrect number typed. please try again");// if incorrect input value is typed directs user to try again.
            }

            System.out.println(" If you would like to purchase another item, please press corresponding number:  ");
            System.out.println("otherwise press 0 to enter Payment Screen: " );
            itemOfPurchase  = value.nextDouble();// takes another purchase for user or user can end purchase session by pressing zero.



        }

        String total2DecimalPlace = String.format("%.2f",total);// round total of to the second decimal place.

        System.out.println(" the cost of the items is:  " + total2DecimalPlace); // prints the total cost of purchased items.

        System.out.println(" Please input the amount of legal tender for purchase that represent notes and pence");
        double legalTender  = value.nextDouble();

        if ( legalTender < total){// the condition tests if cash given for item equals the value or is more
        // that the value of the purchase. if not tells user that the value imputed isn't not enough for the purchased items.

            System.out.println("Cash inputted is not enough for the purchased items. please try again  ");
            System.out.println (" Cost for items is :" + total);
            legalTender  = value.nextDouble();
        }
        double change = legalTender-total;// divides the cash given for the items by the cost of the items and
        // stores the result as the value of change for the users

        String s = String.format( "£%.2f", change); // rounds off the cash given for the item from dividing the
        // cash from the cost to the second nearest decimal place
        System.out.println("Thanks for shopping with us. here is your cash " + s);// displays the users change to the 2nd nearest decimal point.


    }
}
