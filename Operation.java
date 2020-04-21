import javax.swing.*;
import java.util.Random;

public class Operation {
   
   public static void main(String[] args) {
      
      int number1, number2, userInteger, answer;
      Random rnd = new Random();
      number1 = rnd.nextInt(9) + 1;
      number2 = rnd.nextInt(9) + 1;
      
      WidgetViewer wv = new WidgetViewer();
      
      JLabel label= new JLabel("x= " + number1 + " and y= " + number2);
      wv.add( label, 255, 30, 300, 20);

      JLabel label2= new JLabel("Enter an operation number:");
      wv.add(label2 , 255, 60, 300, 20);
      
      JTextField textField= new JTextField();
      wv.add( textField, 250, 100, 300, 20);
      
      JButton button= new JButton("Press here when you've entered your operation.");
      wv.addAndWait(button);

      String operation= textField.getText();
      
      userInteger = Integer.parseInt(operation);
      JLabel label3;
      if (userInteger >= 1 && userInteger <= 10)
      {
         label3 = new JLabel("x * y = " + (number1 * number2));
         wv.add(label3 , 255, 120, 300, 20);
      }
      else if (userInteger % 4 == 0)
      {
         label3 = new JLabel ("x + y =" + (number1 + number2));
         wv.add(label3 , 255, 120, 300, 20);
      }
      else if (userInteger % 5 == 0)
      {
         label3 = new JLabel ("Float y / x = " + (((float)number2/(float)number1)));
         wv.add(label3 , 255, 120, 300, 20);
      }  
      else if (userInteger % 2 == 0)
      {
         label3 = new JLabel ("Integer y / x =  " + (number2/number1));
         wv.add(label3 , 255, 120, 300, 20);
      }
      else
      {
         label3 = new JLabel ("y - x = " + (number2 - number1));
         wv.add(label3 , 255, 120, 300, 20);
      }
   }
}
