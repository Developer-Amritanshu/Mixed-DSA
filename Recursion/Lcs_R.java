class Lcs_dp{
  public static void main(String[] args) {
    int len = lcs("ABCDGH0","AEDFHR");
    System.out.println(len);
  }

  static int lcs(String s1, String s2){

    // Termination Case
    if(s1.length()==0||s2.length()==0){
      return 0;
    }

    int count = 0;
    // case1 - when character are same
    if(s1.charAt(0)==s2.charAt(0)){
      count = 1 + lcs(s1.substring(1),s2.substring(1));
    }else{
      // case2 - when character are not same
      int result1 = lcs(s1.substring(1), s2); 
      int result2 = lcs(s1,s2.substring(1));
      count = Math.max(result1, result2);
    }
    return count;
  }
}
