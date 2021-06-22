public class Last_Index_OR {
  public static void main(String[] args) {
    int arr[] = {2,3,6,9,8,3,2,3,6,4};
    int idx = 0;
    int data = 3;
    int ans = LastIO(arr,idx,data);
    System.out.println(ans); 
  }

  private static int LastIO(int[] arr, int idx, int data) {
    if(arr.length == idx){
      return -1;
    }
    int liio = LastIO(arr,idx+1,data);
    if(liio==-1){
      if(arr[idx]==data){
        return idx;
      }else{
        return -1;
      }
    }else{
      return liio;
    }
  }
}
