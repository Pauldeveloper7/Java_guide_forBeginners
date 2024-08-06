package practice;
/* write a program to display the following output
********************************************************
*  Program :To add two numbers                         *
*           Author :Ankur Sharma                       *
*  Due Date :  Wednesday , June 09                     *
********************************************************
*/
public class detail {
    public static void main(String[] args) {
        int width = 56;
        
        // Print the top border
        for (int index = 0; index < width; index++) {
            System.out.print("*");
        }
        System.out.println();
        
        // Print the program details
        System.out.println("*  Program : To add two numbers                       *");  
        System.out.println("*           Author : Ankur Sharma                     *");  
        System.out.println("*  Due Date : Wednesday , June 09                     *");  
        
        // Print the bottom border
        for (int index = 0; index < width; index++) {
            System.out.print("*");
        }
        System.out.println();
    }   
}
