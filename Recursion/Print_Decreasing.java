import java.util.Scanner;

public class Print_Decreasing {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    printDecreasing(n);
    scn.close();
  }

  private static void printDecreasing(int n) {
    if(n==0){
      return;
    }
    System.out.println(n);
    printDecreasing(n-1);
  }

}
