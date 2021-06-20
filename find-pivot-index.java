class Solution {
    public int pivotIndex(int[] arr) {
    int[] prefixSum =new int[arr.length] ;
    prefixSum[0] = arr[0];
    for(int i =1;i<arr.length;i++){
      prefixSum[i] = prefixSum[i-1]+arr[i];
    }

    int[] suffixSum =new int[arr.length] ;
    suffixSum[arr.length-1] = arr[arr.length-1];
    for(int i =arr.length-2;i>=0;i--){
      suffixSum[i] = suffixSum[i+1]+arr[i];
    }
    int index=-1;
    for(int i=0;i<arr.length;i++){
      if(prefixSum[i]-suffixSum[i]==0){
        index = i;
        break;
      }
    }
    return index;
    }
}
