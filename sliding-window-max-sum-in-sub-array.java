// Sliding Window Max Sum in SubArray

package Sliding_Window;

public class Max_Sum_SubArray_Of_Size_K {
  public static void main(String[] args) {
    int[] arr = {100, 200, 300, 400};
    int k = 2;
    int size = arr.length;
    int max_sum = 0;
    for(int i = 0;i<k;i++){
      max_sum += arr[i];
    }

    int window_sum = max_sum;

    for(int i = k;i<size;i++){
      window_sum+=arr[i]-arr[i-k];
      max_sum = Math.max(max_sum, window_sum);
    }

    System.out.println(max_sum);
  }
}
