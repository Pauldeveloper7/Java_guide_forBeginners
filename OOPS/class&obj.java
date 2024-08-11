class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
       Program  programref = new Program();
        System.out.println(programref.sum());
    }
}
// Use this editor to write, compile and run your Java code online
 class Program{
    int a = 10;
    int b = 20;
    public int sum(){
      int sum =   a+b;
      System.out.println("The sum of two number is "+ sum);
      return sum;
    }
}