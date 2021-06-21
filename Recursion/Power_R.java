// With Recursion

import java.util.Scanner;

public class Power_R {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();
    int n = scn.nextInt();
    int res = powerR(x,n);
    System.out.println(res);
    scn.close();
  }

  private static int powerR(int x, int n) {
    if(n==0){
      return 1;
    }
    int res = powerR(x, n-1);
    int finalAns = x * res;
    return finalAns;
  }
}
