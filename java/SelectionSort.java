import java.util.Random;

public class SelectionSort 
{
  /** The method for sorting the numbers */
   public static void selectionSort(double[] list) 
   {    
      int comparisonCnt = 0, swapCnt = 0;   
      for (int i = 0; i < list.length - 1; i++) 
      {
      // Find the minimum in the list[i..list.length-1]no 
         double currentMin = list[i];
         int currentMinIndex = i;

         for (int j = i + 1; j < list.length; j++) 
         {
            if (currentMin > list[j]) 
            {
               currentMin = list[j];
               currentMinIndex = j;
            }
         }

      // Swap list[i] with list[currentMinIndex] if necessary;
         if (currentMinIndex != i) 
         {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
            swapCnt++;
         }
         comparisonCnt++;
      }
      System.out.println("Comaprison Count: " + comparisonCnt + "\nSwap Count: " + swapCnt);
  }
  
   public static void main(String[] args)
   {
      Random rnd= new Random();
    
      final int NUM_ELEMENTS= 1000;
      double [] lo2Hi = new double [NUM_ELEMENTS];
      double [] hi2Lo = new double [NUM_ELEMENTS];
      double [] random = new double [NUM_ELEMENTS];
      int i, j;
      
      for(i = 0; i < NUM_ELEMENTS ; i++)
         lo2Hi[i] = (double)i;
     
      for(j = 0, i = NUM_ELEMENTS; j < NUM_ELEMENTS; j++, i--)
         hi2Lo[j] = (double)i;
         
      for(i = 0; i < NUM_ELEMENTS ; i++)
         random[i] = rnd.nextDouble();
         
      /*Input Check
      
      for(i = 0; i < NUM_ELEMENTS ; i++)
         System.out.print(lo2Hi[i] + " ");
         
      System.out.print("\n ");
         
      for(i = 0; i < NUM_ELEMENTS ; i++)
         System.out.print(hi2Lo[i] + " ");
      
      System.out.print("\n");
      
      for(i = 0; i < NUM_ELEMENTS ; i++)
         System.out.print(random[i] + " ");
      
      System.out.print("\n");
      */
      
      selectionSort(lo2Hi);
      selectionSort(hi2Lo);
      selectionSort(random);
      
      /*Output Check
      
      for(i = 0; i < NUM_ELEMENTS ; i++)
         System.out.print(lo2Hi[i] + " ");
         
      System.out.print("\n");
         
      for(i = 0; i < NUM_ELEMENTS ; i++)
         System.out.print(hi2Lo[i] + " ");
      
      System.out.print("\n");
      
      for(i = 0; i < NUM_ELEMENTS ; i++)
         System.out.print(random[i] + " ");
      
      System.out.print("\n");
      */
   }
}
