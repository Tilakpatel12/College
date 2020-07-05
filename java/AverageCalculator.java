public class AverageCalculator
{
   private int count;
   private int sum;
   
   public AverageCalculator() 
   {
      sum = 0;
      count = 0;
   }
   public void add(int newNum)
   {
      sum = sum + newNum;
      count++;  
   }
   public int getSum()
   {
      return sum;
   }
      
   public int getCount()
   {
      return count;
   }
   
   public double getAverage()
   {
      if(count == 0)
         return 0;
      else 
         return (double) (sum)/(count);
   }
}
   
   