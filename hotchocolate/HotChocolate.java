
package hotchocolate;

import java.util.concurrent.TimeUnit;

public class HotChocolate {
    
    public static final double tooHot = 185;
    public static final double tooCold = 160;
    public static void drinkHotChocolate(double cocoaTemp) throws TooHotException,
            TooColdException{
        if (cocoaTemp >= tooHot){
            throw new TooHotException();
        }else if(cocoaTemp<= tooCold) {
            throw new TooColdException();
        }
    }
    
      public static void main(String[] args) throws InterruptedException {
       double currentCocoa = 160;
       boolean wrongTemp = true;
       while(wrongTemp){
            try{
            drinkHotChocolate(currentCocoa);
            System.out.println("It is perfect coffee.");
            wrongTemp = false;
            
        }catch(TooHotException e1){
            System.out.println(" The coffee is too hot.");
            currentCocoa = currentCocoa = -5;
        }catch(TooColdException e2){
            System.out.println("The coffee is too cold.");
            currentCocoa = currentCocoa + 5;
        }
         TimeUnit.SECONDS.sleep(2);
       }
        System.out.println(" Coffee done.");
    }
}
