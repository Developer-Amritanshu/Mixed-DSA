// Single Number

public class Single_Number {
  public static void main(String[] args) {
    int[] arr = {1,2,2,3,3,4,4};
    int xor = 0;
    for(int i =0;i<arr.length;i++){
      xor ^= arr[i];
    }
    System.out.println(xor);
  }
}
