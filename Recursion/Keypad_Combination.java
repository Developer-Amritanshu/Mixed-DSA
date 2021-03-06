import java.util.ArrayList;
import java.util.Scanner;

public class Keypad_Combination {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    ArrayList<String> words = getKPC(str);
    System.out.println(words);
    scn.close();
  }

  static String[] codes = {".;", "abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
  private static ArrayList<String> getKPC(String str) {
    
    if(str.length()==0){
      ArrayList<String> bres = new ArrayList<>();
      bres.add("");
      return bres;
    }

    // Input 678
    char ch = str.charAt(0); // 6
    String ros = str.substring(1); // 78

    ArrayList<String> rres = getKPC(ros); // 6 words of 78
    ArrayList<String> mres = new ArrayList<>(); // 24 of 678

    String codeforch = codes[ch-48];
    for(int i =0;i<codeforch.length();i++){
      char chcode = codeforch.charAt(i);
      for(String rstr: rres){
        mres.add(chcode+rstr);
      }
    }
    return mres;
  }
}
