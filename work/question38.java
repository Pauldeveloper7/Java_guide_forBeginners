// 10) Shows the use of switch statement in terms of conditional branching . question -- 38
import java.util.Scanner; 

class Question38 {
    public static void main(String[] args) {
        int a, b, choice;
        System.out.println("Welcome to this program");
        System.out.println("\nWhich operation do you want to perform?");
        System.out.println("\nFor addition type 1 \nFor Subtraction type 2 \nFor Multiplication type 3 \nFor Division type 4");
      
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        System.out.println("Enter value of two intergers to perform action");
        a = input.nextInt();
        b = input.nextInt();
        
        Program programref = new Program();
        switch (choice) {
            case 1:
                programref.sum(a, b);
                break;
            case 2:
                programref.sub(a, b);
                break;
            case 3:
                programref.multiply(a, b);
                break;
            case 4:
                programref.divide(a, b);
                break;
            default:
                System.out.println("Invalid choice");
        }
        input.close();
    }
}

class Program {
    public int sum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of two numbers is " + sum);
        return sum;
    }

    public void sub(int a, int b) {
        int sub = a - b;
        System.out.println("The subtraction of two numbers is " + sub);
    }

    public void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }
        int divide = a / b;
        System.out.println("The division of two numbers is " + divide);
    }

    public void multiply(int a, int b) {
        int multiply = a * b;
        System.out.println("The multiplication of two numbers is " + multiply);
    }
}
