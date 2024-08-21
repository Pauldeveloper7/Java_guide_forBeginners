/*If you dont want a subclass to access a superclass member , give that member private access . the private members of the subclass to access a superclass member , give that member private access  
 * There are four types of access specifier 
 *  public
 * private 
 * protected 
 * default ( or package )
*/
class Base {
    private int num1 ; // Private member 
    public void setData(int n){
        num1 = n ; // private member  accessed within the class
    }
    public int getData(){
        return num1 ;
    }
}
class Derived extends Base {
    int num2 ;
    public void product(){
        // to get value stored in private member num1 
        int num = getData();
        System.out.println("Product =" (num2*num));
    }
    public void DerivedShow(){
        System.out.println(" Number 2 = "+num2);
    }
}
public class PrivateInheritance{
    public static void main(String[] args){
        Derived d = new Derived();
        d.setData();
        d.num2 = 10;
        d.product();

    }
}