public class Max_R {
  public static void main(String[] args) {
    int arr[] ={11,2,5,4,3};
    int idx = 0;
    int max = MAXR(arr,idx);
    System.out.println(max);
  }

  private static int MAXR(int[] arr, int idx) {
    if(arr.length-1==idx){
      return arr[idx];
    }
    int max = MAXR(arr,idx+1);
    int finalAns = arr[idx] > max?arr[idx]:max;
    return finalAns;
  }
}
