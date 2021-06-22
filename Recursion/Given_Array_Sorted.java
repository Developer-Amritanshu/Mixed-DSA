public class Given_Array_Sorted {
  public static void main(String[] args) {
    int arr[] = {10,20,90,1100,120};
    int idx =0;
    int ans = isSorted(arr,idx);
    if(ans!=-1){
      System.out.println("Array Is Sorted");
    } else{
      System.out.println("Array Is Not Sorted");
    }
  }

  private static int isSorted(int[] arr, int idx) {
    if(idx==arr.length-1){
      return arr[idx];
    }
    int ans1 = isSorted(arr,idx+1);
    if(arr[idx]<ans1){
      return arr[idx];
    }else{
      return -1;
    }
  }
}
