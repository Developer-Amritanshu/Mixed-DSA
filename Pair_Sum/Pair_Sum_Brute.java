// Brute Force - O(n^2)

class Pair_Sum_Brute{
  public static void main(String[] args) {  
    int[] myArray = {7,8,6,5,4,2,15};
    int k = 9;
    int n = myArray.length;
    int sum = 0;
    
    for(int i=0;i<n-1;i++){
      for(int j = i+1;j<n;j++){
        sum = myArray[i] + myArray[j];
        if(sum == k){
          System.out.println(myArray[i] + " "+ myArray[j]);
        }
      }
    }
  }
}