// HASH TABLE
public class Pair_Sum_Hash {
  public static void main(String[] args) {
    int[] myArray = {7,8,6,5,4,2,15};
    int k = 9;
    
    int[] hash = new int[1000]; //constraint

    for(int i =0;i<myArray.length;i++){
      int index = k-myArray[i];
      if(hash[index] == 1){
        System.out.println(myArray[i]+" "+index);
      }else{
        hash[myArray[i]] = 1;
      }
    }
  }
}
