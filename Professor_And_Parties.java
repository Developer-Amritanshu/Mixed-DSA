// Professor and Parties
class Solution {

  public static String PartyType(long arr[], int n)
  {
  HashMap<Integer,Integer> myHashMap = new HashMap<>();
   for(int i =0;i<arr.length;i++){
    if(!myHashMap.containsKey((int)arr[i])){
        myHashMap.put((int)arr[i], 0);
    }else{
      return "BOYS";
    }
  }
  return "GIRLS";
  }
}