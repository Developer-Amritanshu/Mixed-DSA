class Match_Pattern{
  public static void main(String[] args) {
    String str ="Leetcode";
    String pattern = "codl";
    boolean result = false;
    char s,p;
    for(int i=0;i<=(str.length()-pattern.length());i++){
      s = str.charAt(i);
      p = pattern.charAt(0);
      if(s==p){
        for(int j=i,k=0;j<i+str.length();j++,k++){
          s = str.charAt(j);
          p = pattern.charAt(k);
          if(s==p){
            result=true;
          }else{
            result=false;
            break;
          }
        }
      }
    }

    if(result){
            System.out.println("Patter Matched");
          }else{
            System.out.println("Pattern Not Matched");
          }

  }
}


// InBuilt Method
// class Match_Pattern{
//   public static void main(String[] args) {
//     String str ="Leetcode";
//     String pattern = "code";
//     boolean result = str.contains(pattern);
//     if(result){
//       System.out.println("Patter Matched");
//     }else{
//       System.out.println("Pattern Not Matched");
//     }
//   }
// }
