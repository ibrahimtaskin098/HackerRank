
package javastringtoken;

import java.util.Arrays;
import java.util.Scanner;


public class StringToken {
          public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String s = scanner.nextLine().replaceAll("[^A-Za-z]+", " ").replaceAll("^\\W+","");
             
     
       String[] str = s.split("\\W");
//              System.out.println(Arrays.toString(str));
//              System.out.println(str.length);
           if(s.length()<=0){
               System.out.println(0);
           }else{
               System.out.println(str.length);
               for(int i =0 ; i< str.length; i++){
                   System.out.println(str[i]);
               }
           }
           
            
               
    }
}