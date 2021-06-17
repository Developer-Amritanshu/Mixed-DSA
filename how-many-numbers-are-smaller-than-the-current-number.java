class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
      
    int[] storeArray = new int[101];
    int[] returnArray = new int[arr.length];
    
    for(int i =0;i<arr.length;i++){
      if(storeArray[arr[i]] >= 1){
        storeArray[arr[i]] += 1 ;
      }else{
        storeArray[arr[i]] = 1;
      }
    }
    // prefix sum calculation
    for(int i =1;i<storeArray.length;i++){
      storeArray[i] = storeArray[i-1]+ storeArray[i];
    }

    for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
          returnArray[i] = 0;
        }else{
          returnArray[i] = storeArray[arr[i]-1];
        }
    }
        
        return returnArray;
    }
}
