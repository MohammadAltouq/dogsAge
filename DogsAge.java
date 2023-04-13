
import java.util.Scanner;

class DogsAge {
  public static void main(String[] args) {

    Scanner stdin = new Scanner(System.in);
    int humansAge;
    int dogeAge;
    
    System.out.print("Enter the dogs age in human years: ");
    humansAge = stdin.nextInt();
    
    dogeAge = humansAge * 7;
    
    System.out.println("Your dog is " + dogeAge + " Years old");
    
  
  }
}