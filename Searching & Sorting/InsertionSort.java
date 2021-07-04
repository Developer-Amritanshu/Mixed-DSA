public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = {10,3,7,5,2};
    insertionSort(arr,arr.length);
    sortedArray(arr,arr.length);
  }

  private static void sortedArray(int[] arr, int length) {
    for(int i=0;i<length;i++){
      System.out.print(arr[i]+" ");
    }
  }

  private static void insertionSort(int[] arr, int length) {
    for(int i=1;i<length;i++){
      int temp = arr[i];
      int j = i-1;
      while(j>=0&&arr[j]>temp){
        arr[j+1] = arr[j];
        j=j-1;
      }
      arr[j+1] = temp;
    }
  }
}
