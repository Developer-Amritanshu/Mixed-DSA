public class Dice_dp {
  public static void main(String[] args) {
    int n = 10;
    int[] cache = new int[n+1];
    int result = countWaysTab(0, 10);
    System.out.println(result);
  }


  // Top down - Memo
  private static int countWaysMemo(int currentValue, int endValue,int[] cache) {
    if(currentValue==endValue){
      return 1;
    }
    if(currentValue>endValue){
      return 0;
    }
    if(cache[currentValue]!=0){
      return cache[currentValue];
    }
    int count =0;
    for(int dice = 1;dice<=6;dice++){
      count = count + countWaysMemo(currentValue+dice, endValue,cache);
    }
    cache[currentValue] = count;
    return cache[currentValue];
  }

  // Bottom up - Tabulation
  static int countWaysTab(int start,int end){
    int[] arr = new int[end+1];
    arr[end] = 1;
    for(int i = end -1;i>=0;i--){
      int count = 0;
      for(int dice=1;dice<=6&&dice+i<arr.length;dice++){
        count = count+arr[dice+i];
      }
      arr[i] = count;
    }
    return arr[0];
  }

  // Naive
  private static int countWays(int currentValue, int endValue) {
    if(currentValue==endValue){
      return 1;
    }
    if(currentValue>endValue){
      return 0;
    }
    int count =0;
    for(int dice = 1;dice<=6;dice++){
      count = count + countWays(currentValue+dice, endValue);
    }
    return count;
  }
}
