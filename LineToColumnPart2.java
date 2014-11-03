/**
 * Created by devon on 03/11/2014.
 */
    import java.util.Scanner;
public class LineToColumnPart2 {
    public static void main ( String args[]){

        Scanner input = new Scanner ( System.in);
        String usersInput = input.nextLine();
        System.out.println(usersInput);
        String space = " ";
        int count = usersInput.length();
        int position1 = 0;
        int position2 = 1;

        while ( count != 0){

           System.out.print( usersInput.substring(position1,position2)+space);
           position1++;
           position2++;
           count--;



       }

    }
}
