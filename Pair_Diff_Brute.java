
// Brute force
class Pair_Diff_Brute{
  public static void main(String[] args) {
    int[] arr = {11,2,8,5,7,9,6,12};
    int diff = 2;
    for(int i =0;i<arr.length-1;i++){
      for(int j = i+1;j<arr.length;j++){
        if(arr[i]-arr[j] == diff){
          System.out.println(arr[i]+" "+arr[j]);
        }
      }
    }
  }
}
