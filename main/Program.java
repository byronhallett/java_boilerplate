import java.util.Scanner;

public class Program {

  // MARK: Properties
  public String programName;

  // MARK: main
  // Begin program lifecycle
  public static void main(String[] args) {
    // Rename as appropriate
    Program p = new Program();
  }

  // MARK: Initializer:
  Program() {
    // Set-up code
    programName = "Program";
    exampleInputLoop();
  }

  // MARK: program methods
  private void exampleInputLoop() {
	  Scanner scan = new Scanner(System.in);
	  while (true) {
      try {
        System.out.println("Please enter a fish:");
        Float num = scan.nextFloat();
        if (num < 0) {
          System.out.println(num);
          scan.close();
          return;
        }
      } catch (Exception e) {
        // no error, just loop
      }
    }
 }
}
