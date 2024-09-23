// 2) Takes input from a user and displays it on the screen using the graphical mode of input/output (JOptionPaneclass) question--34
import javax.swing.*;
public class TextDisplay{
  public static void main(String args[]) {
    System.out.println("Name :Komal Pual , Roll No :226902");
    String name   =  JOptionPane.showInputDialog("Enter your name");
    if(name instanceof String){
        System.out.println(name);
    }
    else{
      System.out.println("\n It should be a String ");
    }
  }
}