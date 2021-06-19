class Solution {
  public boolean canJump(int[] nums) {
      int n = nums.length;
      int rechable = 0;
      for(int i =0;i<n;i++){
          if(rechable <i){
              return false;
          }
          rechable = Math.max(rechable,i+nums[i]);
      }
      return true;
      
  }
}
