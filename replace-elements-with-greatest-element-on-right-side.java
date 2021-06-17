class Solution {
    public int[] replaceElements(int[] arr) {
    int[] suffixMax =new int[arr.length];

    suffixMax[arr.length-1] = arr[arr.length-1];
    for(int i =arr.length-2;i>=0;i--){
      suffixMax[i] = Math.max(suffixMax[i+1], arr[i]);
    }

    int[] returnArray = new int[arr.length];
    returnArray[returnArray.length-1] = -1;
    for(int i = arr.length-2;i>=0;i--){
      returnArray[i] = suffixMax[i+1];
    }

    return returnArray;
    }
}
