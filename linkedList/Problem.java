
package linkedList;

import java.util.LinkedList;
import java.util.Scanner;


public class Problem {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
    LinkedList<Integer> lists = new LinkedList();
       int a = scanner.nextInt();
    for(int i=0; i<a; i++){
    int b = scanner.nextInt();
    lists.add(b);
}
    for(Integer list : lists){
            System.out.print(list+" ");
           
}
        System.out.println(" ");
    }
   
}
