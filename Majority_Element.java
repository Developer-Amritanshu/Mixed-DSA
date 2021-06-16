// Majority Elelment

public class Majority_Element {
  public static void main(String[] args) {
    int[] arr = {3,2,3};
    int OG = arr[0]; // Majority Element Initial
    int count = 0;
    for(int i =0;i<arr.length;i++){
      if(count==0){
       OG = arr[i]; 
      }
      if(arr[i]==OG){
        count++;
      }else{
        count--;
      }
    }

    System.out.println(OG);
  }
}

