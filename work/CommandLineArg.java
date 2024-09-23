// 7) Illustrate the use of command line argument. question --35
import java.util.Scanner ;
public class CommandLineArg{
  public static void main(String[] args){
    Scanner inputdata = new Scanner(System.in);
    int firstnum , secondnum ;
    System.out.println("\n Enter the first number ");
    firstnum = inputdata.nextInt();
    System.out.println("\n Enter second number");
    secondnum = inputdata.nextInt();
    int result = firstnum+secondnum;
    System.out.println("\n Sum of "+ firstnum + " and " + secondnum +" is ---> " +result);
    inputdata.close();
  }
}