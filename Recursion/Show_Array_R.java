public class Show_Array_R {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    int idx = 0;
    showArr(arr,idx);
  }

  private static void showArr(int[] arr, int idx) {
    if(idx == arr.length){
      return;
    }
  System.out.println(arr[idx]);
  showArr(arr,idx+1);
  }
}
