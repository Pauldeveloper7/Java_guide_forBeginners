// 9) Performs various operations applicable on two or more string . question --37
import java.util.Scanner ;

public class Stringopt{
     public static void main(String[] args) {

         String quote  = new String("Life is a journey not a destination so be water my friend , just go with flow ");
         System.out.println("The quote of the day is "+ quote);
         // a function to get the length of the string 
         int stringlength = quote.length();
         System.out.println("The length of the string is "+ stringlength);
         //a function to get a specific alphabet in the quote 
         try {
           Scanner inputdata = new Scanner(System.in);
           int specificint = inputdata.nextInt();
           char specificchar = quote.charAt(90);

           System.out.println("The char at "+ specificint + " is " + specificchar);
           inputdata.close();
          } catch (Exception e) {
            System.out.println("Something went wrong while getting the char specific location ");
          }

          // 
    }
}