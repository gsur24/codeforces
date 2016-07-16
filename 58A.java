import java.util.*;
import java.io.*;
public class 58A {
   public static boolean word (String s) {
      char[] charArray = s.toCharArray();

      for (int i = 0; i < charArray.length; i++) {
         if (charArray[i] == 'h') {
            for (int j = i + 1; j < charArray.length; j++) {
               if (charArray[j] == 'e') {
                  for (int k = j + 1; k < charArray.length; k++) {
                     if (charArray[k] == 'l') {
                        for (int l = k + 1; l < charArray.length; l++) {
                           if (charArray[l] == 'l') {
                              for (int m = l + 1; m < charArray.length; m++) {
                                 if (charArray[m] == 'o') {
                                    return true;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      return false;
   }
   public static void main(String args[]) {

      Scanner s = new Scanner(System.in);
      String string = s.nextLine();
      if (word(string)) {
         System.out.println("YES");
      }
      else {
         System.out.println("NO");
      }
   }
}
