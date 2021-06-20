class Solution {
    public boolean canPartition(int[] nums) {
        return canPartitionP(nums);
    }
    
    private static boolean canPartitionP(int[] arr) {
    int sum = 0;
    for(int i:arr){
      sum+=i;
    }

    if(sum%2!=0){
      return false;
    }

    int subsetSum = sum/2;

    boolean dp[] = new boolean[subsetSum + 1];
    dp[0] = true;

    for(int num:arr){
      for(int j=subsetSum;j>=0;j--){
          if(j>=num){
           dp[j] = dp[j] | dp[j-num];   
          }
      }
    }
    
    return dp[subsetSum] ;
  }
}
