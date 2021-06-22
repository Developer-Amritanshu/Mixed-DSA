public class All_Indices {
  public static void main(String[] args) {
    int x = 3;
    int arr [] = {2,3,6,9,8,3,2,3,6,4};
    int idx = 0;
    int fsf =0;
    int[] res = AI(arr,x,idx,fsf);
    for(int a:res){
      System.out.println(a);
    }
  }

  private static int[] AI(int[] arr, int x, int idx, int fsf) {
    if(arr.length == idx){
      return new int[fsf];
    }
    if(arr[idx]==x){
      int iarr[]= AI(arr,x,idx+1,fsf+1);
      iarr[fsf] = idx;
      return iarr;
    }else{
      int iarr[]= AI(arr,x,idx+1,fsf);
      return iarr;
    }
  }
}
