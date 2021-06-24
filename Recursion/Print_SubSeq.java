import java.util.Scanner;

class Print_SubSeq{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    printSS(str,"");
    scn.close();
  }

  private static void printSS(String ques, String ans) {
    if(ques.length()==0){
      System.out.println(ans);
      return;
    }
    char ch = ques.charAt(0);
    String roq = ques.substring(1);

    printSS(roq,ans+"");
    printSS(roq,ans+ch);
  }
}
