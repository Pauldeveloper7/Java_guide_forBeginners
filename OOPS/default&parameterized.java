public class Program{
    public static void main(String[] arg){
        System.out.println("welcome to this program");
        Student objref = new Student("komal paul", 22);
        objref.print();
    
    }
}
class Student{
    private String name;
    private int rollNo;
    //standard setters
    public void setName(String name){
        this.name = name;
    }
    //Note the masking of class level variable rollNo
    public void setRollNo(int rollNo){
        if(rollNo>0){
            this.rollNo = rollNo;
        }
        else{
            this.rollNo = 100;
        }
    }
    //standard getters
    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }
    /* Constructor that uses a default value instead of taking an argument*/
    // public Student(){
    //     name = "not set";
    //     rollNo = 100;
    // }
    //parameterized Constructor for a new student 
    public Student(String name,int rollNo){
        setName(name);      // call to setter of name 
        setRollNo(rollNo); // call to setter of rollNo
    }
    public void print(){
        System.out.println("Student name :"+name+" and roll number is "+ rollNo);
    } //end of class
}