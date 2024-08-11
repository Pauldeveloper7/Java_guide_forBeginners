import java.util.Scanner; 

class HelloWorld {
    public static void main(String[] args) {
        int a, b, choice;
        System.out.println("Welcome to this program");
        System.out.println("\nWhich operation do you want to perform?");
        System.out.println("\nFor addition type 1 \nFor Subtraction type 2 \nFor Multiplication type 3 \nFor Division type 4");
        while(ans==true){
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
        System.out.println("\n Do you want to re-run this program ?");
        ans = input.nextChar()
        }
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


/*
 import javax.swing.*;

class HelloWorld {
    public static void main(String[] args) {
        // Welcome message
        JOptionPane.showMessageDialog(null, "Welcome to this program");

        // Asking for the operation choice
        String choice = JOptionPane.showInputDialog("Which operation do you want to perform?\n" +
                "For addition type 1\n" +
                "For Subtraction type 2\n" +
                "For Multiplication type 3\n" +
                "For Division type 4");

        int ch = Integer.parseInt(choice);

        // Asking for the two integer values
        String first = JOptionPane.showInputDialog("Enter value of the first integer:");
        int a = Integer.parseInt(first);
        String second = JOptionPane.showInputDialog("Enter value of the second integer:");
        int b = Integer.parseInt(second);

        Program programref = new Program();
        String resultMessage = "";

        // Performing the chosen operation
        switch (ch) {
            case 1:
                resultMessage = "The sum of two numbers is " + programref.sum(a, b);
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
                resultMessage = "Invalid choice";
        }

        // Displaying the result
        if (!resultMessage.isEmpty()) {
            JOptionPane.showMessageDialog(null, resultMessage);
        }
    }
}

class Program {
    public int sum(int a, int b) {
        return a + b;
    }

    public void sub(int a, int b) {
        int sub = a - b;
        JOptionPane.showMessageDialog(null, "The subtraction of two numbers is " + sub);
    }

    public void divide(int a, int b) {
        if (b == 0) {
            JOptionPane.showMessageDialog(null, "Division by zero is not allowed.");
            return;
        }
        int divide = a / b;
        JOptionPane.showMessageDialog(null, "The division of two numbers is " + divide);
    }

    public void multiply(int a, int b) {
        int multiply = a * b;
        JOptionPane.showMessageDialog(null, "The multiplication of two numbers is " + multiply);
    }
}
 */