import java.util.Scanner;

public class Factorial_R {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int ans = fact(n);
    System.out.println(ans);
    scn.close();
  }

  private static int fact(int n) {
    if(n==1){
      return 1;
    }
    int fact = fact(n-1);
    int fn = n * fact;
    return fn;
  }
}
