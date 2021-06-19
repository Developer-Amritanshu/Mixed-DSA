public class Prduct_Array_Puzzle {
  public static void main(String[] args) {
    int[] arr = {10,3,5,6,2};
    PAP(arr);
  }

  private static void PAP(int[] arr) {
    int prod = 1;
    for(int i =0;i<arr.length;i++){
      prod*=arr[i];
    }
    for(int i =0;i<arr.length;i++){
      int result = (int) (prod * Math.pow(arr[i],-1));
      System.out.print(result+" ");
    }
  }
}
