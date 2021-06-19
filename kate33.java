/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
 {
 public static void main (String[] args) throws java.lang.Exception
 {
       Random rand = new Random();
         int a = rand.nextInt(899) + 100;
         int first = a / 100;
         int secondBegin = a / 10;
         int second = secondBegin % 10;
         int third = a % 10;
          if (first > second && first > third) 
            {
            System.out.println (first);
            } 
          else if (second > first && second > third) 
             {
             System.out.println (second);
             } 
          else
             {
              System.out.println (third);
             }
    }
  }