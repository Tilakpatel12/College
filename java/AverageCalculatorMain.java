public class AverageCalculatorMain
{
   public static void main(String[] args)
   {
      AverageCalculator object1 = new AverageCalculator();
      object1.add(3);
       
      System.out.println("Object 1 - Sum:" + object1.getSum());
      System.out.println("Object 1 - Count:" + object1.getCount());
      System.out.println("Object 1 - Average:" + object1.getAverage());
      
      AverageCalculator object2 = new AverageCalculator();
      object2.add(10);
      object2.add(15);
      object2.add(33);
       
      System.out.println("Object 2 - Sum:" + object2.getSum());
      System.out.println("Object 2 - Count:" + object2.getCount());
      System.out.println("Object 2 - Average:" + object2.getAverage());
   }
}
   