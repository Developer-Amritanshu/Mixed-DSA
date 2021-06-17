class Solution {
    public int trap(int[] arr) {
    int[] prefixMax = new int[arr.length];
    int[] sufixMax = new int[arr.length];

    if(arr.length==0){
        return 0;
    }
        
    prefixMax[0] = arr[0];
    for(int i =1; i<arr.length;i++){
      prefixMax[i] = Math.max(prefixMax[i-1],arr[i]);
    }

    sufixMax[arr.length-1] = arr[arr.length-1];
    for(int i =arr.length-2; i>=0;i--){
      sufixMax[i] = Math.max(sufixMax[i+1],arr[i]);
    }

    // Prefix Print
    // for(int p:prefixMax){
    //   System.out.print(p+" ");
    // } 

    // System.out.println();
    
    // Suffix Print
    // for(int p:sufixMax){
    //   System.out.print(p+" ");
    // }

    int amountOfWater = 0;
    for(int i =0;i<arr.length;i++){
      int ch = Math.min(prefixMax[i],sufixMax[i]);
      if(ch>arr[i]){
        amountOfWater+=ch-arr[i];
      }
    }
    
    return amountOfWater;
    }
}
