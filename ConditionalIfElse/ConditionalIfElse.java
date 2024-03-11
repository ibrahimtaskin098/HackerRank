/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConditionalIfElse;

import java.util.Scanner;


public class ConditionalIfElse {
    public static void main(String[] args) {
        
      int n;
      Scanner scanner = new Scanner(System.in);
      n = scanner.nextInt();
      if((n>=1 && n<=100)&& n%2 !=0){
          System.out.println("Weird");
          
      }else if((n>=2 && n<=5) && n%2 ==0){
          
          System.out.println("Not Weird");
      }else if ((n>=6 && n<=20) && n%2 ==0){
          System.out.println("Weird");
      }else if ((n>=20 && n<=100)&& n%2==0){
          System.out.println("Not Weird");
      }
     
    }



 
    
    
}
      



