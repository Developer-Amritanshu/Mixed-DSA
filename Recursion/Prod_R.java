public class Product_R {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    int idx = 0;
    int res = prod(arr,idx);
    System.out.println(res);
  }

  private static int prod(int[] arr, int idx) {
    if(arr.length==idx){
      return 1;
    }
    int pr = prod(arr,idx+1);
    int res = arr[idx] * pr;
    return res;
  }
}
