import java.util.*;
import java.io.*;
public class watermelon {

   public static String divide (int weight) {
      if (weight % 2 == 0 && weight > 2) {
         return "YES";
      }
      return "NO";
   }
   public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      int i;
      i = s.nextInt();

      System.out.println(divide(i));

   }
}
