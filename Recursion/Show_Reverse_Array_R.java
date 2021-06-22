public class Show_Reverse_Array_R {
  public static void main(String[] args) {
    int arr[]  = {1,2,3,4,5};
    int idx = 0;
    SRA(arr,idx);
  }

  private static void SRA(int[] arr, int idx) {
    if(idx==arr.length){
      return;
    }
    SRA(arr,idx+1);
    System.out.println(arr[idx]);
  }
}
