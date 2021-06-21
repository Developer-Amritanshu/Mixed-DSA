import java.util.Scanner;

class Print_Dec_Inc{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    PDI(n);
    scn.close();
  }

  private static void PDI(int n) {
    if(n==0){
      return;
    }
    System.out.println(n);
    PDI(n-1);
    System.out.println(n);
  }
}
