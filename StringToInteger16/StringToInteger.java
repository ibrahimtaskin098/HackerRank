
package StringToInteger16;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
       
        New.method();
    }
   
}


class New{
    public static void method(){
         Scanner scanner = new Scanner(System.in);
    try{
        String str = scanner.next();
    scanner.close();
    int i = Integer.parseInt(str);
        System.out.println(i);  
        
    }catch(Exception e){
        System.out.println("Bad String");
        e.printStackTrace();
    }
       
    }
    
}