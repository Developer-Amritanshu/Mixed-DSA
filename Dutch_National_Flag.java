
// Dutch National Flag

public class DNF {
  public static void main(String[] args) {
    int[] arr = {0,1,1,0,0,2,1,0,1,1,2,2,2,2};
    
    int low = 0;
    int mid =0;
    int high = arr.length-1;
    int temp = 0;
    
    while(mid<=high){
      if(arr[mid]==0){
        temp = arr[low]; 
        arr[low] = arr[mid]; 
        arr[mid]=temp;
        low++;
        mid++;
      }
      else if(arr[mid]==1){
        mid++;
      }else {
        temp = arr[high];
        arr[high] = arr[mid];
        arr[mid]=temp;
        high--;
      }
    }

    for(int p : arr){
      System.out.print(p+" ");
    }
  }
}
