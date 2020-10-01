import java.util.Scanner;
/**
 * Sets a number grade to letter grade
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates scanner for user input
    Scanner input = new Scanner(System.in);

    //gets letter grade from user
    System.out.println("Please enter a letter grade");
    String grade = input.nextLine();

    //uses switch case statement to determine number grade
    switch(grade){
      case "A":
       System.out.println("This is between 80% and 100%");
       break;
      case "B":
       System.out.println("This is between 70% and 79%");
       break;
      case "C":
       System.out.println("This is between 60% and 69%");
       break;
      case "D":
       System.out.println("This is between 50% and 59%");
       break;
      case "F":
       System.out.println("This is between 0% and 49%");
       default:
       System.out.println("invalid character, make sure letter is uppercase");
       

    }
    
  }
}
