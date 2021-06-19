import java.util.Arrays;

public class Median_Of_Two_Sorted_Array {
  public static void main(String[] args) {
    int[] arr1 = {2, 3, 5, 8};
    int[] arr2 = {10, 12, 14, 16, 18, 20};
    int[] mergedArray = new int[arr1.length+arr2.length];
    int k = 0;

    for(int i=0;i<mergedArray.length;i++){
      if(i<arr1.length){
        mergedArray[i] = arr1[i];
      }else{
        mergedArray[i] = arr2[k];
        k++;
      }
    }

    Arrays.sort(mergedArray);

    if(mergedArray.length%2!=0){
      System.out.println(mergedArray[mergedArray.length/2]);
    }else{
      System.out.println((mergedArray[mergedArray.length/2]+mergedArray[(mergedArray.length/2) -1])/2);
    }


  }
}
