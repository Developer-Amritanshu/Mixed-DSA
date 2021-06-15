class Solution {
  public int removeDuplicates(int[] myArray) {
  int i = 0;
  for(int j =1;j<myArray.length;j++){
    if(myArray[i]!=myArray[j]){
      i++;
      myArray[i] = myArray[j];
    }
  }
      return i+1;
  }
}