// 6) Explain the creation and use of a user defined class. question -- 39 
class Usum {
    public static void main(String[] args) {
        System.out.println("Name :Komal Paul ,Roll Number : 226902  ");
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
