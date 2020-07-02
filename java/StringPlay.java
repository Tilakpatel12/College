import java.util.*;
public class StringPlay {
    public static void main (String[] args) {
     Scanner input = new Scanner (System.in);
     System.out.println("Please enter a line of text at least seven characters long:" );
     String text= input.nextLine();
     int length= text.length();
     String trimmed= text.trim();
     int newLength=trimmed.length();
     
     
   
     if(length < 7) {
         System.out.println("The input is too short");
     }
     else {
         if(newLength<length) {
             System.out.println("the original String has leading or trailing whitespace.");
         }
         else {
             System.out.println("the original String has no leading or trailing whitespace.");
         }
         String t2=text.substring(0, 2);
         String t3=text.substring(length-5);
         String t4=text.substring(2,length-5);
         System.out.println(t3 + t4 + t2);
         System.out.println(text.toUpperCase());
         if(length%2 !=0) {
             System.out.println("The line has an odd number of characters.");
         }
         else {
             int middle=(length-(length/2));
             String t5=text.substring(middle,middle++);
             System.out.println(t5);
             
         }
         }
     }
}