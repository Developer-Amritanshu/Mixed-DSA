// Leaders in an array

class Solution{
  //Function to find the leaders in the array.
  static ArrayList<Integer> leaders(int arr[], int n){
      // Your code 
      ArrayList<Integer> myArrayList = new ArrayList<>();
      myArrayList.add(arr[arr.length-1]);
      int j = arr.length -1;
      for(int i=j-1;i>=0;i--){
          if(arr[i]>=arr[j]){
              myArrayList.add(arr[i]);
              j = i;
          }
      }
      Collections.reverse(myArrayList);
      return myArrayList;
  }
}
