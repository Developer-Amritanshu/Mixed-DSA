// Zero One

public class zero_one {
  public static void main(String[] args) {
    int[] arr = {0,1,1,0,1,0,1};
    int j = arr.length-1;
    int i = 0;
    while(i<j){
      if(arr[i] == 1){
        if(arr[j]==0){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }else{
          j--;
        }
      }else{
        i++;
      }
    }
    for(int p:arr){
      System.out.print(p+" ");
    }
  }
}
