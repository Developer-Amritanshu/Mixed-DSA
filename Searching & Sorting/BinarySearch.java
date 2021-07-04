public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = {2,3,4,10,40};
    int searchElement = 10;
    int index = binaryearch(arr,searchElement);
    if(index==-1){
      System.out.println("Not found");
    }else{
      System.out.println("Found at: "+index);
    }
  }

  private static int binaryearch(int[] arr, int searchElement) {
    int left = 0;
    int right = arr.length -1;
    while(left<=right){
      int mid = (left+right)/2;
      if(arr[mid]==searchElement){
        return mid;
      }else if(arr[mid]<searchElement){
        left = mid+1;
      }else if(arr[mid]>searchElement){
        right= mid-1;
      }
    }  
    return -1;
  }
}
