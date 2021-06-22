import java.util.ArrayList;

public class String_SubSeq {
  public static void main(String[] args) {
    String str = "abc";
    ArrayList<String> ans = printSS(str);
    System.out.println(ans);
  }

  private static ArrayList printSS(String str) {
    if(str.length()==0){
      ArrayList<String> br = new ArrayList<>();
      br.add("");
      return br;
    }
    char ch = str.charAt(0);
    String ros = str.substring(1);
    ArrayList<String> ans = printSS(ros);
    ArrayList<String> mres = new ArrayList<>();
    for(String istr: ans){
      mres.add(""+istr);
      mres.add(ch+istr);
    }
    return mres;
  }
}
