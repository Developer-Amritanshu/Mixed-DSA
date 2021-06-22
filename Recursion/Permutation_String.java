import java.util.ArrayList;

public class Permutation_String {
  public static void main(String[] args) {
    System.out.println(getPerm("abc"));
  }

  private static ArrayList<String> getPerm(String str) {
    if(str.length()==0){
      ArrayList<String> br = new ArrayList<>();
      br.add("");
      return br;
    }
    char ch = str.charAt(0);
    String ros = str.substring(1);
    ArrayList<String> ans = getPerm(ros);
    ArrayList<String> mres = new ArrayList<>();
    for(String istr: ans){
      for(int i =0;i<=istr.length();i++){
        StringBuffer sb = new StringBuffer(istr);
        sb.insert(i,ch);
        mres.add(sb.toString());
      }
    }
    return mres;
  }
}
