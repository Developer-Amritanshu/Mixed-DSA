public class ATOI {
  public static void main(String[] args) {
    String num = "123";
    int idx =0;
    change(num,idx);
  }

  private static void change(String num, int idx) {
    if(num.length() == idx){
      return;
    }
    System.out.print(num.charAt(idx)-48);
    change(num,idx+1);
  }
}
