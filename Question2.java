import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    public static void main(String args[]) { 
    Scanner in = new Scanner(System.in);
    System.out.print("Enter height: ");
    
    double height = in.nextDouble();
    System.out.println("Your height is: " + height);

    System.out.print("Enter weight: ");
    double wei = in.nextDouble();
    System.out.println("Your weight is: " + wei);

    double bmi = wei/(double) Math.pow(height/100, 2);
    double bmiRounded2 = (double) Math.round(bmi * 100) / 100;
    
    System.out.println("Your bmi is: " + bmiRounded2);
  }
}

