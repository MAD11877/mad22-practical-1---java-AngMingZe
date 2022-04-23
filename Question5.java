import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    List<Integer> nList = new ArrayList<>();

    //System.out.print("Enter integer: ");

    int counter = in.nextInt();

    for(int i = 0; i < counter; i++){
      //System.out.print("Enter integer: ");
      nList.add(in.nextInt());
    }

    int count1 = 0; 
    int count2 = 0; 
    int m1 = 0; //Current mode
    int m2 = 0; //Mode to be comapared

    for (int m = 0; m < nList.size(); m++){
      
      m1 = nList.get(m);
      count1 = 0;
      
      for(int j = 0; j < nList.size() + 1;j++){
        if (m1 == nList.get(j)) count1++; //Gets total count of 'm' number 
      }
      if (count1 > count2){
        m2 = m1;
        count2 = count1;
      }  
      
    }

    System.out.print(m2);
    
  }
}
