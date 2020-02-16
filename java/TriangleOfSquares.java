import java.util.Scanner;
public class TriangleOfSquares 
{
   public static void main(String[] args) 
   {
        while (true)
        {
            Scanner input = new Scanner(System.in);
      
            System.out.print("Enter a number between 1 and 9: ");
            int number = input.nextInt();
            System.out.println();
        
            if (number < 0)
            {
               System.out.print("Input is invalid. ");
               continue;
            }
            else if (number > 9)
            {
               System.out.print("Input is invalid. ");
               continue;
            }
            else 
            {
               for (int i = number; i > 0; i--) 
               {
                  for (int j = number; j > 0; j--)
                  System.out.print((number - j + 1) < i ? "   " : String.format("%3d", j * j));
                  System.out.println();
               }
               for (int i =1; i < number; i++) 
               {  
                  System.out.print("   ");
                  for (int j = number-1; j > 0; j--)
                  System.out.print((number - j) < i ?  "   " : String.format("%3d", j * j));            
                  System.out.println();
               }
            break; 
            }
        }
    }
}