// Approach 2 - o(logn)

class Solution {
    public int search(int[] arr, int find) {
    int index = findMin(arr, 0, arr.length-1);
    
    int result1 = BS(arr,0,index,find);
    int result2 = BS(arr,index,arr.length-1,find);

    if(result1==-1 &&result2==-1){
      return -1;
    }
    return result1!=-1?result1:result2;
    }
static int findMin(int arr[], int low, int high)
    {
        // This condition is needed to handle the case when array
        // is not rotated at all
        if (high < low)  return 0;
 
        // If there is only one element left
        if (high == low) return low;
 
        // Find mid
        int mid = low + (high - low)/2; /*(low + high)/2;*/
 
        // Check if element (mid+1) is minimum element. Consider
        // the cases like {3, 4, 5, 1, 2}
        if (mid < high && arr[mid+1] < arr[mid])
            return mid+1;
 
        // Check if mid itself is minimum element
        if (mid > low && arr[mid] < arr[mid - 1])
            return mid;
 
        // Decide whether we need to go to left half or right half
        if (arr[high] > arr[mid])
            return findMin(arr, low, mid-1);
        return findMin(arr, mid+1, high);
    }

  private static int BS(int[] arr, int start, int end, int find) {
    while(start<=end){
      int mid = start+(end-start)/2;
      if(arr[mid] == find){
        return mid;
      }else if(arr[mid]<find){
        start = mid+1;
      }else{
        end = mid-1;
      }
      mid = start+end /2;
    }
    return -1;
  }

}
