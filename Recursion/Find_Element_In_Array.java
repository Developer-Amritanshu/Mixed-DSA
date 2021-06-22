public class Find_Element_In_Array {
  public static void main(String[] args) {
    int arr[] = {10,20,30};
    int idx = 0;
    int data = 50;
    boolean isFound = FEIA(arr,idx,data);
    System.out.println(isFound);
  }

  private static boolean FEIA(int[] arr, int idx, int data) {
    if(arr.length == idx){
        return false;
    }

    if(arr[idx]==data){
      return true;
    }

   boolean b =  FEIA(arr,idx+1,data);
   return b;   
  }
}
