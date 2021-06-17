class Solution {
    public int[] sortArrayByParity(int[] arr) {
        
    int i = 0;
    int j = arr.length -1;
    while(i<j){
      if(arr[i]%2==0){
        i++;
      }else if(arr[j]%2==0){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
        i++;
        j--;
      }else{
        j--;
      }
    }
        return arr;
    }
}
