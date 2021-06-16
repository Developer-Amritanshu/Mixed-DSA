// Distinct Element

public class Distinct_elements {
  public static void main(String[] args) {
    int[] arr = {1, 4, 3, 2};
    for(int i=0;i<arr.length-1;i++){
      if(i==0){
        if(arr[i]>arr[i+1]){
          int temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
        }
      } 
        else if(i%2!=0){
          if(arr[i]<arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
          }
        }else{
          if(arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
          }
        } 
    }
    for(int p:arr){
      System.out.print(p+" ");
    }
  }
}
