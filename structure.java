//  i will define structure of java program sequentially
// 1)
// documentation section which contains comments to tell the program purpose 
// comments can be of three types  
// 1) Single line comment  - // 2) Multi line comment /*  */ 3) Documentation section  - /**  */
 
/**     **2PACKAGE STATEMENT** - java allow you to group classes in a collection known as pack .
 * use case -- package employeee 
 */
// package employeee ;
/** IMPORT STATEMENT : import statement is used for reffering classes that are declared in other packages 
 */
// import java.util.Date;
/* 4) interface section  */
// An interface is similar to a class but contains only constants and method declarations .
interface stack {
    void push(int item);
    int pop();
}
// 5 )  CLASS section 
public class structure{
    public static void main(String[] args) {
        System.out.println("The first argument is :" + args[0]);
        System.out.println("Hello World");
        System.out.println("This is my first Java program");
    }
}