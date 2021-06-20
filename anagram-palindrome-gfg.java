class Sol
{
    int isPossible (String str)
    {
        // your code here
         char arr[] = str.toCharArray();
  int countArr[] = new int[256];

  int oddCount = 0;
  for(int i =0;i<arr.length;i++){
    countArr[arr[i]]++;
    if(countArr[arr[i]]%2 != 0){
      oddCount++;
    }else{
      oddCount--;
    }
  }
  if(oddCount==0){
      return 1;
  }
  if(oddCount!=1){
    return 0;
  }return 1;
    }
}
