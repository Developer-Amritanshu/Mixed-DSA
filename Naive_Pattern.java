public class Naive_Pattern {
  public static void main(String[] args) {
    String str = "This is an example of string";
    String pattern = "example";
    searchPattern(str,pattern);
  }

  private static void searchPattern(String str, String pattern) {
    for(int i =0;i<(str.length()-pattern.length());i++){
      int j;
      for(j=0;j<pattern.length();j++){
        if(str.charAt(i+j)!=pattern.charAt(j)){
          break;
        }
      }
      if(j==pattern.length()){
        System.out.println("Pattern found at index "+i);
      }
    }
  }
}
