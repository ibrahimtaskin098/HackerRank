
package sortingalistofnumber;


public class SortingAListOfNumber {

  
    public static void main(String[] args) {
        int number [] = { 80,40,55,65,71,76,123,987};
   int n = number.length;
   
  System.out.print("Given List: ");
    for (int i=0;i<n;i++){
     System.out.print(" "+ number[i]);
}
        System.out.print("\n");
   for(int i=0; i<n;i++){
       for(int j=i+1;j<n;j++)
           if(number[i]<number[j]){
               int temp = number[i];
               number[i]=number[j];
               number[j]=temp;
           }
   }
   
         System.out.print("Sorted list: ");
   for(int i=0;i<n;i++){
       System.out.print(" " +number[i]);
   }
        System.out.println("\n");
    }
    
}