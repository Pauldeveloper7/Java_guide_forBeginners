// 11) Explain the creation and use of a user defined class. question -- 39 
class Question39 {
    public static void main(String[] args) {
        System.out.println(" WElcome to the code ");
       Sum  programref = new Sum();
        System.out.println(programref.add());
    }
}
  class Sum{
   private  int a = 10;
   private  int b = 20;
    public int add(){
      int sum =   a+b;
      System.out.println("The sum of two number is "+ sum);
      return sum;
    }
}
