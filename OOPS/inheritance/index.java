import java.util.Scanner; 
 public class Main{
    public static void main(String[] args){
        Circle  Circlearea = new Circle();
        Circlearea.setradius();
        Circlearea.getx();
        Circlearea.gety();
        Circlearea.getradius();
        Circlearea.area();

    }

}
/*What is inheritance ?
 Inheritance  organize classes in a hierarchical form . 
 The inclusion of the members  of the existing class in a new class so that they are accessible
 in the new class is known as CLASS INHERITANCE   
 or we can say 
 Inheritance is a technique of creating a new class from existing class by inheritance all the features of the existing class and adding additional features of its own .
 ** the main advantage of inheritance is reusabality of the code . 

 */
// Lets consider an example
 class Point{
Scanner inputdata = new Scanner(System.in);
      int x , y ;
     void getx(){
         System.out.println("\n Enter the value of x :");
        int x = inputdata.nextInt();
     System.out.println("The value of x is "+ x);
     }
     void gety(){
        System.out.println("\n Enter the value of y");
        int y = inputdata.nextInt();
        System.out.println("The value of y is "+ y);
    }
}
/*The syntax to extend a class is 
 * class Subclassname extends SuperClassName {
 // Additional member declaration   
 }
 */
class Circle extends Point {
    int r ;
    int setradius(){
        System.out.println("Enter the radius of circle");
        r = inputdata.nextInt();
       return r;
    }
    void getradius(){
        System.out.println("The value of radius is"+ r);
    }
    void area(){
        double pi = Math.PI;
        double  area = pi*r*r;
         System.out.println("The area of the circle is "+ area);

    }
}