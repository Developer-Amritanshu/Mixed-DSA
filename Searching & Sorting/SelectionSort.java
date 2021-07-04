public class SelectionSort {
  public static void main(String[] args) {
    int arr[] = {5,4,3,2,1};
    selectionSort(arr,arr.length);
    sortedArray(arr,arr.length);
  }

  private static void sortedArray(int[] arr, int n) {
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }

  private static void selectionSort(int[] arr, int n) {
    for(int i=0;i<n-1;i++){
      int min = i;
      for(int j=i+1;j<n;j++){
        if(arr[j]<arr[min]){
          min =j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
  }
}
