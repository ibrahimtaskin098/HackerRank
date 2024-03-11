package maxabsolutedifferentbetweentwoint;

import java.util.Scanner;

public class Scope {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int arraySize = scanner.nextInt();
        int maxint = 0;
        int minint = 100;
        int[] elementArray = new int[arraySize];
        for (int i = 0; i < elementArray.length ; i++) {
                 elementArray[i] = scanner.nextInt();
               int result = elementArray[i];
               if (result> maxint){
                   maxint = result;
                
               }
               if(minint>result){
                   minint = result;
               }
               
        }
        int maxDifferent = maxint - minint;
        System.out.println(maxDifferent);
    }
}
