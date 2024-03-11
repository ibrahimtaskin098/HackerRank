
package maxabsolutedifferentbetweentwoint;

public class AnotherProcess {
      public static void main(String[] args) {
         int [] ary = {10, 45, 28, 189 ,9 , 4 , 7,9,4,3};
         int result = fixarray(ary);
           System.out.println(result);
    }
    public static int fixarray(int[] ary){
        if (ary.length==0 ){
            throw new IllegalArgumentException(" The array size is zero.");
        }
        int maxnum = ary[0];
        for( int i=0 ; i<ary.length; i++){
            if(maxnum<ary[i]){
                maxnum = ary[i];
            }
        }
        return maxnum;
    }
}
