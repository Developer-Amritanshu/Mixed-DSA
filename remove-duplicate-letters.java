// Remove Duplicate Letters From String

// Without Lexo and using LinkedHashMap

import java.util.LinkedHashMap;

public class Remove_Duplicate_Letters {
  public static void main(String[] args) {
    String s = "cbacdcbc";
    LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
    for(int i =0;i<s.length();i++){
      hm.put(s.charAt(i),1);
    }
    char[] c1 = new char[hm.size()];

    int k =0;
    for(Character c:hm.keySet()){
      c1[k] = c;
      k++;
    }

    String finalR = "";
    for(char c: c1){
      finalR+=c;
    }
    System.out.println(finalR);
  }
}
