import java.util.Scanner;

public class Question3
{
  public static final int power = 2;
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in); 
    System.out.print("Enter integer: ");
    int num = in.nextInt();
    num = (int) Math.pow(num,power);
    System.out.println("Number ** 2 is " + power);
    
  }
}
