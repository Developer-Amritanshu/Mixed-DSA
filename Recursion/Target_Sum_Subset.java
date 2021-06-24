import java.util.Scanner;

public class Target_Sum_Subset {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for(int i =0;i<arr.length;i++){
      arr[i] = scn.nextInt();
    }

    int tar = scn.nextInt();

    printTargetSum(arr,0,"",0,tar);

    scn.close();
  }

  private static void printTargetSum(int[] arr, int idx, String set, int sos, int tar) {
    if(idx == arr.length){
      if(sos==tar){
        System.out.println(set+".");
      }
      return;
    }
    printTargetSum(arr, idx+1, set+arr[idx]+",", sos+arr[idx], tar);
    printTargetSum(arr, idx+1, set, sos, tar);
  }
}
