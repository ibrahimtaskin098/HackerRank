
package anagram;

import java.util.Arrays;
import java.util.Scanner;


public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next().toLowerCase();
        String b = scanner.next().toLowerCase();
        if (a.length()== b.length()) {
        String[] array = a.split("");
        Arrays.sort(array);
        String[] array1 = b.split("");
        Arrays.sort(array1);
        int count = 0;
        
       for(int i =0; i < array.length ; i++){
           if(array[i].equals(array1[i])){
           count++;
       }
           
       }
       if(count == array.length){
               System.out.println("Anagrams");
       }else{
               System.out.println("Not Anagram");
           }
             
           
        } else {
            System.out.println("Not Anagrams");
        }
    }

}



//another process

/* class NewClass {
         static boolean isAnagram(String a, String b){
             if(a.length()!= b.length()){
                 return false;
             } else{
                 char[] char1 = a.toLowerCase().toCharArray();
                 char[] char2 = b.toLowerCase().toCharArray();
                 boolean anagram = true;
                 Arrays.sort(char1);
                 Arrays.sort(char2);
                 for(int i =0; i<char1.length; i++){
                     if (char1[i]!= char2[i]){
                         anagram = false;
                     }
                 }
                 return anagram;
             }
         }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();
        boolean result = isAnagram(a,b);
        System.out.println( (result) ? "Anagrams" : "Not Anagrams" );
    }
}

*/
