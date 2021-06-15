import java.util.Arrays;

// Approach 2 - Sort nLogn

public class Pair_Sum_Sort {
  public static void main(String[] args) {
    int[] myArray = {7,8,6,5,4,2,15}; // [2,4,5,6,7,8,15]
    Arrays.sort(myArray);
    int k = 9;
    int i =0;
    int j = myArray.length-1;

    while(i<j){
      if(myArray[i]+myArray[j]==k){
        System.out.print(" ["+myArray[i]+" "+myArray[j]+"] ");
      }

      if(myArray[i]+myArray[j]>k){
        j--;
      }else{
        i++;
      }

    }

  }
}
